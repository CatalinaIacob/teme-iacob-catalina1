package teme.util.java_util.plugin;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import teme.util.java_util.plugin.Grade;

public class GradeRunner extends BlockJUnit4ClassRunner {

    private final Class<?> testClass;
    private int maxGrade = 0;
    private int finalGrade = 0;

    public GradeRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
        this.testClass = testClass;
    }

    @Override
    public void run(RunNotifier notifier) {

        // Prepare observer notifier (for counting grades)
        RunNotifier wrapperNotifier = new RunNotifier() {

            @Override
            public void fireTestIgnored(Description description) {
                maxGrade += grade(description);
                notifier.fireTestIgnored(description);
            }

            @Override
            public void fireTestStarted(Description description) {
                maxGrade += grade(description);
                notifier.fireTestStarted(description);
            }

            @Override
            public void fireTestFailure(Failure failure) {
                finalGrade -= grade(failure.getDescription());
                notifier.fireTestFailure(failure);
            }

            @Override
            public void fireTestFinished(Description description) {
                finalGrade += grade(description);
                notifier.fireTestFinished(description);
            }
        };

        // Run the tests
        super.run(wrapperNotifier);

        // After run, create a fake successful test with the final grade in the description
        if (maxGrade > 0) {
            Description description = Description.createTestDescription(testClass,
                    String.format("[GRADE: %s/%s]", finalGrade, maxGrade));
            notifier.fireTestStarted(description);
            notifier.fireTestFinished(description);
        }
    }

    private int grade(Description description) {
        Grade grade = description.getAnnotation(Grade.class);
        return grade != null ? grade.value() : 0;
    }
}
