package pl.edu.agh.otanimals;

import static java.util.stream.Collectors.toList;

import java.util.List;

class Ministry {

  private List<Institution> institutions;

  Ministry(List<Institution> institutions) {
    this.institutions = institutions;
  }

  void pushNotification(Notification notification) {
    System.out.println("Pushed notification of type: " + notification.getInstitutionType());
    institutions.stream()
        .filter(
            institution -> institution.getInstitutionType() == notification.getInstitutionType())
        .forEach(institution -> institution.pullNotification(notification));
  }

  void registerInstitution(Institution institution) {
    System.out.println("Registering an institution: " + institution.toString());
    institutions.add(institution);
  }

  void unregister(Institution removableInstitution) {
    System.out.println("Unregistering an institution: " + removableInstitution.toString());
    institutions = institutions.stream()
        .filter(institution -> !institution.equals(removableInstitution))
        .collect(toList());
  }
}
