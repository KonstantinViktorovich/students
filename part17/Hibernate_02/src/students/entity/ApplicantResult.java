package students.entity;

public class ApplicantResult {

    private Long applicantResultId;
    private Applicant applicant;
    private Subject subject;
    private Integer mark;

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Long getApplicantResultId() {
        return applicantResultId;
    }

    public void setApplicantResultId(Long applicantResultId) {
        this.applicantResultId = applicantResultId;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
