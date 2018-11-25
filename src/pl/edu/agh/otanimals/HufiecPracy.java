package pl.edu.agh.otanimals;

import java.util.Objects;

class HufiecPracy implements Institution {

  private final String name;

  HufiecPracy(String name) {
    this.name = name;
  }

  @Override
  public InstitutionType getInstitutionType() {
    return InstitutionType.FIRST_TYPE;
  }

  @Override
  public String toString() {
    return "HufiecPracy{" +
        "name='" + name + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HufiecPracy that = (HufiecPracy) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
