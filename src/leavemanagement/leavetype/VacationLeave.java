package leavemanagement.leavetype;

// VACA LEAVE
public class VacationLeave implements LeaveType {

    private int leaveTypeId = 1;
    private String leaveCode = "VL";
    private String leaveName = "Vacation Leave";
    private int maxDaysPerYear = 15;
    private int advancedNoticeDays = 7;
    private boolean isPaid = true;

    //GETTERS
    public int getLeaveTypeId() { return leaveTypeId; }

    public String getLeaveCode() {
        return leaveCode;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public int getMaxDaysPerYear() {
        return maxDaysPerYear;
    }

    public int getAdvancedNoticeDays() {
        return advancedNoticeDays;
    }

    public boolean isPaid() {
        return isPaid;
    }
}