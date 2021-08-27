package com.VaccinationDetails;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VaccineBookingInformation {
	static ApplicantData[] bookedDetails=new ApplicantData[2100];
	public static void bookVaccine() throws ParseException {
		
	    int age;
		long aadharNumber;
		long phoneNumber;
		String name;
		String doseType;
		Date vaccinationDate = null;
		
		for(int i=0;i<bookedDetails.length;i++) {
			Scanner scanner=new Scanner(System.in);
			SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
			if(i<300) {
				vaccinationDate=format.parse("05-08-2021");
			}
			else if((i<600) && (i>299)) {
				vaccinationDate=format.parse("06-08-2021");
			}
			else if((i<900) && (i>599)) {
				vaccinationDate=format.parse("07-08-2021");
			}
			else if((i<1200)&& (i>899)) {
				vaccinationDate=format.parse("08-08-2021");
			}
			else if((i<1500)&& (i>1199)) {
				vaccinationDate=format.parse("09-08-2021");
			}
			else if((i<1800)&& (i>1499)) {
				vaccinationDate=format.parse("10-08-2021");
			}
			else if((i<2100)&& (i>1799)) {
				vaccinationDate=format.parse("11-08-2021");
			}
			
			
			
			
			ApplicantData applicant=new ApplicantData();
			
			System.out.print("Enter your Name :");
			name=scanner.next();
			applicant.setPersonName(name);
			
			System.out.print("Enter your Age :");
			age=scanner.nextInt();
			if(age<18) {
				System.out.println("Vaccination Only for Above 18 years");
				continue;
			}
			else {
			   applicant.setAge(age);
			}
			
		
			System.out.print("Enter your Aadhaar Number :");
			aadharNumber=scanner.nextLong();
			applicant.setAadharNumber(aadharNumber);
			System.out.print("Enter your Phone Number :");
			phoneNumber=scanner.nextLong();
			applicant.setPhoneNumber(phoneNumber);
			System.out.print("Enter your DoseType (Dose-I or Dose-II) :");
			doseType=scanner.next();
			applicant.setDoseType(doseType);
			applicant.setVaccinationDate(vaccinationDate);
			bookedDetails [i]=applicant;
			break;
		}
		
		
		
		
	}
	public static void getVaccinatedPeopleDetails() {
		long phoneNumber;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Phone Number :");
		phoneNumber=scanner.nextLong();
		for(ApplicantData applicant:bookedDetails) {
			if(applicant.getPhoneNumber()==phoneNumber) 
			{
				System.out.print("Name :");
				System.out.println(applicant.getPersonName());
				System.out.print("Age :");
				System.out.println(applicant.getAge());
				System.out.print("Aadhaar Number :");
				System.out.println(applicant.getAadharNumber());
				System.out.print("Phone Number :");
				System.out.println(applicant.getPhoneNumber());
				System.out.print("DoseType (Dose-I or Dose-II) :");
				System.out.println(applicant.getDoseType());
				System.out.print("Vaccination Date :");
				System.out.println(applicant.getVaccinationDate());
			}
		
			
		}
		
		
	}

}
