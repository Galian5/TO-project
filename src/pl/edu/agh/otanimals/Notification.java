package pl.edu.agh.otanimals;

class Notification {

  private final String subject;
  private final String body;
  private final InstitutionType institutionType;

  private Notification(Builder builder) {
    subject = builder.subject;
    body = builder.body;
    institutionType = builder.institutionType;
  }

  static Builder newBuilder() {
    return new Builder();
  }

  static class Builder {

    private String subject = "";
    private String body = "";
    private InstitutionType institutionType = InstitutionType.NONE;

    private Builder() {
    }

    Builder setSubject(String subject) {
      this.subject = subject;
      return this;
    }

    Builder setBody(String body) {
      this.body = body;
      return this;
    }

    Builder setInstitutionType(InstitutionType institutionType) {
      this.institutionType = institutionType;
      return this;
    }

    Notification build() {
      return new Notification(this);
    }
  }

  InstitutionType getInstitutionType() {
    return institutionType;
  }

  @Override
  public String toString() {
    return "Notification{" +
        "subject='" + subject + '\'' +
        ", body='" + body + '\'' +
        ", institutionType=" + institutionType +
        '}';
  }
}
