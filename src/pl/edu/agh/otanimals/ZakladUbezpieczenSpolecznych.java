package pl.edu.agh.otanimals;

import java.util.Objects;

class ZakladUbezpieczenSpolecznych implements Institution {

  private final String name;

  ZakladUbezpieczenSpolecznych(String name) {
    this.name = name;
  }

  @Override
  public InstitutionType getInstitutionType() {
    return InstitutionType.SECOND_TYPE;
  }

  @Override
  public String toString() {
    return "PowiatowyUrzadPracy{" +
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
    ZakladUbezpieczenSpolecznych that = (ZakladUbezpieczenSpolecznych) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
