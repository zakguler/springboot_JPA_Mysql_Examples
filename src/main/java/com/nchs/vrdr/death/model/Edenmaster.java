package com.nchs.vrdr.death.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the edenmaster database table.
 * 
 */
@Entity
@NamedQuery(name="Edenmaster.findAll", query="SELECT e FROM Edenmaster e")
public class Edenmaster implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Edenmaster() {
	}
	

	@Id
	private String statefilenumber;

	private String additionalcause1;

	private String additionalcause2;

	private String additionalinterval1;

	private String additionalinterval2;

	private String additionalintervalunit1;

	private String additionalintervalunit2;

	private String ageindays;

	private String ageinhours;

	private String ageinminutes;

	private String ageinmonths;

	private String ageinyears;

	private String agency1;

	private String agency2;

	private String agency3;

	private String agencycontact1;

	private String agencycontact2;

	private String agencycontact3;

	private String agencynotifiedby1;

	private String agencynotifiedby2;

	private String agencynotifiedby3;

	private String agencynotifiedccyy1;

	private String agencynotifiedccyy2;

	private String agencynotifiedccyy3;

	private String agencynotifieddd1;

	private String agencynotifieddd2;

	private String agencynotifieddd3;

	private String agencynotifiedmm1;

	private String agencynotifiedmm2;

	private String agencynotifiedmm3;

	private String agencynotifiedtimehh1;

	private String agencynotifiedtimehh2;

	private String agencynotifiedtimehh3;

	private String agencynotifiedtimemm1;

	private String agencynotifiedtimemm2;

	private String agencynotifiedtimemm3;

	private String agenumberofunits;

	private String ageunit;

	private String alias1first;

	private String alias1last;

	private String alias1middle;

	private String alias2first;

	private String alias2last;

	private String alias2middle;

	private String alternate1first;

	private String alternate1last;

	private String alternate1systemid;

	private String alternate1title;

	private String alternate2first;

	private String alternate2last;

	private String alternate2systemid;

	private String alternate2title;

	private String ambienttemp;

	private String ambienttemptimeHH;

	private String ambienttemptimeMM;

	private String ammunitioncaliber;

	private String ammunitionmake;

	private String ammunitionmakespecify;

	private String animal;

	private String armedforces;

	private String autopsyavailable;

	private String autopsydone;

	private String birthccyy;

	private String birthcity;

	private String birthcountry;

	private String birthcountryfips;

	private String birthcounty;

	private String birthdd;

	private String birthmm;

	private String birthstate;

	private String birthstatefilenumber;

	private String birthstatefips;

	private String blockscomment;

	private String bodyhold;

	private String bodyholdremovedccyy;

	private String bodyholdremoveddd;

	private String bodyholdremovedmm;

	private String bodyholdremovedtimehh;

	private String bodyholdremovedtimemm;

	private String bodypositionf;

	private String bodypositionh;

	private String bodypositionk;

	private String bodypositionl;

	private String bodypositiono;

	private String bodypositionp;

	private String bodypositionr;

	private String bodypositions;

	private String bodypositionspecify;

	private String bodypositionu;

	private String bodyreleasedby;

	private String bodyreleasedccyy;

	private String bodyreleaseddd;

	private String bodyreleasedmm;

	private String bodyreleasedtimehh;

	private String bodyreleasedtimemm;

	private String bodyreleasedto;

	private String bodytemp;

	private String bodytemptimehh;

	private String bodytemptimemm;

	private String brainfix;

	private String burialhomename;

	private String certcertdate;

	private String certcerttime;

	private String certcertuser;

	private String certeditdate;

	private String certedittime;

	private String certedituser;

	private String certifieraddress1;

	private String certifieraddress2;

	private String certifiercity;

	private String certifiercountry;

	private String certifierfullname;

	private String certifierlicense;

	private String certifiernotes1;

	private String certifiernotes2;

	private String certifierpreferredcontact;

	private String certifiersignature;

	private String certifiersignccyy;

	private String certifiersigndd;

	private String certifiersignmm;

	private String certifierstate;

	private String certifierstatus;

	private String certifieruser;

	private String certifierzip4;

	private String certifierzip5;

	private String certrelinquishdate;

	private String certrelinquishtime;

	private String certrelinquishuser;

	private String certstartdate;

	private String certstarttime;

	private String certstartuser;

	private String cityofdeath;

	private String cityofdeathfips;

	private String codLiteralcontrib1;

	private String codLiteralcontrib2;

	private String codLiteralcontrib3;

	private String codLiteralcontrib4;

	private String codLiteralcontrib5;

	private String codLiteralcontrib6;

	private String codLiteralcontrib7;

	private String codLiteralcontrib8;

	private String codLiteralcontrib9;

	private String codLiteralunderlying;

	private String contribcode1;

	private String contribcode2;

	private String contribcode3;

	private String contribcode4;

	private String contribcode5;

	private String contribcode6;

	private String contribcode7;

	private String contribcode8;

	private String contribcode9;

	private String countyofdeath;

	private String countyofdeathfips;

	private String courtdelayedflag;

	private String createddate;

	private String createdtime;

	private String createduser;

	private String dataimported;

	private String dateblocks1ccyy;

	private String dateblocks1dd;

	private String dateblocks1mm;

	private String dateblocks2ccyy;

	private String dateblocks2dd;

	private String dateblocks2mm;

	private String dateblocks3ccyy;

	private String dateblocks3dd;

	private String dateblocks3mm;

	private String datenp1ccyy;

	private String datenp1dd;

	private String datenp1mm;

	private String datenp2ccyy;

	private String datenp2dd;

	private String datenp2mm;

	private String datereportedccyy;

	private String datereporteddd;

	private String datereportedmm;

	private String dayslastseentodeath;

	private String dcPreorderdelivery;

	private String dcPreorderprinted;

	private String dcPreorderquantity;

	private String deathccyy;

	private String deathdd;

	private String deathmm;

	private String deathzip4;

	private String deathzip5;

	private String deceasedeyecolor;

	private String deceasedfirst;

	private String deceasedhaircolor;

	private String deceasedheightcm;

	private String deceasedheightinches;

	private String deceasedlast;

	private String deceasedmiddle;

	private String deceasedsuffix;

	private String deceasedweightkg;

	private String deceasedweightlbs;

	private String decompbloating;

	private String decompdiscoloration;

	private String decompmaggot;

	private String decompmummification;

	private String decompnone;

	private String decomposed;

	private String decompother;

	private String decompskeletonization;

	private String decompspecify;

	private String delayedflag;

	private String deleteddate;

	private String deletedtime;

	private String deleteduser;

	private String dentalxRays;

	private String descriptionofxRays;

	private String detectivename;

	private String dispatchccyy;

	private String dispatchdd;

	private String dispatchmm;

	private String dispatchtimehh;

	private String dispatchtimemm;

	private String dispositionburial;

	private String dispositionccyy;

	private String dispositioncemetery;

	private String dispositioncity;

	private String dispositioncountry;

	private String dispositioncounty;

	private String dispositioncremation;

	private String dispositiondd;

	private String dispositiondonation;

	private String dispositionentombment;

	private String dispositionmm;

	private String dispositionother;

	private String dispositionotherspec;

	private String dispositionremoval;

	private String dispositionstate;

	private String donoragency1;

	private String donoragency2;

	private String donoragency3;

	private String donoragencyspecify1;

	private String donoragencyspecify2;

	private String donoragencyspecify3;

	private String droppaperdate;

	private String droppapertime;

	private String droppaperuser;

	private String dupenamewarning;

	private String dwExportdate;

	private String dwsExportdate;

	private String edenrecord;

	private String education;

	private String employmentstatus;

	private String examassistant;

	private String examccyy;

	private String examdd;

	private String examinationtype;

	private String examlocation;

	private String examlocationspecify;

	private String exammd;

	private String exammdLicense;

	private String exammdType;

	private String exammm;

	private String examsummary;

	private String examsummary2;

	private String examtimehh;

	private String examtimemm;

	private String facilitycode;

	private String facilityname;

	private String fatherfirst;

	private String fatherlast;

	private String fathermiddle;

	private String fathersuffix;

	private String fhEditdate;

	private String fhEdittime;

	private String fhEdituser;

	private String fhRelinquishdate;

	private String fhRelinquishtime;

	private String fhRelinquishuser;

	private String fhSigndate;

	private String fhSigntime;

	private String fhSignuser;

	private String fhStartdate;

	private String fhStarttime;

	private String fhStartuser;

	private int fhirsentreceived;

	private String founddate;

	private String foundtime;

	private String funeraladdress1;

	private String funeraladdress2;

	private String funeralcity;

	private String funeralcounty;

	private String funeraldirlicense;

	private String funeraldirsignature;

	private String funeralhomeauthby;

	private String funeralhomecontactedname;

	private String funeralhomelicense;

	private String funeralhomename;

	private String funeralhomenotifby;

	private String funeralhomenotifccyy;

	private String funeralhomenotifdd;

	private String funeralhomenotifmm;

	private String funeralhomenotiftimehh;

	private String funeralhomenotiftimemm;

	private String funeralhomereleasedtoname;

	private String funeralhomestatus;

	private String funeralhomeuser;

	private String funeralnotes1;

	private String funeralnotes2;

	private String funeralstate;

	private String funeraltradecall;

	private String funeralzip4;

	private String funeralzip5;

	private String gender;

	private String gpsNorthcoordinate;

	private String gpsWestcoordinate;

	private String hazardouscase;

	private String hazardousreason;

	private String hazardousreasonspecify;

	private String hispaniccuban;

	private String hispanicmex;

	private String hispanicorigin;

	private String hispanicother;

	private String hispanicotherspec;

	private String hispanicpr;

	private String histology;

	private String holdreason;

	private String holdreasonspecify;

	private String identificationagency;

	private String identificationdateccyy;

	private String identificationdatedd;

	private String identificationdatemm;

	private String identificationmethod;

	private String identificationmethodspecify;

	private String identificationstatus;

	private String identifiedby;

	private String immediatecause;

	private String immediateinterval;

	private String immediateintervalunit;

	private String industry;

	private String industrycode;

	private String informant2address1;

	private String informant2address2;

	private String informant2city;

	private String informant2country;

	private String informant2county;

	private String informant2first;

	private String informant2last;

	private String informant2middle;

	private String informant2relation;

	private String informant2state;

	private String informant2suffix;

	private String informant2zip4;

	private String informant2zip5;

	private String informantaddress1;

	private String informantaddress2;

	private String informantcity;

	private String informantcountry;

	private String informantcounty;

	private String informantfirst;

	private String informantlast;

	private String informantmiddle;

	private String informantrelation;

	private String informantstate;

	private String informantsuffix;

	private String informantzip4;

	private String informantzip5;

	private String injury;

	private String injuryatwork;

	private String injuryccyy;

	private String injurycity;

	private String injurycityfips;

	private String injurycountry;

	private String injurycountryfips;

	private String injurycounty;

	private String injurycountyfips;

	private String injurydd;

	private String injurydescription1;

	private String injurydescription2;

	private String injurymm;

	private String injurymotorspec;

	private String injurymotorvehicle;

	private String injuryplace;

	private String injurystate;

	private String injurystatefips;

	private String injurystreet;

	private String injurytimehh;

	private String injurytimemm;

	private String injurywitnessed;

	private String injuryzip4;

	private String injuryzip5;

	private String invdayslastseentodeath;

	private String investigatoratscene;

	@Lob
	private String investigatorsummary;

	private String invinjury;

	private String invinjuryatwork;

	private String invinjuryccyy;

	private String invinjurycity;

	private String invinjurycountry;

	private String invinjurycounty;

	private String invinjurydd;

	private String invinjurydescription1;

	private String invinjurydescription2;

	private String invinjurymm;

	private String invinjurymotorspecify;

	private String invinjurymotorvehicle;

	private String invinjuryplace;

	private String invinjurystate;

	private String invinjurystreet;

	private String invinjurytimehh;

	private String invinjurytimemm;

	private String invlastseenccyy;

	private String invlastseendd;

	private String invlastseenmm;

	private String invpregnant;

	private String invtobacco;

	private String kinaddress1;

	private String kinaddress2;

	private String kinareacode;

	private String kincity;

	private String kincountry;

	private String kinfirst;

	private String kinlast;

	private String kinmiddle;

	private String kinnotes1;

	private String kinnotes2;

	private String kinnotifyby;

	private String kinnotifybyspecify;

	private String kinnotifyccyy;

	private String kinnotifydd;

	private String kinnotifymm;

	private String kinnotifytimehh;

	private String kinnotifytimemm;

	private String kinphonenumber;

	private String kinrelation;

	private String kinstate;

	private String kinsuffix;

	private String kinzip4;

	private String kinzip5;

	private String labchemistries;

	private String labcultures;

	private String labmetabolicscreen;

	private String labother;

	private String labotherspecify;

	private String labserology;

	private String labtoxdrawn;

	private String labvirology;

	private String lastseenaliveaddress;

	private String lastseenaliveby;

	private String lastseenaliveccyy;

	private String lastseenalivedd;

	private String lastseenalivemm;

	private String lastseenccyy;

	private String lastseendd;

	private String lastseenmm;

	private String lastupdated;

	private String lawenforcementagency;

	private String lawenforcementcasenumber;

	private String lhdNotes1;

	private String lhdNotes2;

	private String lividdistanterior;

	private String lividdistcaudal;

	private String lividdistleft;

	private String lividdistposterior;

	private String lividdistright;

	private String lividdistrostral;

	private String lividity;

	private String lividityfaint;

	private String lividityspecify;

	private String localmdAreacode;

	private String localmdCity;

	private String localmdFirst;

	private String localmdLast;

	private String localmdPhonenumber;

	private String lockedtouser;

	private String lockedtousername;

	private String mannerofdeath;

	private String maritalstatus;

	private String masterstatus;

	private String mdAtScene;

	private String meCasenumber;

	private String meContacted;

	private String meContactednotes;

	private String meReview;

	private String meType;

	private String medicalconditions1;

	private String medicalconditions2;

	private String medicalconditions3;

	private String medicalconditions4;

	private String medicalconditions5;

	private String medicalconditions6;

	private String micarExportdate;

	private String motherfirst;

	private String mothermaidenname;

	private String mothermiddle;

	private String mothersuffix;

	private String mrn;

	private String nchsExportdate;

	private String neverseenalive;

	private String nonfacilitylocation;

	private String npComment;

	private String numberblocks1;

	private String numberblocks2;

	private String numberblocks3;

	private String numbernp1;

	private String numbernp2;

	private String numberofxRays;

	private String nursinghomename;

	private String occupation;

	private String occupationcode;

	private String odontologistconfirmccyy;

	private String odontologistconfirmdd;

	private String odontologistconfirmmm;

	private String odontologistcontactccyy;

	private String odontologistcontactdd;

	private String odontologistcontactmm;

	private String odontologistname;

	private String omePhotosCd;

	private String omePhotosDownloaded;

	private String omePhotosEmailed;

	private String omePhotosOther;

	private String omePhotosSpecify;

	private String omeTransferdate;

	private String omeTransfertime;

	private String omeTransferuser;

	private String omeVideo;

	private String organsbone1;

	private String organsbone2;

	private String organsbone3;

	private String organseyes1;

	private String organseyes2;

	private String organseyes3;

	private String organsheartvalve1;

	private String organsheartvalve2;

	private String organsheartvalve3;

	private String organsskin1;

	private String organsskin2;

	private String organsskin3;

	private String organsvein1;

	private String organsvein2;

	private String organsvein3;

	private String organsvital1;

	private String organsvital2;

	private String organsvital3;

	private String otheragencyphotos;

	private String otheragencyvideos;

	private String othercasenumbers;

	private String otherconditions;

	private String placeofdeath;

	private String podOtherspec;

	private String pregnant;

	private String processingnote;

	private String raceamindian;

	private String raceasianindian;

	private String raceasianspec;

	private String raceblack;

	private String racechinese;

	private String racefilipino;

	private String raceguamanian;

	private String racehawaiian;

	private String raceislanderspec;

	private String racejapanese;

	private String racekorean;

	private String raceother;

	private String raceotherasian;

	private String raceotherspec;

	private String racepacislander;

	private String racesamoan;

	private String racetribespec;

	private String raceunknown;

	private String racevietnamese;

	private String racewhite;

	private String reasonrejected;

	private String receivedby;

	private String receivedccyy;

	private String receiveddd;

	private String receivedmm;

	private String receivedtimehh;

	private String receivedtimemm;

	private String recordtype;

	private String recoveryccyy1;

	private String recoveryccyy2;

	private String recoveryccyy3;

	private String recoverydd1;

	private String recoverydd2;

	private String recoverydd3;

	private String recoverylocation1;

	private String recoverylocation2;

	private String recoverylocation3;

	private String recoverymm1;

	private String recoverymm2;

	private String recoverymm3;

	private String recoverytechnician1;

	private String recoverytechnician2;

	private String recoverytechnician3;

	private String referredtome;

	private String registeredccyy;

	private String registereddate;

	private String registereddd;

	private String registeredmm;

	private String registeredtime;

	private String registereduser;

	private String rejecteddate;

	private String rejectedtime;

	private String rejecteduser;

	private String releaseauthorization;

	private String remains;

	private String reportedby;

	private String reportedto;

	private String reportedtoid;

	private String reportingagency;

	private String resareacode;

	private String rescity;

	private String rescityfips;

	private String rescountry;

	private String rescountryfips;

	private String rescounty;

	private String rescountyfips;

	private String resincitylimits;

	private String resname;

	private String resphonenumber;

	private String resstate;

	private String resstatefips;

	private String resstreetaddress1;

	private String resstreetaddress2;

	private String reszip4;

	private String reszip5;

	private String rigor;

	private String rigorspecify;

	private String rx1;

	private String rx10;

	private String rx11;

	private String rx12;

	private String rx2;

	private String rx3;

	private String rx4;

	private String rx5;

	private String rx6;

	private String rx7;

	private String rx8;

	private String rx9;

	private String sceneaddress;

	private String scenecity;

	private String scenecounty;

	private String scenedateccyy;

	private String scenedatedd;

	private String scenedatemm;

	private String scenestate;

	private String scenezip4;

	private String scenezip5;

	private String specialattentionfortox;

	private String specialattentionfortox2;

	private String spousefirst;

	private String spouselast;

	private String spousemiddle;

	private String spousesuffix;

	private String ssaDate;

	private String ssaExportdate;

//	private String status;

	private String ssn;

	private String stateofdeath;

//	private String stevMortalityExportdate;

