package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivetrainSubsystem extends SubsystemBase {
    /**
     * The Singleton instance of this DrivetrainSubsystem. Code should use
     * the {@link #getInstance()} method to get the single instance (rather
     * than trying to construct an instance of this class.)
     * <p>
     * The INSTANCE field is volatile to ensure that multiple threads
     * offer it correctly when it is being initialized by ensuring changes
     * made in one thread are immediately reflected in other threads.
     */
    private volatile static DrivetrainSubsystem INSTANCE;

    /**
     * Returns the Singleton instance of this DrivetrainSubsystem. This static method
     * should be used, rather than the constructor, to get the single instance
     * of this class. For example: {@code DrivetrainSubsystem.getInstance();}
     */
    @SuppressWarnings("WeakerAccess")
    public static DrivetrainSubsystem getInstance() {
        // Use "Double Checked Locking" to ensure thread safety and best performance
        // Fast (non-synchronized) check to reduce overhead of acquiring a lock when it's not needed
        if (INSTANCE == null) {
            // Lock to make thread safe
            synchronized (DrivetrainSubsystem.class) {
                // check nullness again as multiple threads can reach and
                // pass the initial non-synchronized null check above
                if (INSTANCE == null) {
                    INSTANCE = new DrivetrainSubsystem();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * Creates a new instance of this DrivetrainSubsystem. This constructor
     * is private since this class is a Singleton. Code should use
     * the {@link #getInstance()} method to get the singleton instance.
     */
    private DrivetrainSubsystem() {
        // TODO: Set the default command, if any, for this subsystem by calling setDefaultCommand(command)
        //       in the constructor or in the robot coordination class, such as RobotContainer.
        //       Also, you can call addChild(name, sendableChild) to associate sendables with the subsystem
        //       such as SpeedControllers, Encoders, DigitalInputs, etc.
    }
}

