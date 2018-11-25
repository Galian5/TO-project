package pl.edu.agh.otanimals;

import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {

    Notification firstNotification = Notification.newBuilder()
        .setSubject("Subject")
        .setBody("This notification is broadcasted to all institutions of first type.")
        .setInstitutionType(InstitutionType.FIRST_TYPE)
        .build();

    Notification secondNotification = Notification.newBuilder()
        .setSubject("Subject")
        .setInstitutionType(InstitutionType.SECOND_TYPE)
        .setBody("This notification is broadcasted to all institutions of second type.")
        .build();

    Ministry ministry = new Ministry(new LinkedList<>());

    ministry.registerInstitution(Institution.newInstitution("Hufiec Pracy"));
    ministry.registerInstitution(Institution.newInstitution("Powiatowy Urząd Pracy"));
    Institution institution = Institution.newInstitution("Ośrodek Pomocy Społecznej");
    ministry.registerInstitution(institution);
    ministry
        .registerInstitution(Institution.newInstitution("Zakład Ubezpieczeń społecznych"));

    ministry.pushNotification(firstNotification);
    ministry.pushNotification(secondNotification);

    ministry.unregister(institution);
  }
}
