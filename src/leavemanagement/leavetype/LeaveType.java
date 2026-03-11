package leavemanagement.leavetype;

//changed from Abstract to Interface
//changed variable data types
public interface LeaveType {

    int getLeaveTypeId();

    String getLeaveCode();

    String getLeaveName();

    int getMaxDaysPerYear();

    int getAdvancedNoticeDays();

    boolean isPaid();
}