package pl.edu.agh.otanimals;

import java.util.Objects;

interface Institution {

  default InstitutionType getInstitutionType() {
    return InstitutionType.NONE;
  }

  default void pullNotification(Notification notification) {
    System.out.println("Received a notification: " + notification);
  }

  static Institution newInstitution(String name) {
    return new InstitutionImpl(name);
  }

  class InstitutionImpl implements Institution {

    private final String name;

    InstitutionImpl(String name) {
      this.name = name;
    }

    @Override
    public InstitutionType getInstitutionType() {
      return InstitutionType.FIRST_TYPE;
    }

    @Override
    public String toString() {
      return "InstitutionImpl{" +
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
      InstitutionImpl that = (InstitutionImpl) o;
      return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name);
    }
  }

}