//	private String stevRoster_Exportdate;

	private String suspectedcauseofdeath;

	private String suspectedmannerofdeath;

	private String sysnum;

	private String timearrivedscenehh;

	private String timearrivedscenemm;

	private String timelastseenalivehh;

	private String timelastseenalivemm;

	private String timeleftscenehh;

	private String timeleftscenemm;

	private String timeofdeathhh;

	private String timeofdeathmm;

	private String timereportedhh;

	private String timereportedmm;

	private String tobacco;

	private String totalblocks;

	private String totalnp;

	private String transferredfrom1;

	private String transferredfrom2;

	private String transferredfrom3;

	private String transportcompany1;

	private String transportcompany2;

	private String transportcompany3;

	private String typeofcase;

	private String typeofpartialautopsy;

	private String umedRace;

	private String umedrecord;

	private String underlyingcause;

	private String underlyingcode;

	private String underlyinginterval;

	private String underlyingintervalunit;

	private String vehiclecolor;

	private String vehiclelicensenumber;

	private String vehiclelicensestate;

	private String vehiclemake;

	private String vehiclemodel;

	private String vehicletype;

	private String weaponbarrellength;

	private String weaponcaliber;

	private String weaponmake;

	private String weaponmakespecify;

	private String weaponmodel;

	private String weaponserialnumber;

	private String weapontype;

	private String witness1;

	private String witness2;

	private String witness3;

	public String getStatefilenumber() {
		return statefilenumber;
	}

	public void setStatefilenumber(String statefilenumber) {
		this.statefilenumber = statefilenumber;
	}

	public String getAdditionalcause1() {
		return additionalcause1;
	}

	public void setAdditionalcause1(String additionalcause1) {
		this.additionalcause1 = additionalcause1;
	}

	public String getAdditionalcause2() {
		return additionalcause2;
	}

	public void setAdditionalcause2(String additionalcause2) {
		this.additionalcause2 = additionalcause2;
	}

	public String getAdditionalinterval1() {
		return additionalinterval1;
	}

	public void setAdditionalinterval1(String additionalinterval1) {
		this.additionalinterval1 = additionalinterval1;
	}

	public String getAdditionalinterval2() {
		return additionalinterval2;
	}

	public void setAdditionalinterval2(String additionalinterval2) {
		this.additionalinterval2 = additionalinterval2;
	}

	public String getAdditionalintervalunit1() {
		return additionalintervalunit1;
	}

	public void setAdditionalintervalunit1(String additionalintervalunit1) {
		this.additionalintervalunit1 = additionalintervalunit1;
	}

	public String getAdditionalintervalunit2() {
		return additionalintervalunit2;
	}

	public void setAdditionalintervalunit2(String additionalintervalunit2) {
		this.additionalintervalunit2 = additionalintervalunit2;
	}

	public String getAgeindays() {
		return ageindays;
	}

	public void setAgeindays(String ageindays) {
		this.ageindays = ageindays;
	}

	public String getAgeinhours() {
		return ageinhours;
	}

	public void setAgeinhours(String ageinhours) {
		this.ageinhours = ageinhours;
	}

	public String getAgeinminutes() {
		return ageinminutes;
	}

	public void setAgeinminutes(String ageinminutes) {
		this.ageinminutes = ageinminutes;
	}

	public String getAgeinmonths() {
		return ageinmonths;
	}

	public void setAgeinmonths(String ageinmonths) {
		this.ageinmonths = ageinmonths;
	}

	public String getAgeinyears() {
		return ageinyears;
	}

	public void setAgeinyears(String ageinyears) {
		this.ageinyears = ageinyears;
	}

	public String getAgency1() {
		return agency1;
	}

	public void setAgency1(String agency1) {
		this.agency1 = agency1;
	}

	public String getAgency2() {
		return agency2;
	}

	public void setAgency2(String agency2) {
		this.agency2 = agency2;
	}

	public String getAgency3() {
		return agency3;
	}

	public void setAgency3(String agency3) {
		this.agency3 = agency3;
	}

	public String getAgencycontact1() {
		return agencycontact1;
	}

	public void setAgencycontact1(String agencycontact1) {
		this.agencycontact1 = agencycontact1;
	}

	public String getAgencycontact2() {
		return agencycontact2;
	}

	public void setAgencycontact2(String agencycontact2) {
		this.agencycontact2 = agencycontact2;
	}

	public String getAgencycontact3() {
		return agencycontact3;
	}

	public void setAgencycontact3(String agencycontact3) {
		this.agencycontact3 = agencycontact3;
	}

	public String getAgencynotifiedby1() {
		return agencynotifiedby1;
	}

	public void setAgencynotifiedby1(String agencynotifiedby1) {
		this.agencynotifiedby1 = agencynotifiedby1;
	}

	public String getAgencynotifiedby2() {
		return agencynotifiedby2;
	}

	public void setAgencynotifiedby2(String agencynotifiedby2) {
		this.agencynotifiedby2 = agencynotifiedby2;
	}

	public String getAgencynotifiedby3() {
		return agencynotifiedby3;
	}

	public void setAgencynotifiedby3(String agencynotifiedby3) {
		this.agencynotifiedby3 = agencynotifiedby3;
	}

	public String getAgencynotifiedccyy1() {
		return agencynotifiedccyy1;
	}

	public void setAgencynotifiedccyy1(String agencynotifiedccyy1) {
		this.agencynotifiedccyy1 = agencynotifiedccyy1;
	}

	public String getAgencynotifiedccyy2() {
		return agencynotifiedccyy2;
	}

	public void setAgencynotifiedccyy2(String agencynotifiedccyy2) {
		this.agencynotifiedccyy2 = agencynotifiedccyy2;
	}

	public String getAgencynotifiedccyy3() {
		return agencynotifiedccyy3;
	}

	public void setAgencynotifiedccyy3(String agencynotifiedccyy3) {
		this.agencynotifiedccyy3 = agencynotifiedccyy3;
	}

	public String getAgencynotifieddd1() {
		return agencynotifieddd1;
	}

	public void setAgencynotifieddd1(String agencynotifieddd1) {
		this.agencynotifieddd1 = agencynotifieddd1;
	}

	public String getAgencynotifieddd2() {
		return agencynotifieddd2;
	}

	public void setAgencynotifieddd2(String agencynotifieddd2) {
		this.agencynotifieddd2 = agencynotifieddd2;
	}

	public String getAgencynotifieddd3() {
		return agencynotifieddd3;
	}

	public void setAgencynotifieddd3(String agencynotifieddd3) {
		this.agencynotifieddd3 = agencynotifieddd3;
	}

	public String getAgencynotifiedmm1() {
		return agencynotifiedmm1;
	}

	public void setAgencynotifiedmm1(String agencynotifiedmm1) {
		this.agencynotifiedmm1 = agencynotifiedmm1;
	}

	public String getAgencynotifiedmm2() {
		return agencynotifiedmm2;
	}

	public void setAgencynotifiedmm2(String agencynotifiedmm2) {
		this.agencynotifiedmm2 = agencynotifiedmm2;
	}

	public String getAgencynotifiedmm3() {
		return agencynotifiedmm3;
	}

	public void setAgencynotifiedmm3(String agencynotifiedmm3) {
		this.agencynotifiedmm3 = agencynotifiedmm3;
	}

	public String getAgencynotifiedtimehh1() {
		return agencynotifiedtimehh1;
	}

	public void setAgencynotifiedtimehh1(String agencynotifiedtimehh1) {
		this.agencynotifiedtimehh1 = agencynotifiedtimehh1;
	}

	public String getAgencynotifiedtimehh2() {
		return agencynotifiedtimehh2;
	}

	public void setAgencynotifiedtimehh2(String agencynotifiedtimehh2) {
		this.agencynotifiedtimehh2 = agencynotifiedtimehh2;
	}

	public String getAgencynotifiedtimehh3() {
		return agencynotifiedtimehh3;
	}

	public void setAgencynotifiedtimehh3(String agencynotifiedtimehh3) {
		this.agencynotifiedtimehh3 = agencynotifiedtimehh3;
	}

	public String getAgencynotifiedtimemm1() {
		return agencynotifiedtimemm1;
	}

	public void setAgencynotifiedtimemm1(String agencynotifiedtimemm1) {
		this.agencynotifiedtimemm1 = agencynotifiedtimemm1;
	}

	public String getAgencynotifiedtimemm2() {
		return agencynotifiedtimemm2;
	}

	public void setAgencynotifiedtimemm2(String agencynotifiedtimemm2) {
		this.agencynotifiedtimemm2 = agencynotifiedtimemm2;
	}

	public String getAgencynotifiedtimemm3() {
		return agencynotifiedtimemm3;
	}

	public void setAgencynotifiedtimemm3(String agencynotifiedtimemm3) {
		this.agencynotifiedtimemm3 = agencynotifiedtimemm3;
	}

	public String getAgenumberofunits() {
		return agenumberofunits;
	}

	public void setAgenumberofunits(String agenumberofunits) {
		this.agenumberofunits = agenumberofunits;
	}

	public String getAgeunit() {
		return ageunit;
	}

	public void setAgeunit(String ageunit) {
		this.ageunit = ageunit;
	}

	public String getAlias1first() {
		return alias1first;
	}

	public void setAlias1first(String alias1first) {
		this.alias1first = alias1first;
	}

	public String getAlias1last() {
		return alias1last;
	}

	public void setAlias1last(String alias1last) {
		this.alias1last = alias1last;
	}

	public String getAlias1middle() {
		return alias1middle;
	}

	public void setAlias1middle(String alias1middle) {
		this.alias1middle = alias1middle;
	}

	public String getAlias2first() {
		return alias2first;
	}

	public void setAlias2first(String alias2first) {
		this.alias2first = alias2first;
	}

	public String getAlias2last() {
		return alias2last;
	}

	public void setAlias2last(String alias2last) {
		this.alias2last = alias2last;
	}

	public String getAlias2middle() {
		return alias2middle;
	}

	public void setAlias2middle(String alias2middle) {
		this.alias2middle = alias2middle;
	}

	public String getAlternate1first() {
		return alternate1first;
	}

	public void setAlternate1first(String alternate1first) {
		this.alternate1first = alternate1first;
	}

	public String getAlternate1last() {
		return alternate1last;
	}

	public void setAlternate1last(String alternate1last) {
		this.alternate1last = alternate1last;
	}

	public String getAlternate1systemid() {
		return alternate1systemid;
	}

	public void setAlternate1systemid(String alternate1systemid) {
		this.alternate1systemid = alternate1systemid;
	}

	public String getAlternate1title() {
		return alternate1title;
	}

	public void setAlternate1title(String alternate1title) {
		this.alternate1title = alternate1title;
	}

	public String getAlternate2first() {
		return alternate2first;
	}

	public void setAlternate2first(String alternate2first) {
		this.alternate2first = alternate2first;
	}

	public String getAlternate2last() {
		return alternate2last;
	}

	public void setAlternate2last(String alternate2last) {
		this.alternate2last = alternate2last;
	}

	public String getAlternate2systemid() {
		return alternate2systemid;
	}

	public void setAlternate2systemid(String alternate2systemid) {
		this.alternate2systemid = alternate2systemid;
	}

	public String getAlternate2title() {
		return alternate2title;
	}

	public void setAlternate2title(String alternate2title) {
		this.alternate2title = alternate2title;
	}

	public String getAmbienttemp() {
		return ambienttemp;
	}

	public void setAmbienttemp(String ambienttemp) {
		this.ambienttemp = ambienttemp;
	}

	public String getAmbienttemptimeHH() {
		return ambienttemptimeHH;
	}

	public void setAmbienttemptimeHH(String ambienttemptimeHH) {
		this.ambienttemptimeHH = ambienttemptimeHH;
	}

	public String getAmbienttemptimeMM() {
		return ambienttemptimeMM;
	}

	public void setAmbienttemptimeMM(String ambienttemptimeMM) {
		this.ambienttemptimeMM = ambienttemptimeMM;
	}

	public String getAmmunitioncaliber() {
		return ammunitioncaliber;
	}

	public void setAmmunitioncaliber(String ammunitioncaliber) {
		this.ammunitioncaliber = ammunitioncaliber;
	}

	public String getAmmunitionmake() {
		return ammunitionmake;
	}

	public void setAmmunitionmake(String ammunitionmake) {
		this.ammunitionmake = ammunitionmake;
	}

	public String getAmmunitionmakespecify() {
		return ammunitionmakespecify;
	}

	public void setAmmunitionmakespecify(String ammunitionmakespecify) {
		this.ammunitionmakespecify = ammunitionmakespecify;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getArmedforces() {
		return armedforces;
	}

	public void setArmedforces(String armedforces) {
		this.armedforces = armedforces;
	}

	public String getAutopsyavailable() {
		return autopsyavailable;
	}

	public void setAutopsyavailable(String autopsyavailable) {
		this.autopsyavailable = autopsyavailable;
	}

	public String getAutopsydone() {
		return autopsydone;
	}

	public void setAutopsydone(String autopsydone) {
		this.autopsydone = autopsydone;
	}

	public String getBirthccyy() {
		return birthccyy;
	}

	public void setBirthccyy(String birthccyy) {
		this.birthccyy = birthccyy;
	}

	public String getBirthcity() {
		return birthcity;
	}

	public void setBirthcity(String birthcity) {
		this.birthcity = birthcity;
	}

	public String getBirthcountry() {
		return birthcountry;
	}

	public void setBirthcountry(String birthcountry) {
		this.birthcountry = birthcountry;
	}

	public String getBirthcountryfips() {
		return birthcountryfips;
	}

	public void setBirthcountryfips(String birthcountryfips) {
		this.birthcountryfips = birthcountryfips;
	}

	public String getBirthcounty() {
		return birthcounty;
	}

	public void setBirthcounty(String birthcounty) {
		this.birthcounty = birthcounty;
	}

	public String getBirthdd() {
		return birthdd;
	}

	public void setBirthdd(String birthdd) {
		this.birthdd = birthdd;
	}

	public String getBirthmm() {
		return birthmm;
	}

	public void setBirthmm(String birthmm) {
		this.birthmm = birthmm;
	}

	public String getBirthstate() {
		return birthstate;
	}

	public void setBirthstate(String birthstate) {
		this.birthstate = birthstate;
	}

	public String getBirthstatefilenumber() {
		return birthstatefilenumber;
	}

	public void setBirthstatefilenumber(String birthstatefilenumber) {
		this.birthstatefilenumber = birthstatefilenumber;
	}

	public String getBirthstatefips() {
		return birthstatefips;
	}

	public void setBirthstatefips(String birthstatefips) {
		this.birthstatefips = birthstatefips;
	}

	public String getBlockscomment() {
		return blockscomment;
	}

	public void setBlockscomment(String blockscomment) {
		this.blockscomment = blockscomment;
	}

	public String getBodyhold() {
		return bodyhold;
	}

	public void setBodyhold(String bodyhold) {
		this.bodyhold = bodyhold;
	}

	public String getBodyholdremovedccyy() {
		return bodyholdremovedccyy;
	}

	public void setBodyholdremovedccyy(String bodyholdremovedccyy) {
		this.bodyholdremovedccyy = bodyholdremovedccyy;
	}

	public String getBodyholdremoveddd() {
		return bodyholdremoveddd;
	}

	public void setBodyholdremoveddd(String bodyholdremoveddd) {
		this.bodyholdremoveddd = bodyholdremoveddd;
	}

	public String getBodyholdremovedmm() {
		return bodyholdremovedmm;
	}

	public void setBodyholdremovedmm(String bodyholdremovedmm) {
		this.bodyholdremovedmm = bodyholdremovedmm;
	}

	public String getBodyholdremovedtimehh() {
		return bodyholdremovedtimehh;
	}

	public void setBodyholdremovedtimehh(String bodyholdremovedtimehh) {
		this.bodyholdremovedtimehh = bodyholdremovedtimehh;
	}

	public String getBodyholdremovedtimemm() {
		return bodyholdremovedtimemm;
	}

	public void setBodyholdremovedtimemm(String bodyholdremovedtimemm) {
		this.bodyholdremovedtimemm = bodyholdremovedtimemm;
	}

	public String getBodypositionf() {
		return bodypositionf;
	}

	public void setBodypositionf(String bodypositionf) {
		this.bodypositionf = bodypositionf;
	}

	public String getBodypositionh() {
		return bodypositionh;
	}

	public void setBodypositionh(String bodypositionh) {
		this.bodypositionh = bodypositionh;
	}

	public String getBodypositionk() {
		return bodypositionk;
	}

	public void setBodypositionk(String bodypositionk) {
		this.bodypositionk = bodypositionk;
	}

	public String getBodypositionl() {
		return bodypositionl;
	}

	public void setBodypositionl(String bodypositionl) {
		this.bodypositionl = bodypositionl;
	}

	public String getBodypositiono() {
		return bodypositiono;
	}

	public void setBodypositiono(String bodypositiono) {
		this.bodypositiono = bodypositiono;
	}

	public String getBodypositionp() {
		return bodypositionp;
	}

	public void setBodypositionp(String bodypositionp) {
		this.bodypositionp = bodypositionp;
	}

	public String getBodypositionr() {
		return bodypositionr;
	}

	public void setBodypositionr(String bodypositionr) {
		this.bodypositionr = bodypositionr;
	}

	public String getBodypositions() {
		return bodypositions;
	}

	public void setBodypositions(String bodypositions) {
		this.bodypositions = bodypositions;
	}

	public String getBodypositionspecify() {
		return bodypositionspecify;
	}

	public void setBodypositionspecify(String bodypositionspecify) {
		this.bodypositionspecify = bodypositionspecify;
	}

	public String getBodypositionu() {
		return bodypositionu;
	}

	public void setBodypositionu(String bodypositionu) {
		this.bodypositionu = bodypositionu;
	}

	public String getBodyreleasedby() {
		return bodyreleasedby;
	}

	public void setBodyreleasedby(String bodyreleasedby) {
		this.bodyreleasedby = bodyreleasedby;
	}

	public String getBodyreleasedccyy() {
		return bodyreleasedccyy;
	}

	public void setBodyreleasedccyy(String bodyreleasedccyy) {
		this.bodyreleasedccyy = bodyreleasedccyy;
	}

	public String getBodyreleaseddd() {
		return bodyreleaseddd;
	}

	public void setBodyreleaseddd(String bodyreleaseddd) {
		this.bodyreleaseddd = bodyreleaseddd;
	}

	public String getBodyreleasedmm() {
		return bodyreleasedmm;
	}

	public void setBodyreleasedmm(String bodyreleasedmm) {
		this.bodyreleasedmm = bodyreleasedmm;
	}

	public String getBodyreleasedtimehh() {
		return bodyreleasedtimehh;
	}

	public void setBodyreleasedtimehh(String bodyreleasedtimehh) {
		this.bodyreleasedtimehh = bodyreleasedtimehh;
	}

	public String getBodyreleasedtimemm() {
		return bodyreleasedtimemm;
	}

	public void setBodyreleasedtimemm(String bodyreleasedtimemm) {
		this.bodyreleasedtimemm = bodyreleasedtimemm;
	}

	public String getBodyreleasedto() {
		return bodyreleasedto;
	}

	public void setBodyreleasedto(String bodyreleasedto) {
		this.bodyreleasedto = bodyreleasedto;
	}

	public String getBodytemp() {
		return bodytemp;
	}

	public void setBodytemp(String bodytemp) {
		this.bodytemp = bodytemp;
	}

	public String getBodytemptimehh() {
		return bodytemptimehh;
	}

	public void setBodytemptimehh(String bodytemptimehh) {
		this.bodytemptimehh = bodytemptimehh;
	}

	public String getBodytemptimemm() {
		return bodytemptimemm;
	}

	public void setBodytemptimemm(String bodytemptimemm) {
		this.bodytemptimemm = bodytemptimemm;
	}

	public String getBrainfix() {
		return brainfix;
	}

	public void setBrainfix(String brainfix) {
		this.brainfix = brainfix;
	}

	public String getBurialhomename() {
		return burialhomename;
	}

	public void setBurialhomename(String burialhomename) {
		this.burialhomename = burialhomename;
	}

	public String getCertcertdate() {
		return certcertdate;
	}

	public void setCertcertdate(String certcertdate) {
		this.certcertdate = certcertdate;
	}

	public String getCertcerttime() {
		return certcerttime;
	}

	public void setCertcerttime(String certcerttime) {
		this.certcerttime = certcerttime;
	}

	public String getCertcertuser() {
		return certcertuser;
	}

	public void setCertcertuser(String certcertuser) {
		this.certcertuser = certcertuser;
	}

	public String getCerteditdate() {
		return certeditdate;
	}

	public void setCerteditdate(String certeditdate) {
		this.certeditdate = certeditdate;
	}

	public String getCertedittime() {
		return certedittime;
	}

	public void setCertedittime(String certedittime) {
		this.certedittime = certedittime;
	}

	public String getCertedituser() {
		return certedituser;
	}

	public void setCertedituser(String certedituser) {
		this.certedituser = certedituser;
	}

	public String getCertifieraddress1() {
		return certifieraddress1;
	}

	public void setCertifieraddress1(String certifieraddress1) {
		this.certifieraddress1 = certifieraddress1;
	}

	public String getCertifieraddress2() {
		return certifieraddress2;
	}

	public void setCertifieraddress2(String certifieraddress2) {
		this.certifieraddress2 = certifieraddress2;
	}

	public String getCertifiercity() {
		return certifiercity;
	}

	public void setCertifiercity(String certifiercity) {
		this.certifiercity = certifiercity;
	}

	public String getCertifiercountry() {
		return certifiercountry;
	}

	public void setCertifiercountry(String certifiercountry) {
		this.certifiercountry = certifiercountry;
	}

	public String getCertifierfullname() {
		return certifierfullname;
	}

	public void setCertifierfullname(String certifierfullname) {
		this.certifierfullname = certifierfullname;
	}

	public String getCertifierlicense() {
		return certifierlicense;
	}

	public void setCertifierlicense(String certifierlicense) {
		this.certifierlicense = certifierlicense;
	}

	public String getCertifiernotes1() {
		return certifiernotes1;
	}

	public void setCertifiernotes1(String certifiernotes1) {
		this.certifiernotes1 = certifiernotes1;
	}

	public String getCertifiernotes2() {
		return certifiernotes2;
	}

	public void setCertifiernotes2(String certifiernotes2) {
		this.certifiernotes2 = certifiernotes2;
	}

	public String getCertifierpreferredcontact() {
		return certifierpreferredcontact;
	}

	public void setCertifierpreferredcontact(String certifierpreferredcontact) {
		this.certifierpreferredcontact = certifierpreferredcontact;
	}

	public String getCertifiersignature() {
		return certifiersignature;
	}

	public void setCertifiersignature(String certifiersignature) {
		this.certifiersignature = certifiersignature;
	}

	public String getCertifiersignccyy() {
		return certifiersignccyy;
	}

	public void setCertifiersignccyy(String certifiersignccyy) {
		this.certifiersignccyy = certifiersignccyy;
	}

	public String getCertifiersigndd() {
		return certifiersigndd;
	}

	public void setCertifiersigndd(String certifiersigndd) {
		this.certifiersigndd = certifiersigndd;
	}

	public String getCertifiersignmm() {
		return certifiersignmm;
	}

	public void setCertifiersignmm(String certifiersignmm) {
		this.certifiersignmm = certifiersignmm;
	}

	public String getCertifierstate() {
		return certifierstate;
	}

	public void setCertifierstate(String certifierstate) {
		this.certifierstate = certifierstate;
	}

	public String getCertifierstatus() {
		return certifierstatus;
	}

	public void setCertifierstatus(String certifierstatus) {
		this.certifierstatus = certifierstatus;
	}

	public String getCertifieruser() {
		return certifieruser;
	}

	public void setCertifieruser(String certifieruser) {
		this.certifieruser = certifieruser;
	}

	public String getCertifierzip4() {
		return certifierzip4;
	}

	public void setCertifierzip4(String certifierzip4) {
		this.certifierzip4 = certifierzip4;
	}

	public String getCertifierzip5() {
		return certifierzip5;
	}

	public void setCertifierzip5(String certifierzip5) {
		this.certifierzip5 = certifierzip5;
	}

	public String getCertrelinquishdate() {
		return certrelinquishdate;
	}

	public void setCertrelinquishdate(String certrelinquishdate) {
		this.certrelinquishdate = certrelinquishdate;
	}

	public String getCertrelinquishtime() {
		return certrelinquishtime;
	}

	public void setCertrelinquishtime(String certrelinquishtime) {
		this.certrelinquishtime = certrelinquishtime;
	}

	public String getCertrelinquishuser() {
		return certrelinquishuser;
	}

	public void setCertrelinquishuser(String certrelinquishuser) {
		this.certrelinquishuser = certrelinquishuser;
	}

	public String getCertstartdate() {
		return certstartdate;
	}

	public void setCertstartdate(String certstartdate) {
		this.certstartdate = certstartdate;
	}

	public String getCertstarttime() {
		return certstarttime;
	}

	public void setCertstarttime(String certstarttime) {
		this.certstarttime = certstarttime;
	}

	public String getCertstartuser() {
		return certstartuser;
	}

	public void setCertstartuser(String certstartuser) {
		this.certstartuser = certstartuser;
	}

	public String getCityofdeath() {
		return cityofdeath;
	}

	public void setCityofdeath(String cityofdeath) {
		this.cityofdeath = cityofdeath;
	}

	public String getCityofdeathfips() {
		return cityofdeathfips;
	}

	public void setCityofdeathfips(String cityofdeathfips) {
		this.cityofdeathfips = cityofdeathfips;
	}

	public String getCodLiteralcontrib1() {
		return codLiteralcontrib1;
	}

	public void setCodLiteralcontrib1(String codLiteralcontrib1) {
		this.codLiteralcontrib1 = codLiteralcontrib1;
	}

	public String getCodLiteralcontrib2() {
		return codLiteralcontrib2;
	}

	public void setCodLiteralcontrib2(String codLiteralcontrib2) {
		this.codLiteralcontrib2 = codLiteralcontrib2;
	}

	public String getCodLiteralcontrib3() {
		return codLiteralcontrib3;
	}

	public void setCodLiteralcontrib3(String codLiteralcontrib3) {
		this.codLiteralcontrib3 = codLiteralcontrib3;
	}

	public String getCodLiteralcontrib4() {
		return codLiteralcontrib4;
	}

	public void setCodLiteralcontrib4(String codLiteralcontrib4) {
		this.codLiteralcontrib4 = codLiteralcontrib4;
	}

	public String getCodLiteralcontrib5() {
		return codLiteralcontrib5;
	}

	public void setCodLiteralcontrib5(String codLiteralcontrib5) {
		this.codLiteralcontrib5 = codLiteralcontrib5;
	}

	public String getCodLiteralcontrib6() {
		return codLiteralcontrib6;
	}

	public void setCodLiteralcontrib6(String codLiteralcontrib6) {
		this.codLiteralcontrib6 = codLiteralcontrib6;
	}

	public String getCodLiteralcontrib7() {
		return codLiteralcontrib7;
	}

	public void setCodLiteralcontrib7(String codLiteralcontrib7) {
		this.codLiteralcontrib7 = codLiteralcontrib7;
	}

	public String getCodLiteralcontrib8() {
		return codLiteralcontrib8;
	}

	public void setCodLiteralcontrib8(String codLiteralcontrib8) {
		this.codLiteralcontrib8 = codLiteralcontrib8;
	}

	public String getCodLiteralcontrib9() {
		return codLiteralcontrib9;
	}

	public void setCodLiteralcontrib9(String codLiteralcontrib9) {
		this.codLiteralcontrib9 = codLiteralcontrib9;
	}

	public String getCodLiteralunderlying() {
		return codLiteralunderlying;
	}

	public void setCodLiteralunderlying(String codLiteralunderlying) {
		this.codLiteralunderlying = codLiteralunderlying;
	}

	public String getContribcode1() {
		return contribcode1;
	}

	public void setContribcode1(String contribcode1) {
		this.contribcode1 = contribcode1;
	}

	public String getContribcode2() {
		return contribcode2;
	}

	public void setContribcode2(String contribcode2) {
		this.contribcode2 = contribcode2;
	}

	public String getContribcode3() {
		return contribcode3;
	}

	public void setContribcode3(String contribcode3) {
		this.contribcode3 = contribcode3;
	}

	public String getContribcode4() {
		return contribcode4;
	}

	public void setContribcode4(String contribcode4) {
		this.contribcode4 = contribcode4;
	}

	public String getContribcode5() {
		return contribcode5;
	}

	public void setContribcode5(String contribcode5) {
		this.contribcode5 = contribcode5;
	}

	public String getContribcode6() {
		return contribcode6;
	}

	public void setContribcode6(String contribcode6) {
		this.contribcode6 = contribcode6;
	}

	public String getContribcode7() {
		return contribcode7;
	}

	public void setContribcode7(String contribcode7) {
		this.contribcode7 = contribcode7;
	}

	public String getContribcode8() {
		return contribcode8;
	}

	public void setContribcode8(String contribcode8) {
		this.contribcode8 = contribcode8;
	}

	public String getContribcode9() {
		return contribcode9;
	}

	public void setContribcode9(String contribcode9) {
		this.contribcode9 = contribcode9;
	}

	public String getCountyofdeath() {
		return countyofdeath;
	}

	public void setCountyofdeath(String countyofdeath) {
		this.countyofdeath = countyofdeath;
	}

	public String getCountyofdeathfips() {
		return countyofdeathfips;
	}

	public void setCountyofdeathfips(String countyofdeathfips) {
		this.countyofdeathfips = countyofdeathfips;
	}

	public String getCourtdelayedflag() {
		return courtdelayedflag;
	}

	public void setCourtdelayedflag(String courtdelayedflag) {
		this.courtdelayedflag = courtdelayedflag;
	}

	public String getCreateddate() {
		return createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	public String getCreatedtime() {
		return createdtime;
	}

	public void setCreatedtime(String createdtime) {
		this.createdtime = createdtime;
	}

	public String getCreateduser() {
		return createduser;
	}

	public void setCreateduser(String createduser) {
		this.createduser = createduser;
	}

	public String getDataimported() {
		return dataimported;
	}

	public void setDataimported(String dataimported) {
		this.dataimported = dataimported;
	}

	public String getDateblocks1ccyy() {
		return dateblocks1ccyy;
	}

	public void setDateblocks1ccyy(String dateblocks1ccyy) {
		this.dateblocks1ccyy = dateblocks1ccyy;
	}

	public String getDateblocks1dd() {
		return dateblocks1dd;
	}

	public void setDateblocks1dd(String dateblocks1dd) {
		this.dateblocks1dd = dateblocks1dd;
	}

	public String getDateblocks1mm() {
		return dateblocks1mm;
	}

	public void setDateblocks1mm(String dateblocks1mm) {
		this.dateblocks1mm = dateblocks1mm;
	}

	public String getDateblocks2ccyy() {
		return dateblocks2ccyy;
	}

	public void setDateblocks2ccyy(String dateblocks2ccyy) {
		this.dateblocks2ccyy = dateblocks2ccyy;
	}

	public String getDateblocks2dd() {
		return dateblocks2dd;
	}

	public void setDateblocks2dd(String dateblocks2dd) {
		this.dateblocks2dd = dateblocks2dd;
	}

	public String getDateblocks2mm() {
		return dateblocks2mm;
	}

	public void setDateblocks2mm(String dateblocks2mm) {
		this.dateblocks2mm = dateblocks2mm;
	}

	public String getDateblocks3ccyy() {
		return dateblocks3ccyy;
	}

	public void setDateblocks3ccyy(String dateblocks3ccyy) {
		this.dateblocks3ccyy = dateblocks3ccyy;
	}

	public String getDateblocks3dd() {
		return dateblocks3dd;
	}

	public void setDateblocks3dd(String dateblocks3dd) {
		this.dateblocks3dd = dateblocks3dd;
	}

	public String getDateblocks3mm() {
		return dateblocks3mm;
	}

	public void setDateblocks3mm(String dateblocks3mm) {
		this.dateblocks3mm = dateblocks3mm;
	}

	public String getDatenp1ccyy() {
		return datenp1ccyy;
	}

	public void setDatenp1ccyy(String datenp1ccyy) {
		this.datenp1ccyy = datenp1ccyy;
	}

	public String getDatenp1dd() {
		return datenp1dd;
	}

	public void setDatenp1dd(String datenp1dd) {
		this.datenp1dd = datenp1dd;
	}

	public String getDatenp1mm() {
		return datenp1mm;
	}

	public void setDatenp1mm(String datenp1mm) {
		this.datenp1mm = datenp1mm;
	}

	public String getDatenp2ccyy() {
		return datenp2ccyy;
	}

	public void setDatenp2ccyy(String datenp2ccyy) {
		this.datenp2ccyy = datenp2ccyy;
	}

	public String getDatenp2dd() {
		return datenp2dd;
	}

	public void setDatenp2dd(String datenp2dd) {
		this.datenp2dd = datenp2dd;
	}

	public String getDatenp2mm() {
		return datenp2mm;
	}

	public void setDatenp2mm(String datenp2mm) {
		this.datenp2mm = datenp2mm;
	}

	public String getDatereportedccyy() {
		return datereportedccyy;
	}

	public void setDatereportedccyy(String datereportedccyy) {
		this.datereportedccyy = datereportedccyy;
	}

	public String getDatereporteddd() {
		return datereporteddd;
	}

	public void setDatereporteddd(String datereporteddd) {
		this.datereporteddd = datereporteddd;
	}

	public String getDatereportedmm() {
		return datereportedmm;
	}

	public void setDatereportedmm(String datereportedmm) {
		this.datereportedmm = datereportedmm;
	}

	public String getDayslastseentodeath() {
		return dayslastseentodeath;
	}

	public void setDayslastseentodeath(String dayslastseentodeath) {
		this.dayslastseentodeath = dayslastseentodeath;
	}

	public String getDcPreorderdelivery() {
		return dcPreorderdelivery;
	}

	public void setDcPreorderdelivery(String dcPreorderdelivery) {
		this.dcPreorderdelivery = dcPreorderdelivery;
	}

	public String getDcPreorderprinted() {
		return dcPreorderprinted;
	}

	public void setDcPreorderprinted(String dcPreorderprinted) {
		this.dcPreorderprinted = dcPreorderprinted;
	}

	public String getDcPreorderquantity() {
		return dcPreorderquantity;
	}

	public void setDcPreorderquantity(String dcPreorderquantity) {
		this.dcPreorderquantity = dcPreorderquantity;
	}

	public String getDeathccyy() {
		return deathccyy;
	}

	public void setDeathccyy(String deathccyy) {
		this.deathccyy = deathccyy;
	}

	public String getDeathdd() {
		return deathdd;
	}

	public void setDeathdd(String deathdd) {
		this.deathdd = deathdd;
	}

	public String getDeathmm() {
		return deathmm;
	}

	public void setDeathmm(String deathmm) {
		this.deathmm = deathmm;
	}

	public String getDeathzip4() {
		return deathzip4;
	}

	public void setDeathzip4(String deathzip4) {
		this.deathzip4 = deathzip4;
	}

	public String getDeathzip5() {
		return deathzip5;
	}

	public void setDeathzip5(String deathzip5) {
		this.deathzip5 = deathzip5;
	}

	public String getDeceasedeyecolor() {
		return deceasedeyecolor;
	}

	public void setDeceasedeyecolor(String deceasedeyecolor) {
		this.deceasedeyecolor = deceasedeyecolor;
	}

	public String getDeceasedfirst() {
		return deceasedfirst;
	}

	public void setDeceasedfirst(String deceasedfirst) {
		this.deceasedfirst = deceasedfirst;
	}

	public String getDeceasedhaircolor() {
		return deceasedhaircolor;
	}

	public void setDeceasedhaircolor(String deceasedhaircolor) {
		this.deceasedhaircolor = deceasedhaircolor;
	}

	public String getDeceasedheightcm() {
		return deceasedheightcm;
	}

	public void setDeceasedheightcm(String deceasedheightcm) {
		this.deceasedheightcm = deceasedheightcm;
	}

	public String getDeceasedheightinches() {
		return deceasedheightinches;
	}

	public void setDeceasedheightinches(String deceasedheightinches) {
		this.deceasedheightinches = deceasedheightinches;
	}

	public String getDeceasedlast() {
		return deceasedlast;
	}

	public void setDeceasedlast(String deceasedlast) {
		this.deceasedlast = deceasedlast;
	}

	public String getDeceasedmiddle() {
		return deceasedmiddle;
	}

	public void setDeceasedmiddle(String deceasedmiddle) {
		this.deceasedmiddle = deceasedmiddle;
	}

	public String getDeceasedsuffix() {
		return deceasedsuffix;
	}

	public void setDeceasedsuffix(String deceasedsuffix) {
		this.deceasedsuffix = deceasedsuffix;
	}

	public String getDeceasedweightkg() {
		return deceasedweightkg;
	}

	public void setDeceasedweightkg(String deceasedweightkg) {
		this.deceasedweightkg = deceasedweightkg;
	}

	public String getDeceasedweightlbs() {
		return deceasedweightlbs;
	}

	public void setDeceasedweightlbs(String deceasedweightlbs) {
		this.deceasedweightlbs = deceasedweightlbs;
	}

	public String getDecompbloating() {
		return decompbloating;
	}

	public void setDecompbloating(String decompbloating) {
		this.decompbloating = decompbloating;
	}

	public String getDecompdiscoloration() {
		return decompdiscoloration;
	}

	public void setDecompdiscoloration(String decompdiscoloration) {
		this.decompdiscoloration = decompdiscoloration;
	}

	public String getDecompmaggot() {
		return decompmaggot;
	}

	public void setDecompmaggot(String decompmaggot) {
		this.decompmaggot = decompmaggot;
	}

	public String getDecompmummification() {
		return decompmummification;
	}

	public void setDecompmummification(String decompmummification) {
		this.decompmummification = decompmummification;
	}

	public String getDecompnone() {
		return decompnone;
	}

	public void setDecompnone(String decompnone) {
		this.decompnone = decompnone;
	}

	public String getDecomposed() {
		return decomposed;
	}

	public void setDecomposed(String decomposed) {
		this.decomposed = decomposed;
	}

	public String getDecompother() {
		return decompother;
	}

	public void setDecompother(String decompother) {
		this.decompother = decompother;
	}

	public String getDecompskeletonization() {
		return decompskeletonization;
	}

	public void setDecompskeletonization(String decompskeletonization) {
		this.decompskeletonization = decompskeletonization;
	}

	public String getDecompspecify() {
		return decompspecify;
	}

	public void setDecompspecify(String decompspecify) {
		this.decompspecify = decompspecify;
	}

	public String getDelayedflag() {
		return delayedflag;
	}

	public void setDelayedflag(String delayedflag) {
		this.delayedflag = delayedflag;
	}

	public String getDeleteddate() {
		return deleteddate;
	}

	public void setDeleteddate(String deleteddate) {
		this.deleteddate = deleteddate;
	}

	public String getDeletedtime() {
		return deletedtime;
	}

	public void setDeletedtime(String deletedtime) {
		this.deletedtime = deletedtime;
	}

	public String getDeleteduser() {
		return deleteduser;
	}

	public void setDeleteduser(String deleteduser) {
		this.deleteduser = deleteduser;
	}

	public String getDentalxRays() {
		return dentalxRays;
	}

	public void setDentalxRays(String dentalxRays) {
		this.dentalxRays = dentalxRays;
	}

	public String getDescriptionofxRays() {
		return descriptionofxRays;
	}

	public void setDescriptionofxRays(String descriptionofxRays) {
		this.descriptionofxRays = descriptionofxRays;
	}

	public String getDetectivename() {
		return detectivename;
	}

	public void setDetectivename(String detectivename) {
		this.detectivename = detectivename;
	}

	public String getDispatchccyy() {
		return dispatchccyy;
	}

	public void setDispatchccyy(String dispatchccyy) {
		this.dispatchccyy = dispatchccyy;
	}

	public String getDispatchdd() {
		return dispatchdd;
	}

	public void setDispatchdd(String dispatchdd) {
		this.dispatchdd = dispatchdd;
	}

	public String getDispatchmm() {
		return dispatchmm;
	}

	public void setDispatchmm(String dispatchmm) {
		this.dispatchmm = dispatchmm;
	}

	public String getDispatchtimehh() {
		return dispatchtimehh;
	}

	public void setDispatchtimehh(String dispatchtimehh) {
		this.dispatchtimehh = dispatchtimehh;
	}

	public String getDispatchtimemm() {
		return dispatchtimemm;
	}

	public void setDispatchtimemm(String dispatchtimemm) {
		this.dispatchtimemm = dispatchtimemm;
	}

	public String getDispositionburial() {
		return dispositionburial;
	}

	public void setDispositionburial(String dispositionburial) {
		this.dispositionburial = dispositionburial;
	}

	public String getDispositionccyy() {
		return dispositionccyy;
	}

	public void setDispositionccyy(String dispositionccyy) {
		this.dispositionccyy = dispositionccyy;
	}

	public String getDispositioncemetery() {
		return dispositioncemetery;
	}

	public void setDispositioncemetery(String dispositioncemetery) {
		this.dispositioncemetery = dispositioncemetery;
	}

	public String getDispositioncity() {
		return dispositioncity;
	}

	public void setDispositioncity(String dispositioncity) {
		this.dispositioncity = dispositioncity;
	}

	public String getDispositioncountry() {
		return dispositioncountry;
	}

	public void setDispositioncountry(String dispositioncountry) {
		this.dispositioncountry = dispositioncountry;
	}

	public String getDispositioncounty() {
		return dispositioncounty;
	}

	public void setDispositioncounty(String dispositioncounty) {
		this.dispositioncounty = dispositioncounty;
	}

	public String getDispositioncremation() {
		return dispositioncremation;
	}

	public void setDispositioncremation(String dispositioncremation) {
		this.dispositioncremation = dispositioncremation;
	}

	public String getDispositiondd() {
		return dispositiondd;
	}

	public void setDispositiondd(String dispositiondd) {
		this.dispositiondd = dispositiondd;
	}

	public String getDispositiondonation() {
		return dispositiondonation;
	}

	public void setDispositiondonation(String dispositiondonation) {
		this.dispositiondonation = dispositiondonation;
	}

	public String getDispositionentombment() {
		return dispositionentombment;
	}

	public void setDispositionentombment(String dispositionentombment) {
		this.dispositionentombment = dispositionentombment;
	}

	public String getDispositionmm() {
		return dispositionmm;
	}

	public void setDispositionmm(String dispositionmm) {
		this.dispositionmm = dispositionmm;
	}

	public String getDispositionother() {
		return dispositionother;
	}

	public void setDispositionother(String dispositionother) {
		this.dispositionother = dispositionother;
	}

	public String getDispositionotherspec() {
		return dispositionotherspec;
	}

	public void setDispositionotherspec(String dispositionotherspec) {
		this.dispositionotherspec = dispositionotherspec;
	}

	public String getDispositionremoval() {
		return dispositionremoval;
	}

	public void setDispositionremoval(String dispositionremoval) {
		this.dispositionremoval = dispositionremoval;
	}

	public String getDispositionstate() {
		return dispositionstate;
	}

	public void setDispositionstate(String dispositionstate) {
		this.dispositionstate = dispositionstate;
	}

	public String getDonoragency1() {
		return donoragency1;
	}

	public void setDonoragency1(String donoragency1) {
		this.donoragency1 = donoragency1;
	}

	public String getDonoragency2() {
		return donoragency2;
	}

	public void setDonoragency2(String donoragency2) {
		this.donoragency2 = donoragency2;
	}

	public String getDonoragency3() {
		return donoragency3;
	}

	public void setDonoragency3(String donoragency3) {
		this.donoragency3 = donoragency3;
	}

	public String getDonoragencyspecify1() {
		return donoragencyspecify1;
	}

	public void setDonoragencyspecify1(String donoragencyspecify1) {
		this.donoragencyspecify1 = donoragencyspecify1;
	}

	public String getDonoragencyspecify2() {
		return donoragencyspecify2;
	}

	public void setDonoragencyspecify2(String donoragencyspecify2) {
		this.donoragencyspecify2 = donoragencyspecify2;
	}

	public String getDonoragencyspecify3() {
		return donoragencyspecify3;
	}

	public void setDonoragencyspecify3(String donoragencyspecify3) {
		this.donoragencyspecify3 = donoragencyspecify3;
	}

	public String getDroppaperdate() {
		return droppaperdate;
	}

	public void setDroppaperdate(String droppaperdate) {
		this.droppaperdate = droppaperdate;
	}

	public String getDroppapertime() {
		return droppapertime;
	}

	public void setDroppapertime(String droppapertime) {
		this.droppapertime = droppapertime;
	}

	public String getDroppaperuser() {
		return droppaperuser;
	}

	public void setDroppaperuser(String droppaperuser) {
		this.droppaperuser = droppaperuser;
	}

	public String getDupenamewarning() {
		return dupenamewarning;
	}

	public void setDupenamewarning(String dupenamewarning) {
		this.dupenamewarning = dupenamewarning;
	}

	public String getDwExportdate() {
		return dwExportdate;
	}

	public void setDwExportdate(String dwExportdate) {
		this.dwExportdate = dwExportdate;
	}

	public String getDwsExportdate() {
		return dwsExportdate;
	}

	public void setDwsExportdate(String dwsExportdate) {
		this.dwsExportdate = dwsExportdate;
	}

	public String getEdenrecord() {
		return edenrecord;
	}

	public void setEdenrecord(String edenrecord) {
		this.edenrecord = edenrecord;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmploymentstatus() {
		return employmentstatus;
	}

	public void setEmploymentstatus(String employmentstatus) {
		this.employmentstatus = employmentstatus;
	}

	public String getExamassistant() {
		return examassistant;
	}

	public void setExamassistant(String examassistant) {
		this.examassistant = examassistant;
	}

	public String getExamccyy() {
		return examccyy;
	}

	public void setExamccyy(String examccyy) {
		this.examccyy = examccyy;
	}

	public String getExamdd() {
		return examdd;
	}

	public void setExamdd(String examdd) {
		this.examdd = examdd;
	}

	public String getExaminationtype() {
		return examinationtype;
	}

	public void setExaminationtype(String examinationtype) {
		this.examinationtype = examinationtype;
	}

	public String getExamlocation() {
		return examlocation;
	}

	public void setExamlocation(String examlocation) {
		this.examlocation = examlocation;
	}

	public String getExamlocationspecify() {
		return examlocationspecify;
	}

	public void setExamlocationspecify(String examlocationspecify) {
		this.examlocationspecify = examlocationspecify;
	}

	public String getExammd() {
		return exammd;
	}

	public void setExammd(String exammd) {
		this.exammd = exammd;
	}

	public String getExammdLicense() {
		return exammdLicense;
	}

	public void setExammdLicense(String exammdLicense) {
		this.exammdLicense = exammdLicense;
	}

	public String getExammdType() {
		return exammdType;
	}

	public void setExammdType(String exammdType) {
		this.exammdType = exammdType;
	}

	public String getExammm() {
		return exammm;
	}

	public void setExammm(String exammm) {
		this.exammm = exammm;
	}

	public String getExamsummary() {
		return examsummary;
	}

	public void setExamsummary(String examsummary) {
		this.examsummary = examsummary;
	}

	public String getExamsummary2() {
		return examsummary2;
	}

	public void setExamsummary2(String examsummary2) {
		this.examsummary2 = examsummary2;
	}

	public String getExamtimehh() {
		return examtimehh;
	}

	public void setExamtimehh(String examtimehh) {
		this.examtimehh = examtimehh;
	}

	public String getExamtimemm() {
		return examtimemm;
	}

	public void setExamtimemm(String examtimemm) {
		this.examtimemm = examtimemm;
	}

	public String getFacilitycode() {
		return facilitycode;
	}

	public void setFacilitycode(String facilitycode) {
		this.facilitycode = facilitycode;
	}

	public String getFacilityname() {
		return facilityname;
	}

	public void setFacilityname(String facilityname) {
		this.facilityname = facilityname;
	}

	public String getFatherfirst() {
		return fatherfirst;
	}

	public void setFatherfirst(String fatherfirst) {
		this.fatherfirst = fatherfirst;
	}

	public String getFatherlast() {
		return fatherlast;
	}

	public void setFatherlast(String fatherlast) {
		this.fatherlast = fatherlast;
	}

	public String getFathermiddle() {
		return fathermiddle;
	}

	public void setFathermiddle(String fathermiddle) {
		this.fathermiddle = fathermiddle;
	}

	public String getFathersuffix() {
		return fathersuffix;
	}

	public void setFathersuffix(String fathersuffix) {
		this.fathersuffix = fathersuffix;
	}

	public String getFhEditdate() {
		return fhEditdate;
	}

	public void setFhEditdate(String fhEditdate) {
		this.fhEditdate = fhEditdate;
	}

	public String getFhEdittime() {
		return fhEdittime;
	}

	public void setFhEdittime(String fhEdittime) {
		this.fhEdittime = fhEdittime;
	}

	public String getFhEdituser() {
		return fhEdituser;
	}

	public void setFhEdituser(String fhEdituser) {
		this.fhEdituser = fhEdituser;
	}

	public String getFhRelinquishdate() {
		return fhRelinquishdate;
	}

	public void setFhRelinquishdate(String fhRelinquishdate) {
		this.fhRelinquishdate = fhRelinquishdate;
	}

	public String getFhRelinquishtime() {
		return fhRelinquishtime;
	}

	public void setFhRelinquishtime(String fhRelinquishtime) {
		this.fhRelinquishtime = fhRelinquishtime;
	}

	public String getFhRelinquishuser() {
		return fhRelinquishuser;
	}

	public void setFhRelinquishuser(String fhRelinquishuser) {
		this.fhRelinquishuser = fhRelinquishuser;
	}

	public String getFhSigndate() {
		return fhSigndate;
	}

	public void setFhSigndate(String fhSigndate) {
		this.fhSigndate = fhSigndate;
	}

	public String getFhSigntime() {
		return fhSigntime;
	}

	public void setFhSigntime(String fhSigntime) {
		this.fhSigntime = fhSigntime;
	}

	public String getFhSignuser() {
		return fhSignuser;
	}

	public void setFhSignuser(String fhSignuser) {
		this.fhSignuser = fhSignuser;
	}

	public String getFhStartdate() {
		return fhStartdate;
	}

	public void setFhStartdate(String fhStartdate) {
		this.fhStartdate = fhStartdate;
	}

	public String getFhStarttime() {
		return fhStarttime;
	}

	public void setFhStarttime(String fhStarttime) {
		this.fhStarttime = fhStarttime;
	}

	public String getFhStartuser() {
		return fhStartuser;
	}

	public void setFhStartuser(String fhStartuser) {
		this.fhStartuser = fhStartuser;
	}

	public int getFhirsentreceived() {
		return fhirsentreceived;
	}

	public void setFhirsentreceived(int fhirsentreceived) {
		this.fhirsentreceived = fhirsentreceived;
	}

	public String getFounddate() {
		return founddate;
	}

	public void setFounddate(String founddate) {
		this.founddate = founddate;
	}

	public String getFoundtime() {
		return foundtime;
	}

	public void setFoundtime(String foundtime) {
		this.foundtime = foundtime;
	}

	public String getFuneraladdress1() {
		return funeraladdress1;
	}

	public void setFuneraladdress1(String funeraladdress1) {
		this.funeraladdress1 = funeraladdress1;
	}

	public String getFuneraladdress2() {
		return funeraladdress2;
	}

	public void setFuneraladdress2(String funeraladdress2) {
		this.funeraladdress2 = funeraladdress2;
	}

	public String getFuneralcity() {
		return funeralcity;
	}

	public void setFuneralcity(String funeralcity) {
		this.funeralcity = funeralcity;
	}

	public String getFuneralcounty() {
		return funeralcounty;
	}

	public void setFuneralcounty(String funeralcounty) {
		this.funeralcounty = funeralcounty;
	}

	public String getFuneraldirlicense() {
		return funeraldirlicense;
	}

	public void setFuneraldirlicense(String funeraldirlicense) {
		this.funeraldirlicense = funeraldirlicense;
	}

	public String getFuneraldirsignature() {
		return funeraldirsignature;
	}

	public void setFuneraldirsignature(String funeraldirsignature) {
		this.funeraldirsignature = funeraldirsignature;
	}

	public String getFuneralhomeauthby() {
		return funeralhomeauthby;
	}

	public void setFuneralhomeauthby(String funeralhomeauthby) {
		this.funeralhomeauthby = funeralhomeauthby;
	}

	public String getFuneralhomecontactedname() {
		return funeralhomecontactedname;
	}

	public void setFuneralhomecontactedname(String funeralhomecontactedname) {
		this.funeralhomecontactedname = funeralhomecontactedname;
	}

	public String getFuneralhomelicense() {
		return funeralhomelicense;
	}

	public void setFuneralhomelicense(String funeralhomelicense) {
		this.funeralhomelicense = funeralhomelicense;
	}

	public String getFuneralhomename() {
		return funeralhomename;
	}

	public void setFuneralhomename(String funeralhomename) {
		this.funeralhomename = funeralhomename;
	}

	public String getFuneralhomenotifby() {
		return funeralhomenotifby;
	}

	public void setFuneralhomenotifby(String funeralhomenotifby) {
		this.funeralhomenotifby = funeralhomenotifby;
	}

	public String getFuneralhomenotifccyy() {
		return funeralhomenotifccyy;
	}

	public void setFuneralhomenotifccyy(String funeralhomenotifccyy) {
		this.funeralhomenotifccyy = funeralhomenotifccyy;
	}

	public String getFuneralhomenotifdd() {
		return funeralhomenotifdd;
	}

	public void setFuneralhomenotifdd(String funeralhomenotifdd) {
		this.funeralhomenotifdd = funeralhomenotifdd;
	}

	public String getFuneralhomenotifmm() {
		return funeralhomenotifmm;
	}

	public void setFuneralhomenotifmm(String funeralhomenotifmm) {
		this.funeralhomenotifmm = funeralhomenotifmm;
	}

	public String getFuneralhomenotiftimehh() {
		return funeralhomenotiftimehh;
	}

	public void setFuneralhomenotiftimehh(String funeralhomenotiftimehh) {
		this.funeralhomenotiftimehh = funeralhomenotiftimehh;
	}

	public String getFuneralhomenotiftimemm() {
		return funeralhomenotiftimemm;
	}

	public void setFuneralhomenotiftimemm(String funeralhomenotiftimemm) {
		this.funeralhomenotiftimemm = funeralhomenotiftimemm;
	}

	public String getFuneralhomereleasedtoname() {
		return funeralhomereleasedtoname;
	}

	public void setFuneralhomereleasedtoname(String funeralhomereleasedtoname) {
		this.funeralhomereleasedtoname = funeralhomereleasedtoname;
	}

	public String getFuneralhomestatus() {
		return funeralhomestatus;
	}

	public void setFuneralhomestatus(String funeralhomestatus) {
		this.funeralhomestatus = funeralhomestatus;
	}

	public String getFuneralhomeuser() {
		return funeralhomeuser;
	}

	public void setFuneralhomeuser(String funeralhomeuser) {
		this.funeralhomeuser = funeralhomeuser;
	}

	public String getFuneralnotes1() {
		return funeralnotes1;
	}

	public void setFuneralnotes1(String funeralnotes1) {
		this.funeralnotes1 = funeralnotes1;
	}

	public String getFuneralnotes2() {
		return funeralnotes2;
	}

	public void setFuneralnotes2(String funeralnotes2) {
		this.funeralnotes2 = funeralnotes2;
	}

	public String getFuneralstate() {
		return funeralstate;
	}

	public void setFuneralstate(String funeralstate) {
		this.funeralstate = funeralstate;
	}

	public String getFuneraltradecall() {
		return funeraltradecall;
	}

	public void setFuneraltradecall(String funeraltradecall) {
		this.funeraltradecall = funeraltradecall;
	}

	public String getFuneralzip4() {
		return funeralzip4;
	}

	public void setFuneralzip4(String funeralzip4) {
		this.funeralzip4 = funeralzip4;
	}

	public String getFuneralzip5() {
		return funeralzip5;
	}

	public void setFuneralzip5(String funeralzip5) {
		this.funeralzip5 = funeralzip5;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGpsNorthcoordinate() {
		return gpsNorthcoordinate;
	}

	public void setGpsNorthcoordinate(String gpsNorthcoordinate) {
		this.gpsNorthcoordinate = gpsNorthcoordinate;
	}

	public String getGpsWestcoordinate() {
		return gpsWestcoordinate;
	}

	public void setGpsWestcoordinate(String gpsWestcoordinate) {
		this.gpsWestcoordinate = gpsWestcoordinate;
	}

	public String getHazardouscase() {
		return hazardouscase;
	}

	public void setHazardouscase(String hazardouscase) {
		this.hazardouscase = hazardouscase;
	}

	public String getHazardousreason() {
		return hazardousreason;
	}

	public void setHazardousreason(String hazardousreason) {
		this.hazardousreason = hazardousreason;
	}

	public String getHazardousreasonspecify() {
		return hazardousreasonspecify;
	}

	public void setHazardousreasonspecify(String hazardousreasonspecify) {
		this.hazardousreasonspecify = hazardousreasonspecify;
	}

	public String getHispaniccuban() {
		return hispaniccuban;
	}

	public void setHispaniccuban(String hispaniccuban) {
		this.hispaniccuban = hispaniccuban;
	}

	public String getHispanicmex() {
		return hispanicmex;
	}

	public void setHispanicmex(String hispanicmex) {
		this.hispanicmex = hispanicmex;
	}

	public String getHispanicorigin() {
		return hispanicorigin;
	}

	public void setHispanicorigin(String hispanicorigin) {
		this.hispanicorigin = hispanicorigin;
	}

	public String getHispanicother() {
		return hispanicother;
	}

	public void setHispanicother(String hispanicother) {
		this.hispanicother = hispanicother;
	}

	public String getHispanicotherspec() {
		return hispanicotherspec;
	}

	public void setHispanicotherspec(String hispanicotherspec) {
		this.hispanicotherspec = hispanicotherspec;
	}

	public String getHispanicpr() {
		return hispanicpr;
	}

	public void setHispanicpr(String hispanicpr) {
		this.hispanicpr = hispanicpr;
	}

	public String getHistology() {
		return histology;
	}

	public void setHistology(String histology) {
		this.histology = histology;
	}

	public String getHoldreason() {
		return holdreason;
	}

	public void setHoldreason(String holdreason) {
		this.holdreason = holdreason;
	}

	public String getHoldreasonspecify() {
		return holdreasonspecify;
	}

	public void setHoldreasonspecify(String holdreasonspecify) {
		this.holdreasonspecify = holdreasonspecify;
	}

	public String getIdentificationagency() {
		return identificationagency;
	}

	public void setIdentificationagency(String identificationagency) {
		this.identificationagency = identificationagency;
	}

	public String getIdentificationdateccyy() {
		return identificationdateccyy;
	}

	public void setIdentificationdateccyy(String identificationdateccyy) {
		this.identificationdateccyy = identificationdateccyy;
	}

	public String getIdentificationdatedd() {
		return identificationdatedd;
	}

	public void setIdentificationdatedd(String identificationdatedd) {
		this.identificationdatedd = identificationdatedd;
	}

	public String getIdentificationdatemm() {
		return identificationdatemm;
	}

	public void setIdentificationdatemm(String identificationdatemm) {
		this.identificationdatemm = identificationdatemm;
	}

	public String getIdentificationmethod() {
		return identificationmethod;
	}

	public void setIdentificationmethod(String identificationmethod) {
		this.identificationmethod = identificationmethod;
	}

	public String getIdentificationmethodspecify() {
		return identificationmethodspecify;
	}

	public void setIdentificationmethodspecify(String identificationmethodspecify) {
		this.identificationmethodspecify = identificationmethodspecify;
	}

	public String getIdentificationstatus() {
		return identificationstatus;
	}

	public void setIdentificationstatus(String identificationstatus) {
		this.identificationstatus = identificationstatus;
	}

	public String getIdentifiedby() {
		return identifiedby;
	}

	public void setIdentifiedby(String identifiedby) {
		this.identifiedby = identifiedby;
	}

	public String getImmediatecause() {
		return immediatecause;
	}

	public void setImmediatecause(String immediatecause) {
		this.immediatecause = immediatecause;
	}

	public String getImmediateinterval() {
		return immediateinterval;
	}

	public void setImmediateinterval(String immediateinterval) {
		this.immediateinterval = immediateinterval;
	}

	public String getImmediateintervalunit() {
		return immediateintervalunit;
	}

	public void setImmediateintervalunit(String immediateintervalunit) {
		this.immediateintervalunit = immediateintervalunit;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIndustrycode() {
		return industrycode;
	}

	public void setIndustrycode(String industrycode) {
		this.industrycode = industrycode;
	}

	public String getInformant2address1() {
		return informant2address1;
	}

	public void setInformant2address1(String informant2address1) {
		this.informant2address1 = informant2address1;
	}

	public String getInformant2address2() {
		return informant2address2;
	}

	public void setInformant2address2(String informant2address2) {
		this.informant2address2 = informant2address2;
	}

	public String getInformant2city() {
		return informant2city;
	}

	public void setInformant2city(String informant2city) {
		this.informant2city = informant2city;
	}

	public String getInformant2country() {
		return informant2country;
	}

	public void setInformant2country(String informant2country) {
		this.informant2country = informant2country;
	}

	public String getInformant2county() {
		return informant2county;
	}

	public void setInformant2county(String informant2county) {
		this.informant2county = informant2county;
	}

	public String getInformant2first() {
		return informant2first;
	}

	public void setInformant2first(String informant2first) {
		this.informant2first = informant2first;
	}

	public String getInformant2last() {
		return informant2last;
	}

	public void setInformant2last(String informant2last) {
		this.informant2last = informant2last;
	}

	public String getInformant2middle() {
		return informant2middle;
	}

	public void setInformant2middle(String informant2middle) {
		this.informant2middle = informant2middle;
	}

	public String getInformant2relation() {
		return informant2relation;
	}

	public void setInformant2relation(String informant2relation) {
		this.informant2relation = informant2relation;
	}

	public String getInformant2state() {
		return informant2state;
	}

	public void setInformant2state(String informant2state) {
		this.informant2state = informant2state;
	}

	public String getInformant2suffix() {
		return informant2suffix;
	}

	public void setInformant2suffix(String informant2suffix) {
		this.informant2suffix = informant2suffix;
	}

	public String getInformant2zip4() {
		return informant2zip4;
	}

	public void setInformant2zip4(String informant2zip4) {
		this.informant2zip4 = informant2zip4;
	}

	public String getInformant2zip5() {
		return informant2zip5;
	}

	public void setInformant2zip5(String informant2zip5) {
		this.informant2zip5 = informant2zip5;
	}

	public String getInformantaddress1() {
		return informantaddress1;
	}

	public void setInformantaddress1(String informantaddress1) {
		this.informantaddress1 = informantaddress1;
	}

	public String getInformantaddress2() {
		return informantaddress2;
	}

	public void setInformantaddress2(String informantaddress2) {
		this.informantaddress2 = informantaddress2;
	}

	public String getInformantcity() {
		return informantcity;
	}

	public void setInformantcity(String informantcity) {
		this.informantcity = informantcity;
	}

	public String getInformantcountry() {
		return informantcountry;
	}

	public void setInformantcountry(String informantcountry) {
		this.informantcountry = informantcountry;
	}

	public String getInformantcounty() {
		return informantcounty;
	}

	public void setInformantcounty(String informantcounty) {
		this.informantcounty = informantcounty;
	}

	public String getInformantfirst() {
		return informantfirst;
	}

	public void setInformantfirst(String informantfirst) {
		this.informantfirst = informantfirst;
	}

	public String getInformantlast() {
		return informantlast;
	}

	public void setInformantlast(String informantlast) {
		this.informantlast = informantlast;
	}

	public String getInformantmiddle() {
		return informantmiddle;
	}

	public void setInformantmiddle(String informantmiddle) {
		this.informantmiddle = informantmiddle;
	}

	public String getInformantrelation() {
		return informantrelation;
	}

	public void setInformantrelation(String informantrelation) {
		this.informantrelation = informantrelation;
	}

	public String getInformantstate() {
		return informantstate;
	}

	public void setInformantstate(String informantstate) {
		this.informantstate = informantstate;
	}

	public String getInformantsuffix() {
		return informantsuffix;
	}

	public void setInformantsuffix(String informantsuffix) {
		this.informantsuffix = informantsuffix;
	}

	public String getInformantzip4() {
		return informantzip4;
	}

	public void setInformantzip4(String informantzip4) {
		this.informantzip4 = informantzip4;
	}

	public String getInformantzip5() {
		return informantzip5;
	}

	public void setInformantzip5(String informantzip5) {
		this.informantzip5 = informantzip5;
	}

	public String getInjury() {
		return injury;
	}

	public void setInjury(String injury) {
		this.injury = injury;
	}

	public String getInjuryatwork() {
		return injuryatwork;
	}

	public void setInjuryatwork(String injuryatwork) {
		this.injuryatwork = injuryatwork;
	}

	public String getInjuryccyy() {
		return injuryccyy;
	}

	public void setInjuryccyy(String injuryccyy) {
		this.injuryccyy = injuryccyy;
	}

	public String getInjurycity() {
		return injurycity;
	}

	public void setInjurycity(String injurycity) {
		this.injurycity = injurycity;
	}

	public String getInjurycityfips() {
		return injurycityfips;
	}

	public void setInjurycityfips(String injurycityfips) {
		this.injurycityfips = injurycityfips;
	}

	public String getInjurycountry() {
		return injurycountry;
	}

	public void setInjurycountry(String injurycountry) {
		this.injurycountry = injurycountry;
	}

	public String getInjurycountryfips() {
		return injurycountryfips;
	}

	public void setInjurycountryfips(String injurycountryfips) {
		this.injurycountryfips = injurycountryfips;
	}

	public String getInjurycounty() {
		return injurycounty;
	}

	public void setInjurycounty(String injurycounty) {
		this.injurycounty = injurycounty;
	}

	public String getInjurycountyfips() {
		return injurycountyfips;
	}

	public void setInjurycountyfips(String injurycountyfips) {
		this.injurycountyfips = injurycountyfips;
	}

	public String getInjurydd() {
		return injurydd;
	}

	public void setInjurydd(String injurydd) {
		this.injurydd = injurydd;
	}

	public String getInjurydescription1() {
		return injurydescription1;
	}

	public void setInjurydescription1(String injurydescription1) {
		this.injurydescription1 = injurydescription1;
	}

	public String getInjurydescription2() {
		return injurydescription2;
	}

	public void setInjurydescription2(String injurydescription2) {
		this.injurydescription2 = injurydescription2;
	}

	public String getInjurymm() {
		return injurymm;
	}

	public void setInjurymm(String injurymm) {
		this.injurymm = injurymm;
	}

	public String getInjurymotorspec() {
		return injurymotorspec;
	}

	public void setInjurymotorspec(String injurymotorspec) {
		this.injurymotorspec = injurymotorspec;
	}

	public String getInjurymotorvehicle() {
		return injurymotorvehicle;
	}

	public void setInjurymotorvehicle(String injurymotorvehicle) {
		this.injurymotorvehicle = injurymotorvehicle;
	}

	public String getInjuryplace() {
		return injuryplace;
	}

	public void setInjuryplace(String injuryplace) {
		this.injuryplace = injuryplace;
	}

	public String getInjurystate() {
		return injurystate;
	}

	public void setInjurystate(String injurystate) {
		this.injurystate = injurystate;
	}

	public String getInjurystatefips() {
		return injurystatefips;
	}

	public void setInjurystatefips(String injurystatefips) {
		this.injurystatefips = injurystatefips;
	}

	public String getInjurystreet() {
		return injurystreet;
	}

	public void setInjurystreet(String injurystreet) {
		this.injurystreet = injurystreet;
	}

	public String getInjurytimehh() {
		return injurytimehh;
	}

	public void setInjurytimehh(String injurytimehh) {
		this.injurytimehh = injurytimehh;
	}

	public String getInjurytimemm() {
		return injurytimemm;
	}

	public void setInjurytimemm(String injurytimemm) {
		this.injurytimemm = injurytimemm;
	}

	public String getInjurywitnessed() {
		return injurywitnessed;
	}

	public void setInjurywitnessed(String injurywitnessed) {
		this.injurywitnessed = injurywitnessed;
	}

	public String getInjuryzip4() {
		return injuryzip4;
	}

	public void setInjuryzip4(String injuryzip4) {
		this.injuryzip4 = injuryzip4;
	}

	public String getInjuryzip5() {
		return injuryzip5;
	}

	public void setInjuryzip5(String injuryzip5) {
		this.injuryzip5 = injuryzip5;
	}

	public String getInvdayslastseentodeath() {
		return invdayslastseentodeath;
	}

	public void setInvdayslastseentodeath(String invdayslastseentodeath) {
		this.invdayslastseentodeath = invdayslastseentodeath;
	}

	public String getInvestigatoratscene() {
		return investigatoratscene;
	}

	public void setInvestigatoratscene(String investigatoratscene) {
		this.investigatoratscene = investigatoratscene;
	}

	public String getInvestigatorsummary() {
		return investigatorsummary;
	}

	public void setInvestigatorsummary(String investigatorsummary) {
		this.investigatorsummary = investigatorsummary;
	}

	public String getInvinjury() {
		return invinjury;
	}

	public void setInvinjury(String invinjury) {
		this.invinjury = invinjury;
	}

	public String getInvinjuryatwork() {
		return invinjuryatwork;
	}

	public void setInvinjuryatwork(String invinjuryatwork) {
		this.invinjuryatwork = invinjuryatwork;
	}

	public String getInvinjuryccyy() {
		return invinjuryccyy;
	}

	public void setInvinjuryccyy(String invinjuryccyy) {
		this.invinjuryccyy = invinjuryccyy;
	}

	public String getInvinjurycity() {
		return invinjurycity;
	}

	public void setInvinjurycity(String invinjurycity) {
		this.invinjurycity = invinjurycity;
	}

	public String getInvinjurycountry() {
		return invinjurycountry;
	}

	public void setInvinjurycountry(String invinjurycountry) {
		this.invinjurycountry = invinjurycountry;
	}

	public String getInvinjurycounty() {
		return invinjurycounty;
	}

	public void setInvinjurycounty(String invinjurycounty) {
		this.invinjurycounty = invinjurycounty;
	}

	public String getInvinjurydd() {
		return invinjurydd;
	}

	public void setInvinjurydd(String invinjurydd) {
		this.invinjurydd = invinjurydd;
	}

	public String getInvinjurydescription1() {
		return invinjurydescription1;
	}

	public void setInvinjurydescription1(String invinjurydescription1) {
		this.invinjurydescription1 = invinjurydescription1;
	}

	public String getInvinjurydescription2() {
		return invinjurydescription2;
	}

	public void setInvinjurydescription2(String invinjurydescription2) {
		this.invinjurydescription2 = invinjurydescription2;
	}

	public String getInvinjurymm() {
		return invinjurymm;
	}

	public void setInvinjurymm(String invinjurymm) {
		this.invinjurymm = invinjurymm;
	}

	public String getInvinjurymotorspecify() {
		return invinjurymotorspecify;
	}

	public void setInvinjurymotorspecify(String invinjurymotorspecify) {
		this.invinjurymotorspecify = invinjurymotorspecify;
	}

	public String getInvinjurymotorvehicle() {
		return invinjurymotorvehicle;
	}

	public void setInvinjurymotorvehicle(String invinjurymotorvehicle) {
		this.invinjurymotorvehicle = invinjurymotorvehicle;
	}

	public String getInvinjuryplace() {
		return invinjuryplace;
	}

	public void setInvinjuryplace(String invinjuryplace) {
		this.invinjuryplace = invinjuryplace;
	}

	public String getInvinjurystate() {
		return invinjurystate;
	}

	public void setInvinjurystate(String invinjurystate) {
		this.invinjurystate = invinjurystate;
	}

	public String getInvinjurystreet() {
		return invinjurystreet;
	}

	public void setInvinjurystreet(String invinjurystreet) {
		this.invinjurystreet = invinjurystreet;
	}

	public String getInvinjurytimehh() {
		return invinjurytimehh;
	}

	public void setInvinjurytimehh(String invinjurytimehh) {
		this.invinjurytimehh = invinjurytimehh;
	}

	public String getInvinjurytimemm() {
		return invinjurytimemm;
	}

	public void setInvinjurytimemm(String invinjurytimemm) {
		this.invinjurytimemm = invinjurytimemm;
	}

	public String getInvlastseenccyy() {
		return invlastseenccyy;
	}

	public void setInvlastseenccyy(String invlastseenccyy) {
		this.invlastseenccyy = invlastseenccyy;
	}

	public String getInvlastseendd() {
		return invlastseendd;
	}

	public void setInvlastseendd(String invlastseendd) {
		this.invlastseendd = invlastseendd;
	}

	public String getInvlastseenmm() {
		return invlastseenmm;
	}

	public void setInvlastseenmm(String invlastseenmm) {
		this.invlastseenmm = invlastseenmm;
	}

	public String getInvpregnant() {
		return invpregnant;
	}

	public void setInvpregnant(String invpregnant) {
		this.invpregnant = invpregnant;
	}

	public String getInvtobacco() {
		return invtobacco;
	}

	public void setInvtobacco(String invtobacco) {
		this.invtobacco = invtobacco;
	}

	public String getKinaddress1() {
		return kinaddress1;
	}

	public void setKinaddress1(String kinaddress1) {
		this.kinaddress1 = kinaddress1;
	}

	public String getKinaddress2() {
		return kinaddress2;
	}

	public void setKinaddress2(String kinaddress2) {
		this.kinaddress2 = kinaddress2;
	}

	public String getKinareacode() {
		return kinareacode;
	}

	public void setKinareacode(String kinareacode) {
		this.kinareacode = kinareacode;
	}

	public String getKincity() {
		return kincity;
	}

	public void setKincity(String kincity) {
		this.kincity = kincity;
	}

	public String getKincountry() {
		return kincountry;
	}

	public void setKincountry(String kincountry) {
		this.kincountry = kincountry;
	}

	public String getKinfirst() {
		return kinfirst;
	}

	public void setKinfirst(String kinfirst) {
		this.kinfirst = kinfirst;
	}

	public String getKinlast() {
		return kinlast;
	}

	public void setKinlast(String kinlast) {
		this.kinlast = kinlast;
	}

	public String getKinmiddle() {
		return kinmiddle;
	}

	public void setKinmiddle(String kinmiddle) {
		this.kinmiddle = kinmiddle;
	}

	public String getKinnotes1() {
		return kinnotes1;
	}

	public void setKinnotes1(String kinnotes1) {
		this.kinnotes1 = kinnotes1;
	}

	public String getKinnotes2() {
		return kinnotes2;
	}

	public void setKinnotes2(String kinnotes2) {
		this.kinnotes2 = kinnotes2;
	}

	public String getKinnotifyby() {
		return kinnotifyby;
	}

	public void setKinnotifyby(String kinnotifyby) {
		this.kinnotifyby = kinnotifyby;
	}

	public String getKinnotifybyspecify() {
		return kinnotifybyspecify;
	}

	public void setKinnotifybyspecify(String kinnotifybyspecify) {
		this.kinnotifybyspecify = kinnotifybyspecify;
	}

	public String getKinnotifyccyy() {
		return kinnotifyccyy;
	}

	public void setKinnotifyccyy(String kinnotifyccyy) {
		this.kinnotifyccyy = kinnotifyccyy;
	}

	public String getKinnotifydd() {
		return kinnotifydd;
	}

	public void setKinnotifydd(String kinnotifydd) {
		this.kinnotifydd = kinnotifydd;
	}

	public String getKinnotifymm() {
		return kinnotifymm;
	}

	public void setKinnotifymm(String kinnotifymm) {
		this.kinnotifymm = kinnotifymm;
	}

	public String getKinnotifytimehh() {
		return kinnotifytimehh;
	}

	public void setKinnotifytimehh(String kinnotifytimehh) {
		this.kinnotifytimehh = kinnotifytimehh;
	}

	public String getKinnotifytimemm() {
		return kinnotifytimemm;
	}

	public void setKinnotifytimemm(String kinnotifytimemm) {
		this.kinnotifytimemm = kinnotifytimemm;
	}

	public String getKinphonenumber() {
		return kinphonenumber;
	}

	public void setKinphonenumber(String kinphonenumber) {
		this.kinphonenumber = kinphonenumber;
	}

	public String getKinrelation() {
		return kinrelation;
	}

	public void setKinrelation(String kinrelation) {
		this.kinrelation = kinrelation;
	}

	public String getKinstate() {
		return kinstate;
	}

	public void setKinstate(String kinstate) {
		this.kinstate = kinstate;
	}

	public String getKinsuffix() {
		return kinsuffix;
	}

	public void setKinsuffix(String kinsuffix) {
		this.kinsuffix = kinsuffix;
	}

	public String getKinzip4() {
		return kinzip4;
	}

	public void setKinzip4(String kinzip4) {
		this.kinzip4 = kinzip4;
	}

	public String getKinzip5() {
		return kinzip5;
	}

	public void setKinzip5(String kinzip5) {
		this.kinzip5 = kinzip5;
	}

	public String getLabchemistries() {
		return labchemistries;
	}

	public void setLabchemistries(String labchemistries) {
		this.labchemistries = labchemistries;
	}

	public String getLabcultures() {
		return labcultures;
	}

	public void setLabcultures(String labcultures) {
		this.labcultures = labcultures;
	}

	public String getLabmetabolicscreen() {
		return labmetabolicscreen;
	}

	public void setLabmetabolicscreen(String labmetabolicscreen) {
		this.labmetabolicscreen = labmetabolicscreen;
	}

	public String getLabother() {
		return labother;
	}

	public void setLabother(String labother) {
		this.labother = labother;
	}

	public String getLabotherspecify() {
		return labotherspecify;
	}

	public void setLabotherspecify(String labotherspecify) {
		this.labotherspecify = labotherspecify;
	}

	public String getLabserology() {
		return labserology;
	}

	public void setLabserology(String labserology) {
		this.labserology = labserology;
	}

	public String getLabtoxdrawn() {
		return labtoxdrawn;
	}

	public void setLabtoxdrawn(String labtoxdrawn) {
		this.labtoxdrawn = labtoxdrawn;
	}

	public String getLabvirology() {
		return labvirology;
	}

	public void setLabvirology(String labvirology) {
		this.labvirology = labvirology;
	}

	public String getLastseenaliveaddress() {
		return lastseenaliveaddress;
	}

	public void setLastseenaliveaddress(String lastseenaliveaddress) {
		this.lastseenaliveaddress = lastseenaliveaddress;
	}

	public String getLastseenaliveby() {
		return lastseenaliveby;
	}

	public void setLastseenaliveby(String lastseenaliveby) {
		this.lastseenaliveby = lastseenaliveby;
	}

	public String getLastseenaliveccyy() {
		return lastseenaliveccyy;
	}

	public void setLastseenaliveccyy(String lastseenaliveccyy) {
		this.lastseenaliveccyy = lastseenaliveccyy;
	}

	public String getLastseenalivedd() {
		return lastseenalivedd;
	}

	public void setLastseenalivedd(String lastseenalivedd) {
		this.lastseenalivedd = lastseenalivedd;
	}

	public String getLastseenalivemm() {
		return lastseenalivemm;
	}

	public void setLastseenalivemm(String lastseenalivemm) {
		this.lastseenalivemm = lastseenalivemm;
	}

	public String getLastseenccyy() {
		return lastseenccyy;
	}

	public void setLastseenccyy(String lastseenccyy) {
		this.lastseenccyy = lastseenccyy;
	}

	public String getLastseendd() {
		return lastseendd;
	}

	public void setLastseendd(String lastseendd) {
		this.lastseendd = lastseendd;
	}

	public String getLastseenmm() {
		return lastseenmm;
	}

	public void setLastseenmm(String lastseenmm) {
		this.lastseenmm = lastseenmm;
	}

	public String getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}

	public String getLawenforcementagency() {
		return lawenforcementagency;
	}

	public void setLawenforcementagency(String lawenforcementagency) {
		this.lawenforcementagency = lawenforcementagency;
	}

	public String getLawenforcementcasenumber() {
		return lawenforcementcasenumber;
	}

	public void setLawenforcementcasenumber(String lawenforcementcasenumber) {
		this.lawenforcementcasenumber = lawenforcementcasenumber;
	}

	public String getLhdNotes1() {
		return lhdNotes1;
	}

	public void setLhdNotes1(String lhdNotes1) {
		this.lhdNotes1 = lhdNotes1;
	}

	public String getLhdNotes2() {
		return lhdNotes2;
	}

	public void setLhdNotes2(String lhdNotes2) {
		this.lhdNotes2 = lhdNotes2;
	}

	public String getLividdistanterior() {
		return lividdistanterior;
	}

	public void setLividdistanterior(String lividdistanterior) {
		this.lividdistanterior = lividdistanterior;
	}

	public String getLividdistcaudal() {
		return lividdistcaudal;
	}

	public void setLividdistcaudal(String lividdistcaudal) {
		this.lividdistcaudal = lividdistcaudal;
	}

	public String getLividdistleft() {
		return lividdistleft;
	}

	public void setLividdistleft(String lividdistleft) {
		this.lividdistleft = lividdistleft;
	}

	public String getLividdistposterior() {
		return lividdistposterior;
	}

	public void setLividdistposterior(String lividdistposterior) {
		this.lividdistposterior = lividdistposterior;
	}

	public String getLividdistright() {
		return lividdistright;
	}

	public void setLividdistright(String lividdistright) {
		this.lividdistright = lividdistright;
	}

	public String getLividdistrostral() {
		return lividdistrostral;
	}

	public void setLividdistrostral(String lividdistrostral) {
		this.lividdistrostral = lividdistrostral;
	}

	public String getLividity() {
		return lividity;
	}

	public void setLividity(String lividity) {
		this.lividity = lividity;
	}

	public String getLividityfaint() {
		return lividityfaint;
	}

	public void setLividityfaint(String lividityfaint) {
		this.lividityfaint = lividityfaint;
	}

	public String getLividityspecify() {
		return lividityspecify;
	}

	public void setLividityspecify(String lividityspecify) {
		this.lividityspecify = lividityspecify;
	}

	public String getLocalmdAreacode() {
		return localmdAreacode;
	}

	public void setLocalmdAreacode(String localmdAreacode) {
		this.localmdAreacode = localmdAreacode;
	}

	public String getLocalmdCity() {
		return localmdCity;
	}

	public void setLocalmdCity(String localmdCity) {
		this.localmdCity = localmdCity;
	}

	public String getLocalmdFirst() {
		return localmdFirst;
	}

	public void setLocalmdFirst(String localmdFirst) {
		this.localmdFirst = localmdFirst;
	}

	public String getLocalmdLast() {
		return localmdLast;
	}

	public void setLocalmdLast(String localmdLast) {
		this.localmdLast = localmdLast;
	}

	public String getLocalmdPhonenumber() {
		return localmdPhonenumber;
	}

	public void setLocalmdPhonenumber(String localmdPhonenumber) {
		this.localmdPhonenumber = localmdPhonenumber;
	}

	public String getLockedtouser() {
		return lockedtouser;
	}

	public void setLockedtouser(String lockedtouser) {
		this.lockedtouser = lockedtouser;
	}

	public String getLockedtousername() {
		return lockedtousername;
	}

	public void setLockedtousername(String lockedtousername) {
		this.lockedtousername = lockedtousername;
	}

	public String getMannerofdeath() {
		return mannerofdeath;
	}

	public void setMannerofdeath(String mannerofdeath) {
		this.mannerofdeath = mannerofdeath;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getMasterstatus() {
		return masterstatus;
	}

	public void setMasterstatus(String masterstatus) {
		this.masterstatus = masterstatus;
	}

	public String getMdAtScene() {
		return mdAtScene;
	}

	public void setMdAtScene(String mdAtScene) {
		this.mdAtScene = mdAtScene;
	}

	public String getMeCasenumber() {
		return meCasenumber;
	}

	public void setMeCasenumber(String meCasenumber) {
		this.meCasenumber = meCasenumber;
	}

	public String getMeContacted() {
		return meContacted;
	}

	public void setMeContacted(String meContacted) {
		this.meContacted = meContacted;
	}

	public String geteContactednotes() {
		return meContactednotes;
	}

	public void setMeContactednotes(String meContactednotes) {
		this.meContactednotes = meContactednotes;
	}

	public String getMeReview() {
		return meReview;
	}

	public void setMeReview(String meReview) {
		this.meReview = meReview;
	}

	public String getMeType() {
		return meType;
	}

	public void setMeType(String meType) {
		this.meType = meType;
	}

	public String getMedicalconditions1() {
		return medicalconditions1;
	}

	public void setMedicalconditions1(String medicalconditions1) {
		this.medicalconditions1 = medicalconditions1;
	}

	public String getMedicalconditions2() {
		return medicalconditions2;
	}

	public void setMedicalconditions2(String medicalconditions2) {
		this.medicalconditions2 = medicalconditions2;
	}

	public String getMedicalconditions3() {
		return medicalconditions3;
	}

	public void setMedicalconditions3(String medicalconditions3) {
		this.medicalconditions3 = medicalconditions3;
	}

	public String getMedicalconditions4() {
		return medicalconditions4;
	}

	public void setMedicalconditions4(String medicalconditions4) {
		this.medicalconditions4 = medicalconditions4;
	}

	public String getMedicalconditions5() {
		return medicalconditions5;
	}

	public void setMedicalconditions5(String medicalconditions5) {
		this.medicalconditions5 = medicalconditions5;
	}

	public String getMedicalconditions6() {
		return medicalconditions6;
	}

	public void setMedicalconditions6(String medicalconditions6) {
		this.medicalconditions6 = medicalconditions6;
	}

	public String getMicarExportdate() {
		return micarExportdate;
	}

	public void setMicarExportdate(String micarExportdate) {
		this.micarExportdate = micarExportdate;
	}

	public String getMotherfirst() {
		return motherfirst;
	}

	public void setMotherfirst(String motherfirst) {
		this.motherfirst = motherfirst;
	}

	public String getMothermaidenname() {
		return mothermaidenname;
	}

	public void setMothermaidenname(String mothermaidenname) {
		this.mothermaidenname = mothermaidenname;
	}

	public String getMothermiddle() {
		return mothermiddle;
	}

	public void setMothermiddle(String mothermiddle) {
		this.mothermiddle = mothermiddle;
	}

	public String getMothersuffix() {
		return mothersuffix;
	}

	public void setMothersuffix(String mothersuffix) {
		this.mothersuffix = mothersuffix;
	}

	public String getMrn() {
		return mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public String getNchsExportdate() {
		return nchsExportdate;
	}

	public void setNchsExportdate(String nchsExportdate) {
		this.nchsExportdate = nchsExportdate;
	}

	public String getNeverseenalive() {
		return neverseenalive;
	}

	public void setNeverseenalive(String neverseenalive) {
		this.neverseenalive = neverseenalive;
	}

	public String getNonfacilitylocation() {
		return nonfacilitylocation;
	}

	public void setNonfacilitylocation(String nonfacilitylocation) {
		this.nonfacilitylocation = nonfacilitylocation;
	}

	public String getNpComment() {
		return npComment;
	}

	public void setNpComment(String npComment) {
		this.npComment = npComment;
	}

	public String getNumberblocks1() {
		return numberblocks1;
	}

	public void setNumberblocks1(String numberblocks1) {
		this.numberblocks1 = numberblocks1;
	}

	public String getNumberblocks2() {
		return numberblocks2;
	}

	public void setNumberblocks2(String numberblocks2) {
		this.numberblocks2 = numberblocks2;
	}

	public String getNumberblocks3() {
		return numberblocks3;
	}

	public void setNumberblocks3(String numberblocks3) {
		this.numberblocks3 = numberblocks3;
	}

	public String getNumbernp1() {
		return numbernp1;
	}

	public void setNumbernp1(String numbernp1) {
		this.numbernp1 = numbernp1;
	}

	public String getNumbernp2() {
		return numbernp2;
	}

	public void setNumbernp2(String numbernp2) {
		this.numbernp2 = numbernp2;
	}

	public String getNumberofxRays() {
		return numberofxRays;
	}

	public void setNumberofxRays(String numberofxRays) {
		this.numberofxRays = numberofxRays;
	}

	public String getNursinghomename() {
		return nursinghomename;
	}

	public void setNursinghomename(String nursinghomename) {
		this.nursinghomename = nursinghomename;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOccupationcode() {
		return occupationcode;
	}

	public void setOccupationcode(String occupationcode) {
		this.occupationcode = occupationcode;
	}

	public String getOdontologistconfirmccyy() {
		return odontologistconfirmccyy;
	}

	public void setOdontologistconfirmccyy(String odontologistconfirmccyy) {
		this.odontologistconfirmccyy = odontologistconfirmccyy;
	}

	public String getOdontologistconfirmdd() {
		return odontologistconfirmdd;
	}

	public void setOdontologistconfirmdd(String odontologistconfirmdd) {
		this.odontologistconfirmdd = odontologistconfirmdd;
	}

	public String getOdontologistconfirmmm() {
		return odontologistconfirmmm;
	}

	public void setOdontologistconfirmmm(String odontologistconfirmmm) {
		this.odontologistconfirmmm = odontologistconfirmmm;
	}

	public String getOdontologistcontactccyy() {
		return odontologistcontactccyy;
	}

	public void setOdontologistcontactccyy(String odontologistcontactccyy) {
		this.odontologistcontactccyy = odontologistcontactccyy;
	}

	public String getOdontologistcontactdd() {
		return odontologistcontactdd;
	}

	public void setOdontologistcontactdd(String odontologistcontactdd) {
		this.odontologistcontactdd = odontologistcontactdd;
	}

	public String getOdontologistcontactmm() {
		return odontologistcontactmm;
	}

	public void setOdontologistcontactmm(String odontologistcontactmm) {
		this.odontologistcontactmm = odontologistcontactmm;
	}

	public String getOdontologistname() {
		return odontologistname;
	}

	public void setOdontologistname(String odontologistname) {
		this.odontologistname = odontologistname;
	}

	public String getOmePhotosCd() {
		return omePhotosCd;
	}

	public void setOmePhotosCd(String omePhotosCd) {
		this.omePhotosCd = omePhotosCd;
	}

	public String getOmePhotosDownloaded() {
		return omePhotosDownloaded;
	}

	public void setOmePhotosDownloaded(String omePhotosDownloaded) {
		this.omePhotosDownloaded = omePhotosDownloaded;
	}

	public String getOmePhotosEmailed() {
		return omePhotosEmailed;
	}

	public void setOmePhotosEmailed(String omePhotosEmailed) {
		this.omePhotosEmailed = omePhotosEmailed;
	}

	public String getOmePhotosOther() {
		return omePhotosOther;
	}

	public void setOmePhotosOther(String omePhotosOther) {
		this.omePhotosOther = omePhotosOther;
	}

	public String getOmePhotosSpecify() {
		return omePhotosSpecify;
	}

	public void setOmePhotosSpecify(String omePhotosSpecify) {
		this.omePhotosSpecify = omePhotosSpecify;
	}

	public String getOmeTransferdate() {
		return omeTransferdate;
	}

	public void setOmeTransferdate(String omeTransferdate) {
		this.omeTransferdate = omeTransferdate;
	}

	public String getOmeTransfertime() {
		return omeTransfertime;
	}

	public void setOmeTransfertime(String omeTransfertime) {
		this.omeTransfertime = omeTransfertime;
	}

	public String getOmeTransferuser() {
		return omeTransferuser;
	}

	public void setOmeTransferuser(String omeTransferuser) {
		this.omeTransferuser = omeTransferuser;
	}

	public String getOmeVideo() {
		return omeVideo;
	}

	public void setOmeVideo(String omeVideo) {
		this.omeVideo = omeVideo;
	}

	public String getOrgansbone1() {
		return organsbone1;
	}

	public void setOrgansbone1(String organsbone1) {
		this.organsbone1 = organsbone1;
	}

	public String getOrgansbone2() {
		return organsbone2;
	}

	public void setOrgansbone2(String organsbone2) {
		this.organsbone2 = organsbone2;
	}

	public String getOrgansbone3() {
		return organsbone3;
	}

	public void setOrgansbone3(String organsbone3) {
		this.organsbone3 = organsbone3;
	}

	public String getOrganseyes1() {
		return organseyes1;
	}

	public void setOrganseyes1(String organseyes1) {
		this.organseyes1 = organseyes1;
	}

	public String getOrganseyes2() {
		return organseyes2;
	}

	public void setOrganseyes2(String organseyes2) {
		this.organseyes2 = organseyes2;
	}

	public String getOrganseyes3() {
		return organseyes3;
	}

	public void setOrganseyes3(String organseyes3) {
		this.organseyes3 = organseyes3;
	}

	public String getOrgansheartvalve1() {
		return organsheartvalve1;
	}

	public void setOrgansheartvalve1(String organsheartvalve1) {
		this.organsheartvalve1 = organsheartvalve1;
	}

	public String getOrgansheartvalve2() {
		return organsheartvalve2;
	}

	public void setOrgansheartvalve2(String organsheartvalve2) {
		this.organsheartvalve2 = organsheartvalve2;
	}

	public String getOrgansheartvalve3() {
		return organsheartvalve3;
	}

	public void setOrgansheartvalve3(String organsheartvalve3) {
		this.organsheartvalve3 = organsheartvalve3;
	}

	public String getOrgansskin1() {
		return organsskin1;
	}

	public void setOrgansskin1(String organsskin1) {
		this.organsskin1 = organsskin1;
	}

	public String getOrgansskin2() {
		return organsskin2;
	}

	public void setOrgansskin2(String organsskin2) {
		this.organsskin2 = organsskin2;
	}

	public String getOrgansskin3() {
		return organsskin3;
	}

	public void setOrgansskin3(String organsskin3) {
		this.organsskin3 = organsskin3;
	}

	public String getOrgansvein1() {
		return organsvein1;
	}

	public void setOrgansvein1(String organsvein1) {
		this.organsvein1 = organsvein1;
	}

	public String getOrgansvein2() {
		return organsvein2;
	}

	public void setOrgansvein2(String organsvein2) {
		this.organsvein2 = organsvein2;
	}

	public String getOrgansvein3() {
		return organsvein3;
	}

	public void setOrgansvein3(String organsvein3) {
		this.organsvein3 = organsvein3;
	}

	public String getOrgansvital1() {
		return organsvital1;
	}

	public void setOrgansvital1(String organsvital1) {
		this.organsvital1 = organsvital1;
	}

	public String getOrgansvital2() {
		return organsvital2;
	}

	public void setOrgansvital2(String organsvital2) {
		this.organsvital2 = organsvital2;
	}

	public String getOrgansvital3() {
		return organsvital3;
	}

	public void setOrgansvital3(String organsvital3) {
		this.organsvital3 = organsvital3;
	}

	public String getOtheragencyphotos() {
		return otheragencyphotos;
	}

	public void setOtheragencyphotos(String otheragencyphotos) {
		this.otheragencyphotos = otheragencyphotos;
	}

	public String getOtheragencyvideos() {
		return otheragencyvideos;
	}

	public void setOtheragencyvideos(String otheragencyvideos) {
		this.otheragencyvideos = otheragencyvideos;
	}

	public String getOthercasenumbers() {
		return othercasenumbers;
	}

	public void setOthercasenumbers(String othercasenumbers) {
		this.othercasenumbers = othercasenumbers;
	}

	public String getOtherconditions() {
		return otherconditions;
	}

	public void setOtherconditions(String otherconditions) {
		this.otherconditions = otherconditions;
	}

	public String getPlaceofdeath() {
		return placeofdeath;
	}

	public void setPlaceofdeath(String placeofdeath) {
		this.placeofdeath = placeofdeath;
	}

	public String getPodOtherspec() {
		return podOtherspec;
	}

	public void setPodOtherspec(String podOtherspec) {
		this.podOtherspec = podOtherspec;
	}

	public String getPregnant() {
		return pregnant;
	}

	public void setPregnant(String pregnant) {
		this.pregnant = pregnant;
	}

	public String getProcessingnote() {
		return processingnote;
	}

	public void setProcessingnote(String processingnote) {
		this.processingnote = processingnote;
	}

	public String getRaceamindian() {
		return raceamindian;
	}

	public void setRaceamindian(String raceamindian) {
		this.raceamindian = raceamindian;
	}

	public String getRaceasianindian() {
		return raceasianindian;
	}

	public void setRaceasianindian(String raceasianindian) {
		this.raceasianindian = raceasianindian;
	}

	public String getRaceasianspec() {
		return raceasianspec;
	}

	public void setRaceasianspec(String raceasianspec) {
		this.raceasianspec = raceasianspec;
	}

	public String getRaceblack() {
		return raceblack;
	}

	public void setRaceblack(String raceblack) {
		this.raceblack = raceblack;
	}

	public String getRacechinese() {
		return racechinese;
	}

	public void setRacechinese(String racechinese) {
		this.racechinese = racechinese;
	}

	public String getRacefilipino() {
		return racefilipino;
	}

	public void setRacefilipino(String racefilipino) {
		this.racefilipino = racefilipino;
	}

	public String getRaceguamanian() {
		return raceguamanian;
	}

	public void setRaceguamanian(String raceguamanian) {
		this.raceguamanian = raceguamanian;
	}

	public String getRacehawaiian() {
		return racehawaiian;
	}

	public void setRacehawaiian(String racehawaiian) {
		this.racehawaiian = racehawaiian;
	}

	public String getRaceislanderspec() {
		return raceislanderspec;
	}

	public void setRaceislanderspec(String raceislanderspec) {
		this.raceislanderspec = raceislanderspec;
	}

	public String getRacejapanese() {
		return racejapanese;
	}

	public void setRacejapanese(String racejapanese) {
		this.racejapanese = racejapanese;
	}

	public String getRacekorean() {
		return racekorean;
	}

	public void setRacekorean(String racekorean) {
		this.racekorean = racekorean;
	}

	public String getRaceother() {
		return raceother;
	}

	public void setRaceother(String raceother) {
		this.raceother = raceother;
	}

	public String getRaceotherasian() {
		return raceotherasian;
	}

	public void setRaceotherasian(String raceotherasian) {
		this.raceotherasian = raceotherasian;
	}

	public String getRaceotherspec() {
		return raceotherspec;
	}

	public void setRaceotherspec(String raceotherspec) {
		this.raceotherspec = raceotherspec;
	}

	public String getRacepacislander() {
		return racepacislander;
	}

	public void setRacepacislander(String racepacislander) {
		this.racepacislander = racepacislander;
	}

	public String getRacesamoan() {
		return racesamoan;
	}

	public void setRacesamoan(String racesamoan) {
		this.racesamoan = racesamoan;
	}

	public String getRacetribespec() {
		return racetribespec;
	}

	public void setRacetribespec(String racetribespec) {
		this.racetribespec = racetribespec;
	}

	public String getRaceunknown() {
		return raceunknown;
	}

	public void setRaceunknown(String raceunknown) {
		this.raceunknown = raceunknown;
	}

	public String getRacevietnamese() {
		return racevietnamese;
	}

	public void setRacevietnamese(String racevietnamese) {
		this.racevietnamese = racevietnamese;
	}

	public String getRacewhite() {
		return racewhite;
	}

	public void setRacewhite(String racewhite) {
		this.racewhite = racewhite;
	}

	public String getReasonrejected() {
		return reasonrejected;
	}

	public void setReasonrejected(String reasonrejected) {
		this.reasonrejected = reasonrejected;
	}

	public String getReceivedby() {
		return receivedby;
	}

	public void setReceivedby(String receivedby) {
		this.receivedby = receivedby;
	}

	public String getReceivedccyy() {
		return receivedccyy;
	}

	public void setReceivedccyy(String receivedccyy) {
		this.receivedccyy = receivedccyy;
	}

	public String getReceiveddd() {
		return receiveddd;
	}

	public void setReceiveddd(String receiveddd) {
		this.receiveddd = receiveddd;
	}

	public String getReceivedmm() {
		return receivedmm;
	}

	public void setReceivedmm(String receivedmm) {
		this.receivedmm = receivedmm;
	}

	public String getReceivedtimehh() {
		return receivedtimehh;
	}

	public void setReceivedtimehh(String receivedtimehh) {
		this.receivedtimehh = receivedtimehh;
	}

	public String getReceivedtimemm() {
		return receivedtimemm;
	}

	public void setReceivedtimemm(String receivedtimemm) {
		this.receivedtimemm = receivedtimemm;
	}

	public String getRecordtype() {
		return recordtype;
	}

	public void setRecordtype(String recordtype) {
		this.recordtype = recordtype;
	}

	public String getRecoveryccyy1() {
		return recoveryccyy1;
	}

	public void setRecoveryccyy1(String recoveryccyy1) {
		this.recoveryccyy1 = recoveryccyy1;
	}

	public String getRecoveryccyy2() {
		return recoveryccyy2;
	}

	public void setRecoveryccyy2(String recoveryccyy2) {
		this.recoveryccyy2 = recoveryccyy2;
	}

	public String getRecoveryccyy3() {
		return recoveryccyy3;
	}

	public void setRecoveryccyy3(String recoveryccyy3) {
		this.recoveryccyy3 = recoveryccyy3;
	}

	public String getRecoverydd1() {
		return recoverydd1;
	}

	public void setRecoverydd1(String recoverydd1) {
		this.recoverydd1 = recoverydd1;
	}

	public String getRecoverydd2() {
		return recoverydd2;
	}

	public void setRecoverydd2(String recoverydd2) {
		this.recoverydd2 = recoverydd2;
	}

	public String getRecoverydd3() {
		return recoverydd3;
	}

	public void setRecoverydd3(String recoverydd3) {
		this.recoverydd3 = recoverydd3;
	}

	public String getRecoverylocation1() {
		return recoverylocation1;
	}

	public void setRecoverylocation1(String recoverylocation1) {
		this.recoverylocation1 = recoverylocation1;
	}

	public String getRecoverylocation2() {
		return recoverylocation2;
	}

	public void setRecoverylocation2(String recoverylocation2) {
		this.recoverylocation2 = recoverylocation2;
	}

	public String getRecoverylocation3() {
		return recoverylocation3;
	}

	public void setRecoverylocation3(String recoverylocation3) {
		this.recoverylocation3 = recoverylocation3;
	}

	public String getRecoverymm1() {
		return recoverymm1;
	}

	public void setRecoverymm1(String recoverymm1) {
		this.recoverymm1 = recoverymm1;
	}

	public String getRecoverymm2() {
		return recoverymm2;
	}

	public void setRecoverymm2(String recoverymm2) {
		this.recoverymm2 = recoverymm2;
	}

	public String getRecoverymm3() {
		return recoverymm3;
	}

	public void setRecoverymm3(String recoverymm3) {
		this.recoverymm3 = recoverymm3;
	}

	public String getRecoverytechnician1() {
		return recoverytechnician1;
	}

	public void setRecoverytechnician1(String recoverytechnician1) {
		this.recoverytechnician1 = recoverytechnician1;
	}

	public String getRecoverytechnician2() {
		return recoverytechnician2;
	}

	public void setRecoverytechnician2(String recoverytechnician2) {
		this.recoverytechnician2 = recoverytechnician2;
	}

	public String getRecoverytechnician3() {
		return recoverytechnician3;
	}

	public void setRecoverytechnician3(String recoverytechnician3) {
		this.recoverytechnician3 = recoverytechnician3;
	}

	public String getReferredtome() {
		return referredtome;
	}

	public void setReferredtome(String referredtome) {
		this.referredtome = referredtome;
	}

	public String getRegisteredccyy() {
		return registeredccyy;
	}

	public void setRegisteredccyy(String registeredccyy) {
		this.registeredccyy = registeredccyy;
	}

	public String getRegistereddate() {
		return registereddate;
	}

	public void setRegistereddate(String registereddate) {
		this.registereddate = registereddate;
	}

	public String getRegistereddd() {
		return registereddd;
	}

	public void setRegistereddd(String registereddd) {
		this.registereddd = registereddd;
	}

	public String getRegisteredmm() {
		return registeredmm;
	}

	public void setRegisteredmm(String registeredmm) {
		this.registeredmm = registeredmm;
	}

	public String getRegisteredtime() {
		return registeredtime;
	}

	public void setRegisteredtime(String registeredtime) {
		this.registeredtime = registeredtime;
	}

	public String getRegistereduser() {
		return registereduser;
	}

	public void setRegistereduser(String registereduser) {
		this.registereduser = registereduser;
	}

	public String getRejecteddate() {
		return rejecteddate;
	}

	public void setRejecteddate(String rejecteddate) {
		this.rejecteddate = rejecteddate;
	}

	public String getRejectedtime() {
		return rejectedtime;
	}

	public void setRejectedtime(String rejectedtime) {
		this.rejectedtime = rejectedtime;
	}

	public String getRejecteduser() {
		return rejecteduser;
	}

	public void setRejecteduser(String rejecteduser) {
		this.rejecteduser = rejecteduser;
	}

	public String getReleaseauthorization() {
		return releaseauthorization;
	}

	public void setReleaseauthorization(String releaseauthorization) {
		this.releaseauthorization = releaseauthorization;
	}

	public String getRemains() {
		return remains;
	}

	public void setRemains(String remains) {
		this.remains = remains;
	}

	public String getReportedby() {
		return reportedby;
	}

	public void setReportedby(String reportedby) {
		this.reportedby = reportedby;
	}

	public String getReportedto() {
		return reportedto;
	}

	public void setReportedto(String reportedto) {
		this.reportedto = reportedto;
	}

	public String getReportedtoid() {
		return reportedtoid;
	}

	public void setReportedtoid(String reportedtoid) {
		this.reportedtoid = reportedtoid;
	}

	public String getReportingagency() {
		return reportingagency;
	}

	public void setReportingagency(String reportingagency) {
		this.reportingagency = reportingagency;
	}

	public String getResareacode() {
		return resareacode;
	}

	public void setResareacode(String resareacode) {
		this.resareacode = resareacode;
	}

	public String getRescity() {
		return rescity;
	}

	public void setRescity(String rescity) {
		this.rescity = rescity;
	}

	public String getRescityfips() {
		return rescityfips;
	}

	public void setRescityfips(String rescityfips) {
		this.rescityfips = rescityfips;
	}

	public String getRescountry() {
		return rescountry;
	}

	public void setRescountry(String rescountry) {
		this.rescountry = rescountry;
	}

	public String getRescountryfips() {
		return rescountryfips;
	}

	public void setRescountryfips(String rescountryfips) {
		this.rescountryfips = rescountryfips;
	}

	public String getRescounty() {
		return rescounty;
	}

	public void setRescounty(String rescounty) {
		this.rescounty = rescounty;
	}

	public String getRescountyfips() {
		return rescountyfips;
	}

	public void setRescountyfips(String rescountyfips) {
		this.rescountyfips = rescountyfips;
	}

	public String getResincitylimits() {
		return resincitylimits;
	}

	public void setResincitylimits(String resincitylimits) {
		this.resincitylimits = resincitylimits;
	}

	public String getResname() {
		return resname;
	}

	public void setResname(String resname) {
		this.resname = resname;
	}

	public String getResphonenumber() {
		return resphonenumber;
	}

	public void setResphonenumber(String resphonenumber) {
		this.resphonenumber = resphonenumber;
	}

	public String getResstate() {
		return resstate;
	}

	public void setResstate(String resstate) {
		this.resstate = resstate;
	}

	public String getResstatefips() {
		return resstatefips;
	}

	public void setResstatefips(String resstatefips) {
		this.resstatefips = resstatefips;
	}

	public String getResstreetaddress1() {
		return resstreetaddress1;
	}

	public void setResstreetaddress1(String resstreetaddress1) {
		this.resstreetaddress1 = resstreetaddress1;
	}

	public String getResstreetaddress2() {
		return resstreetaddress2;
	}

	public void setResstreetaddress2(String resstreetaddress2) {
		this.resstreetaddress2 = resstreetaddress2;
	}

	public String getReszip4() {
		return reszip4;
	}

	public void setReszip4(String reszip4) {
		this.reszip4 = reszip4;
	}

	public String getReszip5() {
		return reszip5;
	}

	public void setReszip5(String reszip5) {
		this.reszip5 = reszip5;
	}

	public String getRigor() {
		return rigor;
	}

	public void setRigor(String rigor) {
		this.rigor = rigor;
	}

	public String getRigorspecify() {
		return rigorspecify;
	}

	public void setRigorspecify(String rigorspecify) {
		this.rigorspecify = rigorspecify;
	}

	public String getRx1() {
		return rx1;
	}

	public void setRx1(String rx1) {
		this.rx1 = rx1;
	}

	public String getRx10() {
		return rx10;
	}

	public void setRx10(String rx10) {
		this.rx10 = rx10;
	}

	public String getRx11() {
		return rx11;
	}

	public void setRx11(String rx11) {
		this.rx11 = rx11;
	}

	public String getRx12() {
		return rx12;
	}

	public void setRx12(String rx12) {
		this.rx12 = rx12;
	}

	public String getRx2() {
		return rx2;
	}

	public void setRx2(String rx2) {
		this.rx2 = rx2;
	}

	public String getRx3() {
		return rx3;
	}

	public void setRx3(String rx3) {
		this.rx3 = rx3;
	}

	public String getRx4() {
		return rx4;
	}

	public void setRx4(String rx4) {
		this.rx4 = rx4;
	}

	public String getRx5() {
		return rx5;
	}

	public void setRx5(String rx5) {
		this.rx5 = rx5;
	}

	public String getRx6() {
		return rx6;
	}

	public void setRx6(String rx6) {
		this.rx6 = rx6;
	}

	public String getRx7() {
		return rx7;
	}

	public void setRx7(String rx7) {
		this.rx7 = rx7;
	}

	public String getRx8() {
		return rx8;
	}

	public void setRx8(String rx8) {
		this.rx8 = rx8;
	}

	public String getRx9() {
		return rx9;
	}

	public void setRx9(String rx9) {
		this.rx9 = rx9;
	}

	public String getSceneaddress() {
		return sceneaddress;
	}

	public void setSceneaddress(String sceneaddress) {
		this.sceneaddress = sceneaddress;
	}

	public String getScenecity() {
		return scenecity;
	}

	public void setScenecity(String scenecity) {
		this.scenecity = scenecity;
	}

	public String getScenecounty() {
		return scenecounty;
	}

	public void setScenecounty(String scenecounty) {
		this.scenecounty = scenecounty;
	}

	public String getScenedateccyy() {
		return scenedateccyy;
	}

	public void setScenedateccyy(String scenedateccyy) {
		this.scenedateccyy = scenedateccyy;
	}

	public String getScenedatedd() {
		return scenedatedd;
	}

	public void setScenedatedd(String scenedatedd) {
		this.scenedatedd = scenedatedd;
	}

	public String getScenedatemm() {
		return scenedatemm;
	}

	public void setScenedatemm(String scenedatemm) {
		this.scenedatemm = scenedatemm;
	}

	public String getScenestate() {
		return scenestate;
	}

	public void setScenestate(String scenestate) {
		this.scenestate = scenestate;
	}

	public String getScenezip4() {
		return scenezip4;
	}

	public void setScenezip4(String scenezip4) {
		this.scenezip4 = scenezip4;
	}

	public String getScenezip5() {
		return scenezip5;
	}

	public void setScenezip5(String scenezip5) {
		this.scenezip5 = scenezip5;
	}

	public String getSpecialattentionfortox() {
		return specialattentionfortox;
	}

	public void setSpecialattentionfortox(String specialattentionfortox) {
		this.specialattentionfortox = specialattentionfortox;
	}

	public String getSpecialattentionfortox2() {
		return specialattentionfortox2;
	}

	public void setSpecialattentionfortox2(String specialattentionfortox2) {
		this.specialattentionfortox2 = specialattentionfortox2;
	}

	public String getSpousefirst() {
		return spousefirst;
	}

	public void setSpousefirst(String spousefirst) {
		this.spousefirst = spousefirst;
	}

	public String getSpouselast() {
		return spouselast;
	}

	public void setSpouselast(String spouselast) {
		this.spouselast = spouselast;
	}

	public String getSpousemiddle() {
		return spousemiddle;
	}

	public void setSpousemiddle(String spousemiddle) {
		this.spousemiddle = spousemiddle;
	}

	public String getSpousesuffix() {
		return spousesuffix;
	}

	public void setSpousesuffix(String spousesuffix) {
		this.spousesuffix = spousesuffix;
	}

	public String getSsaDate() {
		return ssaDate;
	}

	public void setSsaDate(String ssaDate) {
		this.ssaDate = ssaDate;
	}

	public String getSsaExportdate() {
		return ssaExportdate;
	}

	public void setSsaExportdate(String ssaExportdate) {
		this.ssaExportdate = ssaExportdate;
	}

//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		status = status;
//	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getStateofdeath() {
		return stateofdeath;
	}

	public void setStateofdeath(String stateofdeath) {
		this.stateofdeath = stateofdeath;
	}

//	public String getStevMortalityExportdate() {
//		return stevMortalityExportdate;
//	}
//
//	public void setStevMortalityExportdate(String stevMortalityExportdate) {
//		this.stevMortalityExportdate = stevMortalityExportdate;
//	}
//
//	public String getStevRoster_Exportdate() {
//		return stevRoster_Exportdate;
//	}
//
//	public void setStevRoster_Exportdate(String stevRoster_Exportdate) {
//		this.stevRoster_Exportdate = stevRoster_Exportdate;
//	}

	public String getSuspectedcauseofdeath() {
		return suspectedcauseofdeath;
	}

	public void setSuspectedcauseofdeath(String suspectedcauseofdeath) {
		this.suspectedcauseofdeath = suspectedcauseofdeath;
	}

	public String getSuspectedmannerofdeath() {
		return suspectedmannerofdeath;
	}

	public void setSuspectedmannerofdeath(String suspectedmannerofdeath) {
		this.suspectedmannerofdeath = suspectedmannerofdeath;
	}

	public String getSysnum() {
		return sysnum;
	}

	public void setSysnum(String sysnum) {
		this.sysnum = sysnum;
	}

	public String getTimearrivedscenehh() {
		return timearrivedscenehh;
	}

	public void setTimearrivedscenehh(String timearrivedscenehh) {
		this.timearrivedscenehh = timearrivedscenehh;
	}

	public String getTimearrivedscenemm() {
		return timearrivedscenemm;
	}

	public void setTimearrivedscenemm(String timearrivedscenemm) {
		this.timearrivedscenemm = timearrivedscenemm;
	}

	public String getTimelastseenalivehh() {
		return timelastseenalivehh;
	}

	public void setTimelastseenalivehh(String timelastseenalivehh) {
		this.timelastseenalivehh = timelastseenalivehh;
	}

	public String getTimelastseenalivemm() {
		return timelastseenalivemm;
	}

	public void setTimelastseenalivemm(String timelastseenalivemm) {
		this.timelastseenalivemm = timelastseenalivemm;
	}

	public String getTimeleftscenehh() {
		return timeleftscenehh;
	}

	public void setTimeleftscenehh(String timeleftscenehh) {
		this.timeleftscenehh = timeleftscenehh;
	}

	public String getTimeleftscenemm() {
		return timeleftscenemm;
	}

	public void setTimeleftscenemm(String timeleftscenemm) {
		this.timeleftscenemm = timeleftscenemm;
	}

	public String getTimeofdeathhh() {
		return timeofdeathhh;
	}

	public void setTimeofdeathhh(String timeofdeathhh) {
		this.timeofdeathhh = timeofdeathhh;
	}

	public String getTimeofdeathmm() {
		return timeofdeathmm;
	}

	public void setTimeofdeathmm(String timeofdeathmm) {
		this.timeofdeathmm = timeofdeathmm;
	}

	public String getTimereportedhh() {
		return timereportedhh;
	}

	public void setTimereportedhh(String timereportedhh) {
		this.timereportedhh = timereportedhh;
	}

	public String getTimereportedmm() {
		return timereportedmm;
	}

	public void setTimereportedmm(String timereportedmm) {
		this.timereportedmm = timereportedmm;
	}

	public String getTobacco() {
		return tobacco;
	}

	public void setTobacco(String tobacco) {
		this.tobacco = tobacco;
	}

	public String getTotalblocks() {
		return totalblocks;
	}

	public void setTotalblocks(String totalblocks) {
		this.totalblocks = totalblocks;
	}

	public String getTotalnp() {
		return totalnp;
	}

	public void setTotalnp(String totalnp) {
		this.totalnp = totalnp;
	}

	public String getTransferredfrom1() {
		return transferredfrom1;
	}

	public void setTransferredfrom1(String transferredfrom1) {
		this.transferredfrom1 = transferredfrom1;
	}

	public String getTransferredfrom2() {
		return transferredfrom2;
	}

	public void setTransferredfrom2(String transferredfrom2) {
		this.transferredfrom2 = transferredfrom2;
	}

	public String getTransferredfrom3() {
		return transferredfrom3;
	}

	public void setTransferredfrom3(String transferredfrom3) {
		this.transferredfrom3 = transferredfrom3;
	}

	public String getTransportcompany1() {
		return transportcompany1;
	}

	public void setTransportcompany1(String transportcompany1) {
		this.transportcompany1 = transportcompany1;
	}

	public String getTransportcompany2() {
		return transportcompany2;
	}

	public void setTransportcompany2(String transportcompany2) {
		this.transportcompany2 = transportcompany2;
	}

	public String getTransportcompany3() {
		return transportcompany3;
	}

	public void setTransportcompany3(String transportcompany3) {
		this.transportcompany3 = transportcompany3;
	}

	public String getTypeofcase() {
		return typeofcase;
	}

	public void setTypeofcase(String typeofcase) {
		this.typeofcase = typeofcase;
	}

	public String getTypeofpartialautopsy() {
		return typeofpartialautopsy;
	}

	public void setTypeofpartialautopsy(String typeofpartialautopsy) {
		this.typeofpartialautopsy = typeofpartialautopsy;
	}

	public String getUmedRace() {
		return umedRace;
	}

	public void setUmedRace(String umedRace) {
		this.umedRace = umedRace;
	}

	public String getUmedrecord() {
		return umedrecord;
	}

	public void setUmedrecord(String umedrecord) {
		this.umedrecord = umedrecord;
	}

	public String getUnderlyingcause() {
		return underlyingcause;
	}

	public void setUnderlyingcause(String underlyingcause) {
		this.underlyingcause = underlyingcause;
	}

	public String getUnderlyingcode() {
		return underlyingcode;
	}

	public void setUnderlyingcode(String underlyingcode) {
		this.underlyingcode = underlyingcode;
	}

	public String getUnderlyinginterval() {
		return underlyinginterval;
	}

	public void setUnderlyinginterval(String underlyinginterval) {
		this.underlyinginterval = underlyinginterval;
	}

	public String getUnderlyingintervalunit() {
		return underlyingintervalunit;
	}

	public void setUnderlyingintervalunit(String underlyingintervalunit) {
		this.underlyingintervalunit = underlyingintervalunit;
	}

	public String getVehiclecolor() {
		return vehiclecolor;
	}

	public void setVehiclecolor(String vehiclecolor) {
		this.vehiclecolor = vehiclecolor;
	}

	public String getVehiclelicensenumber() {
		return vehiclelicensenumber;
	}

	public void setVehiclelicensenumber(String vehiclelicensenumber) {
		this.vehiclelicensenumber = vehiclelicensenumber;
	}

	public String getVehiclelicensestate() {
		return vehiclelicensestate;
	}

	public void setVehiclelicensestate(String vehiclelicensestate) {
		this.vehiclelicensestate = vehiclelicensestate;
	}

	public String getVehiclemake() {
		return vehiclemake;
	}

	public void setVehiclemake(String vehiclemake) {
		this.vehiclemake = vehiclemake;
	}

	public String getVehiclemodel() {
		return vehiclemodel;
	}

	public void setVehiclemodel(String vehiclemodel) {
		this.vehiclemodel = vehiclemodel;
	}

	public String getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	public String getWeaponbarrellength() {
		return weaponbarrellength;
	}

	public void setWeaponbarrellength(String weaponbarrellength) {
		this.weaponbarrellength = weaponbarrellength;
	}

	public String getWeaponcaliber() {
		return weaponcaliber;
	}

	public void setWeaponcaliber(String weaponcaliber) {
		this.weaponcaliber = weaponcaliber;
	}

	public String getWeaponmake() {
		return weaponmake;
	}

	public void setWeaponmake(String weaponmake) {
		this.weaponmake = weaponmake;
	}

	public String getWeaponmakespecify() {
		return weaponmakespecify;
	}

	public void setWeaponmakespecify(String weaponmakespecify) {
		this.weaponmakespecify = weaponmakespecify;
	}

	public String getWeaponmodel() {
		return weaponmodel;
	}

	public void setWeaponmodel(String weaponmodel) {
		this.weaponmodel = weaponmodel;
	}

	public String getWeaponserialnumber() {
		return weaponserialnumber;
	}

	public void setWeaponserialnumber(String weaponserialnumber) {
		this.weaponserialnumber = weaponserialnumber;
	}

	public String getWeapontype() {
		return weapontype;
	}

	public void setWeapontype(String weapontype) {
		this.weapontype = weapontype;
	}

	public String getWitness1() {
		return witness1;
	}

	public void setWitness1(String witness1) {
		this.witness1 = witness1;
	}

	public String getWitness2() {
		return witness2;
	}

	public void setWitness2(String witness2) {
		this.witness2 = witness2;
	}

	public String getWitness3() {
		return witness3;
	}

	public void setWitness3(String witness3) {
		this.witness3 = witness3;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Edenmaster [statefilenumber=" + statefilenumber + ", additionalcause1=" + additionalcause1
				+ ", additionalcause2=" + additionalcause2 + ", additionalinterval1=" + additionalinterval1
				+ ", additionalinterval2=" + additionalinterval2 + ", additionalintervalunit1="
				+ additionalintervalunit1 + ", additionalintervalunit2=" + additionalintervalunit2 + ", ageindays="
				+ ageindays + ", ageinhours=" + ageinhours + ", ageinminutes=" + ageinminutes + ", ageinmonths="
				+ ageinmonths + ", ageinyears=" + ageinyears + ", agency1=" + agency1 + ", agency2=" + agency2
				+ ", agency3=" + agency3 + ", agencycontact1=" + agencycontact1 + ", agencycontact2=" + agencycontact2
				+ ", agencycontact3=" + agencycontact3 + ", agencynotifiedby1=" + agencynotifiedby1
				+ ", agencynotifiedby2=" + agencynotifiedby2 + ", agencynotifiedby3=" + agencynotifiedby3
				+ ", agencynotifiedccyy1=" + agencynotifiedccyy1 + ", agencynotifiedccyy2=" + agencynotifiedccyy2
				+ ", agencynotifiedccyy3=" + agencynotifiedccyy3 + ", agencynotifieddd1=" + agencynotifieddd1
				+ ", agencynotifieddd2=" + agencynotifieddd2 + ", agencynotifieddd3=" + agencynotifieddd3
				+ ", agencynotifiedmm1=" + agencynotifiedmm1 + ", agencynotifiedmm2=" + agencynotifiedmm2
				+ ", agencynotifiedmm3=" + agencynotifiedmm3 + ", agencynotifiedtimehh1=" + agencynotifiedtimehh1
				+ ", agencynotifiedtimehh2=" + agencynotifiedtimehh2 + ", agencynotifiedtimehh3="
				+ agencynotifiedtimehh3 + ", agencynotifiedtimemm1=" + agencynotifiedtimemm1
				+ ", agencynotifiedtimemm2=" + agencynotifiedtimemm2 + ", agencynotifiedtimemm3="
				+ agencynotifiedtimemm3 + ", agenumberofunits=" + agenumberofunits + ", ageunit=" + ageunit
				+ ", alias1first=" + alias1first + ", alias1last=" + alias1last + ", alias1middle=" + alias1middle
				+ ", alias2first=" + alias2first + ", alias2last=" + alias2last + ", alias2middle=" + alias2middle
				+ ", alternate1first=" + alternate1first + ", alternate1last=" + alternate1last
				+ ", alternate1systemid=" + alternate1systemid + ", alternate1title=" + alternate1title
				+ ", alternate2first=" + alternate2first + ", alternate2last=" + alternate2last
				+ ", alternate2systemid=" + alternate2systemid + ", alternate2title=" + alternate2title
				+ ", ambienttemp=" + ambienttemp + ", ambienttemptimeHH=" + ambienttemptimeHH + ", ambienttemptimeMM="
				+ ambienttemptimeMM + ", ammunitioncaliber=" + ammunitioncaliber + ", ammunitionmake=" + ammunitionmake
				+ ", ammunitionmakespecify=" + ammunitionmakespecify + ", animal=" + animal + ", armedforces="
				+ armedforces + ", autopsyavailable=" + autopsyavailable + ", autopsydone=" + autopsydone
				+ ", birthccyy=" + birthccyy + ", birthcity=" + birthcity + ", birthcountry=" + birthcountry
				+ ", birthcountryfips=" + birthcountryfips + ", birthcounty=" + birthcounty + ", birthdd=" + birthdd
				+ ", birthmm=" + birthmm + ", birthstate=" + birthstate + ", birthstatefilenumber="
				+ birthstatefilenumber + ", birthstatefips=" + birthstatefips + ", blockscomment=" + blockscomment
				+ ", bodyhold=" + bodyhold + ", bodyholdremovedccyy=" + bodyholdremovedccyy + ", bodyholdremoveddd="
				+ bodyholdremoveddd + ", bodyholdremovedmm=" + bodyholdremovedmm + ", bodyholdremovedtimehh="
				+ bodyholdremovedtimehh + ", bodyholdremovedtimemm=" + bodyholdremovedtimemm + ", bodypositionf="
				+ bodypositionf + ", bodypositionh=" + bodypositionh + ", bodypositionk=" + bodypositionk
				+ ", bodypositionl=" + bodypositionl + ", bodypositiono=" + bodypositiono + ", bodypositionp="
				+ bodypositionp + ", bodypositionr=" + bodypositionr + ", bodypositions=" + bodypositions
				+ ", bodypositionspecify=" + bodypositionspecify + ", bodypositionu=" + bodypositionu
				+ ", bodyreleasedby=" + bodyreleasedby + ", bodyreleasedccyy=" + bodyreleasedccyy + ", bodyreleaseddd="
				+ bodyreleaseddd + ", bodyreleasedmm=" + bodyreleasedmm + ", bodyreleasedtimehh=" + bodyreleasedtimehh
				+ ", bodyreleasedtimemm=" + bodyreleasedtimemm + ", bodyreleasedto=" + bodyreleasedto + ", bodytemp="
				+ bodytemp + ", bodytemptimehh=" + bodytemptimehh + ", bodytemptimemm=" + bodytemptimemm + ", brainfix="
				+ brainfix + ", burialhomename=" + burialhomename + ", certcertdate=" + certcertdate + ", certcerttime="
				+ certcerttime + ", certcertuser=" + certcertuser + ", certeditdate=" + certeditdate + ", certedittime="
				+ certedittime + ", certedituser=" + certedituser + ", certifieraddress1=" + certifieraddress1
				+ ", certifieraddress2=" + certifieraddress2 + ", certifiercity=" + certifiercity
				+ ", certifiercountry=" + certifiercountry + ", certifierfullname=" + certifierfullname
				+ ", certifierlicense=" + certifierlicense + ", certifiernotes1=" + certifiernotes1
				+ ", certifiernotes2=" + certifiernotes2 + ", certifierpreferredcontact=" + certifierpreferredcontact
				+ ", certifiersignature=" + certifiersignature + ", certifiersignccyy=" + certifiersignccyy
				+ ", certifiersigndd=" + certifiersigndd + ", certifiersignmm=" + certifiersignmm + ", certifierstate="
				+ certifierstate + ", certifierstatus=" + certifierstatus + ", certifieruser=" + certifieruser
				+ ", certifierzip4=" + certifierzip4 + ", certifierzip5=" + certifierzip5 + ", certrelinquishdate="
				+ certrelinquishdate + ", certrelinquishtime=" + certrelinquishtime + ", certrelinquishuser="
				+ certrelinquishuser + ", certstartdate=" + certstartdate + ", certstarttime=" + certstarttime
				+ ", certstartuser=" + certstartuser + ", cityofdeath=" + cityofdeath + ", cityofdeathfips="
				+ cityofdeathfips + ", codLiteralcontrib1=" + codLiteralcontrib1 + ", codLiteralcontrib2="
				+ codLiteralcontrib2 + ", codLiteralcontrib3=" + codLiteralcontrib3 + ", codLiteralcontrib4="
				+ codLiteralcontrib4 + ", codLiteralcontrib5=" + codLiteralcontrib5 + ", codLiteralcontrib6="
				+ codLiteralcontrib6 + ", codLiteralcontrib7=" + codLiteralcontrib7 + ", codLiteralcontrib8="
				+ codLiteralcontrib8 + ", codLiteralcontrib9=" + codLiteralcontrib9 + ", codLiteralunderlying="
				+ codLiteralunderlying + ", contribcode1=" + contribcode1 + ", contribcode2=" + contribcode2
				+ ", contribcode3=" + contribcode3 + ", contribcode4=" + contribcode4 + ", contribcode5=" + contribcode5
				+ ", contribcode6=" + contribcode6 + ", contribcode7=" + contribcode7 + ", contribcode8=" + contribcode8
				+ ", contribcode9=" + contribcode9 + ", countyofdeath=" + countyofdeath + ", countyofdeathfips="
				+ countyofdeathfips + ", courtdelayedflag=" + courtdelayedflag + ", createddate=" + createddate
				+ ", createdtime=" + createdtime + ", createduser=" + createduser + ", dataimported=" + dataimported
				+ ", dateblocks1ccyy=" + dateblocks1ccyy + ", dateblocks1dd=" + dateblocks1dd + ", dateblocks1mm="
				+ dateblocks1mm + ", dateblocks2ccyy=" + dateblocks2ccyy + ", dateblocks2dd=" + dateblocks2dd
				+ ", dateblocks2mm=" + dateblocks2mm + ", dateblocks3ccyy=" + dateblocks3ccyy + ", dateblocks3dd="
				+ dateblocks3dd + ", dateblocks3mm=" + dateblocks3mm + ", datenp1ccyy=" + datenp1ccyy + ", datenp1dd="
				+ datenp1dd + ", datenp1mm=" + datenp1mm + ", datenp2ccyy=" + datenp2ccyy + ", datenp2dd=" + datenp2dd
				+ ", datenp2mm=" + datenp2mm + ", datereportedccyy=" + datereportedccyy + ", datereporteddd="
				+ datereporteddd + ", datereportedmm=" + datereportedmm + ", dayslastseentodeath=" + dayslastseentodeath
				+ ", dcPreorderdelivery=" + dcPreorderdelivery + ", dcPreorderprinted=" + dcPreorderprinted
				+ ", dcPreorderquantity=" + dcPreorderquantity + ", deathccyy=" + deathccyy + ", deathdd=" + deathdd
				+ ", deathmm=" + deathmm + ", deathzip4=" + deathzip4 + ", deathzip5=" + deathzip5
				+ ", deceasedeyecolor=" + deceasedeyecolor + ", deceasedfirst=" + deceasedfirst + ", deceasedhaircolor="
				+ deceasedhaircolor + ", deceasedheightcm=" + deceasedheightcm + ", deceasedheightinches="
				+ deceasedheightinches + ", deceasedlast=" + deceasedlast + ", deceasedmiddle=" + deceasedmiddle
				+ ", deceasedsuffix=" + deceasedsuffix + ", deceasedweightkg=" + deceasedweightkg
				+ ", deceasedweightlbs=" + deceasedweightlbs + ", decompbloating=" + decompbloating
				+ ", decompdiscoloration=" + decompdiscoloration + ", decompmaggot=" + decompmaggot
				+ ", decompmummification=" + decompmummification + ", decompnone=" + decompnone + ", decomposed="
				+ decomposed + ", decompother=" + decompother + ", decompskeletonization=" + decompskeletonization
				+ ", decompspecify=" + decompspecify + ", delayedflag=" + delayedflag + ", deleteddate=" + deleteddate
				+ ", deletedtime=" + deletedtime + ", deleteduser=" + deleteduser + ", dentalxRays=" + dentalxRays
				+ ", descriptionofxRays=" + descriptionofxRays + ", detectivename=" + detectivename + ", dispatchccyy="
				+ dispatchccyy + ", dispatchdd=" + dispatchdd + ", dispatchmm=" + dispatchmm + ", dispatchtimehh="
				+ dispatchtimehh + ", dispatchtimemm=" + dispatchtimemm + ", dispositionburial=" + dispositionburial
				+ ", dispositionccyy=" + dispositionccyy + ", dispositioncemetery=" + dispositioncemetery
				+ ", dispositioncity=" + dispositioncity + ", dispositioncountry=" + dispositioncountry
				+ ", dispositioncounty=" + dispositioncounty + ", dispositioncremation=" + dispositioncremation
				+ ", dispositiondd=" + dispositiondd + ", dispositiondonation=" + dispositiondonation
				+ ", dispositionentombment=" + dispositionentombment + ", dispositionmm=" + dispositionmm
				+ ", dispositionother=" + dispositionother + ", dispositionotherspec=" + dispositionotherspec
				+ ", dispositionremoval=" + dispositionremoval + ", dispositionstate=" + dispositionstate
				+ ", donoragency1=" + donoragency1 + ", donoragency2=" + donoragency2 + ", donoragency3=" + donoragency3
				+ ", donoragencyspecify1=" + donoragencyspecify1 + ", donoragencyspecify2=" + donoragencyspecify2
				+ ", donoragencyspecify3=" + donoragencyspecify3 + ", droppaperdate=" + droppaperdate
				+ ", droppapertime=" + droppapertime + ", droppaperuser=" + droppaperuser + ", dupenamewarning="
				+ dupenamewarning + ", dwExportdate=" + dwExportdate + ", dwsExportdate=" + dwsExportdate
				+ ", edenrecord=" + edenrecord + ", education=" + education + ", employmentstatus=" + employmentstatus
				+ ", examassistant=" + examassistant + ", examccyy=" + examccyy + ", examdd=" + examdd
				+ ", examinationtype=" + examinationtype + ", examlocation=" + examlocation + ", examlocationspecify="
				+ examlocationspecify + ", exammd=" + exammd + ", exammdLicense=" + exammdLicense + ", exammdType="
				+ exammdType + ", exammm=" + exammm + ", examsummary=" + examsummary + ", examsummary2=" + examsummary2
				+ ", examtimehh=" + examtimehh + ", examtimemm=" + examtimemm + ", facilitycode=" + facilitycode
				+ ", facilityname=" + facilityname + ", fatherfirst=" + fatherfirst + ", fatherlast=" + fatherlast
				+ ", fathermiddle=" + fathermiddle + ", fathersuffix=" + fathersuffix + ", fhEditdate=" + fhEditdate
				+ ", fhEdittime=" + fhEdittime + ", fhEdituser=" + fhEdituser + ", fhRelinquishdate=" + fhRelinquishdate
				+ ", fhRelinquishtime=" + fhRelinquishtime + ", fhRelinquishuser=" + fhRelinquishuser + ", fhSigndate="
				+ fhSigndate + ", fhSigntime=" + fhSigntime + ", fhSignuser=" + fhSignuser + ", fhStartdate="
				+ fhStartdate + ", fhStarttime=" + fhStarttime + ", fhStartuser=" + fhStartuser + ", fhirsentreceived="
				+ fhirsentreceived + ", founddate=" + founddate + ", foundtime=" + foundtime + ", funeraladdress1="
				+ funeraladdress1 + ", funeraladdress2=" + funeraladdress2 + ", funeralcity=" + funeralcity
				+ ", funeralcounty=" + funeralcounty + ", funeraldirlicense=" + funeraldirlicense
				+ ", funeraldirsignature=" + funeraldirsignature + ", funeralhomeauthby=" + funeralhomeauthby
				+ ", funeralhomecontactedname=" + funeralhomecontactedname + ", funeralhomelicense="
				+ funeralhomelicense + ", funeralhomename=" + funeralhomename + ", funeralhomenotifby="
				+ funeralhomenotifby + ", funeralhomenotifccyy=" + funeralhomenotifccyy + ", funeralhomenotifdd="
				+ funeralhomenotifdd + ", funeralhomenotifmm=" + funeralhomenotifmm + ", funeralhomenotiftimehh="
				+ funeralhomenotiftimehh + ", funeralhomenotiftimemm=" + funeralhomenotiftimemm
				+ ", funeralhomereleasedtoname=" + funeralhomereleasedtoname + ", funeralhomestatus="
				+ funeralhomestatus + ", funeralhomeuser=" + funeralhomeuser + ", funeralnotes1=" + funeralnotes1
				+ ", funeralnotes2=" + funeralnotes2 + ", funeralstate=" + funeralstate + ", funeraltradecall="
				+ funeraltradecall + ", funeralzip4=" + funeralzip4 + ", funeralzip5=" + funeralzip5 + ", gender="
				+ gender + ", gpsNorthcoordinate=" + gpsNorthcoordinate + ", gpsWestcoordinate=" + gpsWestcoordinate
				+ ", hazardouscase=" + hazardouscase + ", hazardousreason=" + hazardousreason
				+ ", hazardousreasonspecify=" + hazardousreasonspecify + ", hispaniccuban=" + hispaniccuban
				+ ", hispanicmex=" + hispanicmex + ", hispanicorigin=" + hispanicorigin + ", hispanicother="
				+ hispanicother + ", hispanicotherspec=" + hispanicotherspec + ", hispanicpr=" + hispanicpr
				+ ", histology=" + histology + ", holdreason=" + holdreason + ", holdreasonspecify=" + holdreasonspecify
				+ ", identificationagency=" + identificationagency + ", identificationdateccyy="
				+ identificationdateccyy + ", identificationdatedd=" + identificationdatedd + ", identificationdatemm="
				+ identificationdatemm + ", identificationmethod=" + identificationmethod
				+ ", identificationmethodspecify=" + identificationmethodspecify + ", identificationstatus="
				+ identificationstatus + ", identifiedby=" + identifiedby + ", immediatecause=" + immediatecause
				+ ", immediateinterval=" + immediateinterval + ", immediateintervalunit=" + immediateintervalunit
				+ ", industry=" + industry + ", industrycode=" + industrycode + ", informant2address1="
				+ informant2address1 + ", informant2address2=" + informant2address2 + ", informant2city="
				+ informant2city + ", informant2country=" + informant2country + ", informant2county=" + informant2county
				+ ", informant2first=" + informant2first + ", informant2last=" + informant2last + ", informant2middle="
				+ informant2middle + ", informant2relation=" + informant2relation + ", informant2state="
				+ informant2state + ", informant2suffix=" + informant2suffix + ", informant2zip4=" + informant2zip4
				+ ", informant2zip5=" + informant2zip5 + ", informantaddress1=" + informantaddress1
				+ ", informantaddress2=" + informantaddress2 + ", informantcity=" + informantcity
				+ ", informantcountry=" + informantcountry + ", informantcounty=" + informantcounty
				+ ", informantfirst=" + informantfirst + ", informantlast=" + informantlast + ", informantmiddle="
				+ informantmiddle + ", informantrelation=" + informantrelation + ", informantstate=" + informantstate
				+ ", informantsuffix=" + informantsuffix + ", informantzip4=" + informantzip4 + ", informantzip5="
				+ informantzip5 + ", injury=" + injury + ", injuryatwork=" + injuryatwork + ", injuryccyy=" + injuryccyy
				+ ", injurycity=" + injurycity + ", injurycityfips=" + injurycityfips + ", injurycountry="
				+ injurycountry + ", injurycountryfips=" + injurycountryfips + ", injurycounty=" + injurycounty
				+ ", injurycountyfips=" + injurycountyfips + ", injurydd=" + injurydd + ", injurydescription1="
				+ injurydescription1 + ", injurydescription2=" + injurydescription2 + ", injurymm=" + injurymm
				+ ", injurymotorspec=" + injurymotorspec + ", injurymotorvehicle=" + injurymotorvehicle
				+ ", injuryplace=" + injuryplace + ", injurystate=" + injurystate + ", injurystatefips="
				+ injurystatefips + ", injurystreet=" + injurystreet + ", injurytimehh=" + injurytimehh
				+ ", injurytimemm=" + injurytimemm + ", injurywitnessed=" + injurywitnessed + ", injuryzip4="
				+ injuryzip4 + ", injuryzip5=" + injuryzip5 + ", invdayslastseentodeath=" + invdayslastseentodeath
				+ ", investigatoratscene=" + investigatoratscene + ", investigatorsummary=" + investigatorsummary
				+ ", invinjury=" + invinjury + ", invinjuryatwork=" + invinjuryatwork + ", invinjuryccyy="
				+ invinjuryccyy + ", invinjurycity=" + invinjurycity + ", invinjurycountry=" + invinjurycountry
				+ ", invinjurycounty=" + invinjurycounty + ", invinjurydd=" + invinjurydd + ", invinjurydescription1="
				+ invinjurydescription1 + ", invinjurydescription2=" + invinjurydescription2 + ", invinjurymm="
				+ invinjurymm + ", invinjurymotorspecify=" + invinjurymotorspecify + ", invinjurymotorvehicle="
				+ invinjurymotorvehicle + ", invinjuryplace=" + invinjuryplace + ", invinjurystate=" + invinjurystate
				+ ", invinjurystreet=" + invinjurystreet + ", invinjurytimehh=" + invinjurytimehh + ", invinjurytimemm="
				+ invinjurytimemm + ", invlastseenccyy=" + invlastseenccyy + ", invlastseendd=" + invlastseendd
				+ ", invlastseenmm=" + invlastseenmm + ", invpregnant=" + invpregnant + ", invtobacco=" + invtobacco
				+ ", kinaddress1=" + kinaddress1 + ", kinaddress2=" + kinaddress2 + ", kinareacode=" + kinareacode
				+ ", kincity=" + kincity + ", kincountry=" + kincountry + ", kinfirst=" + kinfirst + ", kinlast="
				+ kinlast + ", kinmiddle=" + kinmiddle + ", kinnotes1=" + kinnotes1 + ", kinnotes2=" + kinnotes2
				+ ", kinnotifyby=" + kinnotifyby + ", kinnotifybyspecify=" + kinnotifybyspecify + ", kinnotifyccyy="
				+ kinnotifyccyy + ", kinnotifydd=" + kinnotifydd + ", kinnotifymm=" + kinnotifymm + ", kinnotifytimehh="
				+ kinnotifytimehh + ", kinnotifytimemm=" + kinnotifytimemm + ", kinphonenumber=" + kinphonenumber
				+ ", kinrelation=" + kinrelation + ", kinstate=" + kinstate + ", kinsuffix=" + kinsuffix + ", kinzip4="
				+ kinzip4 + ", kinzip5=" + kinzip5 + ", labchemistries=" + labchemistries + ", labcultures="
				+ labcultures + ", labmetabolicscreen=" + labmetabolicscreen + ", labother=" + labother
				+ ", labotherspecify=" + labotherspecify + ", labserology=" + labserology + ", labtoxdrawn="
				+ labtoxdrawn + ", labvirology=" + labvirology + ", lastseenaliveaddress=" + lastseenaliveaddress
				+ ", lastseenaliveby=" + lastseenaliveby + ", lastseenaliveccyy=" + lastseenaliveccyy
				+ ", lastseenalivedd=" + lastseenalivedd + ", lastseenalivemm=" + lastseenalivemm + ", lastseenccyy="
				+ lastseenccyy + ", lastseendd=" + lastseendd + ", lastseenmm=" + lastseenmm + ", lastupdated="
				+ lastupdated + ", lawenforcementagency=" + lawenforcementagency + ", lawenforcementcasenumber="
				+ lawenforcementcasenumber + ", lhdNotes1=" + lhdNotes1 + ", lhdNotes2=" + lhdNotes2
				+ ", lividdistanterior=" + lividdistanterior + ", lividdistcaudal=" + lividdistcaudal
				+ ", lividdistleft=" + lividdistleft + ", lividdistposterior=" + lividdistposterior
				+ ", lividdistright=" + lividdistright + ", lividdistrostral=" + lividdistrostral + ", lividity="
				+ lividity + ", lividityfaint=" + lividityfaint + ", lividityspecify=" + lividityspecify
				+ ", localmdAreacode=" + localmdAreacode + ", localmdCity=" + localmdCity + ", localmdFirst="
				+ localmdFirst + ", localmdLast=" + localmdLast + ", localmdPhonenumber=" + localmdPhonenumber
				+ ", lockedtouser=" + lockedtouser + ", lockedtousername=" + lockedtousername + ", mannerofdeath="
				+ mannerofdeath + ", maritalstatus=" + maritalstatus + ", masterstatus=" + masterstatus + ", mdAtScene="
				+ mdAtScene + ", meCasenumber=" + meCasenumber + ", meContacted=" + meContacted + ", meContactednotes="
				+ meContactednotes + ", meReview=" + meReview + ", meType=" + meType + ", medicalconditions1="
				+ medicalconditions1 + ", medicalconditions2=" + medicalconditions2 + ", medicalconditions3="
				+ medicalconditions3 + ", medicalconditions4=" + medicalconditions4 + ", medicalconditions5="
				+ medicalconditions5 + ", medicalconditions6=" + medicalconditions6 + ", micarExportdate="
				+ micarExportdate + ", motherfirst=" + motherfirst + ", mothermaidenname=" + mothermaidenname
				+ ", mothermiddle=" + mothermiddle + ", mothersuffix=" + mothersuffix + ", mrn=" + mrn
				+ ", nchsExportdate=" + nchsExportdate + ", neverseenalive=" + neverseenalive + ", nonfacilitylocation="
				+ nonfacilitylocation + ", npComment=" + npComment + ", numberblocks1=" + numberblocks1
				+ ", numberblocks2=" + numberblocks2 + ", numberblocks3=" + numberblocks3 + ", numbernp1=" + numbernp1
				+ ", numbernp2=" + numbernp2 + ", numberofxRays=" + numberofxRays + ", nursinghomename="
				+ nursinghomename + ", occupation=" + occupation + ", occupationcode=" + occupationcode
				+ ", odontologistconfirmccyy=" + odontologistconfirmccyy + ", odontologistconfirmdd="
				+ odontologistconfirmdd + ", odontologistconfirmmm=" + odontologistconfirmmm
				+ ", odontologistcontactccyy=" + odontologistcontactccyy + ", odontologistcontactdd="
				+ odontologistcontactdd + ", odontologistcontactmm=" + odontologistcontactmm + ", odontologistname="
				+ odontologistname + ", omePhotosCd=" + omePhotosCd + ", omePhotosDownloaded=" + omePhotosDownloaded
				+ ", omePhotosEmailed=" + omePhotosEmailed + ", omePhotosOther=" + omePhotosOther
				+ ", omePhotosSpecify=" + omePhotosSpecify + ", omeTransferdate=" + omeTransferdate
				+ ", omeTransfertime=" + omeTransfertime + ", omeTransferuser=" + omeTransferuser + ", omeVideo="
				+ omeVideo + ", organsbone1=" + organsbone1 + ", organsbone2=" + organsbone2 + ", organsbone3="
				+ organsbone3 + ", organseyes1=" + organseyes1 + ", organseyes2=" + organseyes2 + ", organseyes3="
				+ organseyes3 + ", organsheartvalve1=" + organsheartvalve1 + ", organsheartvalve2=" + organsheartvalve2
				+ ", organsheartvalve3=" + organsheartvalve3 + ", organsskin1=" + organsskin1 + ", organsskin2="
				+ organsskin2 + ", organsskin3=" + organsskin3 + ", organsvein1=" + organsvein1 + ", organsvein2="
				+ organsvein2 + ", organsvein3=" + organsvein3 + ", organsvital1=" + organsvital1 + ", organsvital2="
				+ organsvital2 + ", organsvital3=" + organsvital3 + ", otheragencyphotos=" + otheragencyphotos
				+ ", otheragencyvideos=" + otheragencyvideos + ", othercasenumbers=" + othercasenumbers
				+ ", otherconditions=" + otherconditions + ", placeofdeath=" + placeofdeath + ", podOtherspec="
				+ podOtherspec + ", pregnant=" + pregnant + ", processingnote=" + processingnote + ", raceamindian="
				+ raceamindian + ", raceasianindian=" + raceasianindian + ", raceasianspec=" + raceasianspec
				+ ", raceblack=" + raceblack + ", racechinese=" + racechinese + ", racefilipino=" + racefilipino
				+ ", raceguamanian=" + raceguamanian + ", racehawaiian=" + racehawaiian + ", raceislanderspec="
				+ raceislanderspec + ", racejapanese=" + racejapanese + ", racekorean=" + racekorean + ", raceother="
				+ raceother + ", raceotherasian=" + raceotherasian + ", raceotherspec=" + raceotherspec
				+ ", racepacislander=" + racepacislander + ", racesamoan=" + racesamoan + ", racetribespec="
				+ racetribespec + ", raceunknown=" + raceunknown + ", racevietnamese=" + racevietnamese + ", racewhite="
				+ racewhite + ", reasonrejected=" + reasonrejected + ", receivedby=" + receivedby + ", receivedccyy="
				+ receivedccyy + ", receiveddd=" + receiveddd + ", receivedmm=" + receivedmm + ", receivedtimehh="
				+ receivedtimehh + ", receivedtimemm=" + receivedtimemm + ", recordtype=" + recordtype
				+ ", recoveryccyy1=" + recoveryccyy1 + ", recoveryccyy2=" + recoveryccyy2 + ", recoveryccyy3="
				+ recoveryccyy3 + ", recoverydd1=" + recoverydd1 + ", recoverydd2=" + recoverydd2 + ", recoverydd3="
				+ recoverydd3 + ", recoverylocation1=" + recoverylocation1 + ", recoverylocation2=" + recoverylocation2
				+ ", recoverylocation3=" + recoverylocation3 + ", recoverymm1=" + recoverymm1 + ", recoverymm2="
				+ recoverymm2 + ", recoverymm3=" + recoverymm3 + ", recoverytechnician1=" + recoverytechnician1
				+ ", recoverytechnician2=" + recoverytechnician2 + ", recoverytechnician3=" + recoverytechnician3
				+ ", referredtome=" + referredtome + ", registeredccyy=" + registeredccyy + ", registereddate="
				+ registereddate + ", registereddd=" + registereddd + ", registeredmm=" + registeredmm
				+ ", registeredtime=" + registeredtime + ", registereduser=" + registereduser + ", rejecteddate="
				+ rejecteddate + ", rejectedtime=" + rejectedtime + ", rejecteduser=" + rejecteduser
				+ ", releaseauthorization=" + releaseauthorization + ", remains=" + remains + ", reportedby="
				+ reportedby + ", reportedto=" + reportedto + ", reportedtoid=" + reportedtoid + ", reportingagency="
				+ reportingagency + ", resareacode=" + resareacode + ", rescity=" + rescity + ", rescityfips="
				+ rescityfips + ", rescountry=" + rescountry + ", rescountryfips=" + rescountryfips + ", rescounty="
				+ rescounty + ", rescountyfips=" + rescountyfips + ", resincitylimits=" + resincitylimits + ", resname="
				+ resname + ", resphonenumber=" + resphonenumber + ", resstate=" + resstate + ", resstatefips="
				+ resstatefips + ", resstreetaddress1=" + resstreetaddress1 + ", resstreetaddress2=" + resstreetaddress2
				+ ", reszip4=" + reszip4 + ", reszip5=" + reszip5 + ", rigor=" + rigor + ", rigorspecify="
				+ rigorspecify + ", rx1=" + rx1 + ", rx10=" + rx10 + ", rx11=" + rx11 + ", rx12=" + rx12 + ", rx2="
				+ rx2 + ", rx3=" + rx3 + ", rx4=" + rx4 + ", rx5=" + rx5 + ", rx6=" + rx6 + ", rx7=" + rx7 + ", rx8="
				+ rx8 + ", rx9=" + rx9 + ", sceneaddress=" + sceneaddress + ", scenecity=" + scenecity
				+ ", scenecounty=" + scenecounty + ", scenedateccyy=" + scenedateccyy + ", scenedatedd=" + scenedatedd
				+ ", scenedatemm=" + scenedatemm + ", scenestate=" + scenestate + ", scenezip4=" + scenezip4
				+ ", scenezip5=" + scenezip5 + ", specialattentionfortox=" + specialattentionfortox
				+ ", specialattentionfortox2=" + specialattentionfortox2 + ", spousefirst=" + spousefirst
				+ ", spouselast=" + spouselast + ", spousemiddle=" + spousemiddle + ", spousesuffix=" + spousesuffix
				+ ", ssaDate=" + ssaDate + ", ssaExportdate=" + ssaExportdate + ", ssn=" + ssn + ", stateofdeath="
				+ stateofdeath + ", suspectedcauseofdeath=" + suspectedcauseofdeath + ", suspectedmannerofdeath="
				+ suspectedmannerofdeath + ", sysnum=" + sysnum + ", timearrivedscenehh=" + timearrivedscenehh
				+ ", timearrivedscenemm=" + timearrivedscenemm + ", timelastseenalivehh=" + timelastseenalivehh
				+ ", timelastseenalivemm=" + timelastseenalivemm + ", timeleftscenehh=" + timeleftscenehh
				+ ", timeleftscenemm=" + timeleftscenemm + ", timeofdeathhh=" + timeofdeathhh + ", timeofdeathmm="
				+ timeofdeathmm + ", timereportedhh=" + timereportedhh + ", timereportedmm=" + timereportedmm
				+ ", tobacco=" + tobacco + ", totalblocks=" + totalblocks + ", totalnp=" + totalnp
				+ ", transferredfrom1=" + transferredfrom1 + ", transferredfrom2=" + transferredfrom2
				+ ", transferredfrom3=" + transferredfrom3 + ", transportcompany1=" + transportcompany1
				+ ", transportcompany2=" + transportcompany2 + ", transportcompany3=" + transportcompany3
				+ ", typeofcase=" + typeofcase + ", typeofpartialautopsy=" + typeofpartialautopsy + ", umedRace="
				+ umedRace + ", umedrecord=" + umedrecord + ", underlyingcause=" + underlyingcause + ", underlyingcode="
				+ underlyingcode + ", underlyinginterval=" + underlyinginterval + ", underlyingintervalunit="
				+ underlyingintervalunit + ", vehiclecolor=" + vehiclecolor + ", vehiclelicensenumber="
				+ vehiclelicensenumber + ", vehiclelicensestate=" + vehiclelicensestate + ", vehiclemake=" + vehiclemake
				+ ", vehiclemodel=" + vehiclemodel + ", vehicletype=" + vehicletype + ", weaponbarrellength="
				+ weaponbarrellength + ", weaponcaliber=" + weaponcaliber + ", weaponmake=" + weaponmake
				+ ", weaponmakespecify=" + weaponmakespecify + ", weaponmodel=" + weaponmodel + ", weaponserialnumber="
				+ weaponserialnumber + ", weapontype=" + weapontype + ", witness1=" + witness1 + ", witness2="
				+ witness2 + ", witness3=" + witness3 + "]";
	}

	

}