package com.example.battledevback.models;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;


@Entity
public class User {
    /* ATTRIBUTES */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "firstname cannot be null")
    @NotEmpty
    private String firstname;

    @NotNull(message = "lastname cannot be null")
    @NotEmpty
    private String lastname;

    @NotNull(message = "email must be a valid email address")
    @NotEmpty
    @Email
    private String email;

    @NotNull(message = "Gender cannot be null")
    @NotEmpty
    private String gender;

    @NotNull(message = "DoB cannot be null")
    @Past(message = "DoB must be in the past")
    private LocalDate dateOfBirth;

//    geographic zone
    private String nationality;

    @PositiveOrZero
    private int zipCode;

    private String city;

    private String street;

//    fittings
    private String housing;

    @PositiveOrZero
    private int numberOfVehicles;

    private String internetServiceProvider;

    private String mobileOperator;

    private boolean subscribesToSportChannels;

//    family
    private String religion;

    @PositiveOrZero
    private int numberOfSiblings;

    private String civilStatus;

    private String sexualOrientation;

    @PositiveOrZero
    private int numberOfChildren;

    @PositiveOrZero
    private int numberOfPets;

//    health
    private boolean covidVaccinated;

    private boolean drinksAlcohol;

    private boolean smokesTobacco;

//    hobbies
    private boolean readsSportPress;

    private boolean watchSportShow;

    private boolean doesSport;

    private boolean playsFootball;

    private boolean goesToFootballStadium;

    private String favouriteFootballClub;

    private String favouriteFootballTeam;

    private boolean prefersFootballOverRugby;

    private boolean watchesFootballOnTV;

    private boolean watchesFootballOnMobilePhone;

    private boolean watchesFootballOnline;

    /* CONSTRUCTORS */
    public User(){}

    public User(String firstname, String lastname, String email, String gender, LocalDate dateOfBirth,
                String nationality, int zipCode, String city, String street, String housing,
                int numberOfVehicles, String internetServiceProvider, String mobileOperator,
                boolean subscribesToSportChannels, String religion, int numberOfSiblings, String civilStatus,
                String sexualOrientation, int numberOfChildren, int numberOfPets, boolean covidVaccinated,
                boolean drinksAlcohol, boolean smokesTobacco, boolean readsSportPress, boolean watchSportShow,
                boolean doesSport, boolean playsFootball, boolean goesToFootballStadium, String favouriteFootballClub,
                String favouriteFootballTeam, boolean prefersFootballOverRugby, boolean watchesFootballOnTV,
                boolean watchesFootballOnMobilePhone, boolean watchesFootballOnline)
    {
//        mandatory
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
//        optionnal
        this.nationality = nationality;
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
        this.housing = housing;
        this.numberOfVehicles = numberOfVehicles;
        this.internetServiceProvider = internetServiceProvider;
        this.mobileOperator = mobileOperator;
        this.subscribesToSportChannels = subscribesToSportChannels;
        this.religion = religion;
        this.numberOfSiblings = numberOfSiblings;
        this.civilStatus = civilStatus;
        this.sexualOrientation = sexualOrientation;
        this.numberOfChildren = numberOfChildren;
        this.numberOfPets = numberOfPets;
        this.covidVaccinated = covidVaccinated;
        this.drinksAlcohol = drinksAlcohol;
        this.smokesTobacco = smokesTobacco;
        this.readsSportPress = readsSportPress;
        this.watchSportShow = watchSportShow;
        this.doesSport = doesSport;
        this.playsFootball = playsFootball;
        this.goesToFootballStadium = goesToFootballStadium;
        this.favouriteFootballClub = favouriteFootballClub;
        this.favouriteFootballTeam = favouriteFootballTeam;
        this.prefersFootballOverRugby = prefersFootballOverRugby;
        this.watchesFootballOnTV = watchesFootballOnTV;
        this.watchesFootballOnMobilePhone = watchesFootballOnMobilePhone;
        this.watchesFootballOnline = watchesFootballOnline;
    }

    /* GETTERS AND SETTERS */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicules) {
        this.numberOfVehicles = numberOfVehicules;
    }

    public String getInternetServiceProvider() {
        return internetServiceProvider;
    }

    public void setInternetServiceProvider(String internetServiceProvider) {
        this.internetServiceProvider = internetServiceProvider;
    }

    public String getMobileOperator() {
        return mobileOperator;
    }

    public void setMobileOperator(String mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    public boolean isSubscribesToSportChannels() {
        return subscribesToSportChannels;
    }

    public void setSubscribesToSportChannels(boolean subscribesToSportChannels) {
        this.subscribesToSportChannels = subscribesToSportChannels;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getNumberOfSiblings() {
        return numberOfSiblings;
    }

    public void setNumberOfSiblings(int numberOfSiblings) {
        this.numberOfSiblings = numberOfSiblings;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }

    public void setSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public boolean isCovidVaccinated() {
        return covidVaccinated;
    }

    public void setCovidVaccinated(boolean covidVaccinated) {
        this.covidVaccinated = covidVaccinated;
    }

    public boolean isDrinksAlcohol() {
        return drinksAlcohol;
    }

    public void setDrinksAlcohol(boolean drinksAlcohol) {
        this.drinksAlcohol = drinksAlcohol;
    }

    public boolean isSmokesTobacco() {
        return smokesTobacco;
    }

    public void setSmokesTobacco(boolean smokesTobacco) {
        this.smokesTobacco = smokesTobacco;
    }

    public boolean isReadsSportPress() {
        return readsSportPress;
    }

    public void setReadsSportPress(boolean readsSportPress) {
        this.readsSportPress = readsSportPress;
    }

    public boolean isWatchSportShow() {
        return watchSportShow;
    }

    public void setWatchSportShow(boolean watchSportShow) {
        this.watchSportShow = watchSportShow;
    }

    public boolean isDoesSport() {
        return doesSport;
    }

    public void setDoesSport(boolean doesSport) {
        this.doesSport = doesSport;
    }

    public boolean isPlaysFootball() {
        return playsFootball;
    }

    public void setPlaysFootball(boolean playsFootball) {
        this.playsFootball = playsFootball;
    }

    public boolean isGoesToFootballStadium() {
        return goesToFootballStadium;
    }

    public void setGoesToFootballStadium(boolean goesToFootballStadium) {
        this.goesToFootballStadium = goesToFootballStadium;
    }

    public String getFavouriteFootballClub() {
        return favouriteFootballClub;
    }

    public void setFavouriteFootballClub(String favouriteFootballClub) {
        this.favouriteFootballClub = favouriteFootballClub;
    }

    public String getFavouriteFootballTeam() {
        return favouriteFootballTeam;
    }

    public void setFavouriteFootballTeam(String favouriteFootballTeam) {
        this.favouriteFootballTeam = favouriteFootballTeam;
    }

    public boolean isPrefersFootballOverRugby() {
        return prefersFootballOverRugby;
    }

    public void setPrefersFootballOverRugby(boolean prefersFootballOverRugby) {
        this.prefersFootballOverRugby = prefersFootballOverRugby;
    }

    public boolean isWatchesFootballOnTV() {
        return watchesFootballOnTV;
    }

    public void setWatchesFootballOnTV(boolean watchesFootballOnTV) {
        this.watchesFootballOnTV = watchesFootballOnTV;
    }

    public boolean isWatchesFootballOnMobilePhone() {
        return watchesFootballOnMobilePhone;
    }

    public void setWatchesFootballOnMobilePhone(boolean watchesFootballOnMobilePhone) {
        this.watchesFootballOnMobilePhone = watchesFootballOnMobilePhone;
    }

    public boolean isWatchesFootballOnline() {
        return watchesFootballOnline;
    }

    public void setWatchesFootballOnline(boolean watchesFootballOnline) {
        this.watchesFootballOnline = watchesFootballOnline;
    }
}
