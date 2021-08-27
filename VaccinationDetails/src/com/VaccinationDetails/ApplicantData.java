package com.VaccinationDetails;


	import java.util.Date;
	public class ApplicantData {
		private String personName;
		private long aadharNumber;
		private boolean dateofbirth;
		private long phoneNumber;
		private int age;
		private String doseType;
		private Date vaccinationDate;
		public Date getVaccinationDate() 
		{
			return vaccinationDate;
		}
		public void setVaccinationDate(Date vaccinationDate) 
		{
			this.vaccinationDate = vaccinationDate;
		}
		public String getPersonName()
	 	{
			return personName;
		}
		public void setPersonName(String personName) 
		{
			this.personName = personName;
		}
		public long getAadharNumber() 
		{
			return aadharNumber;
		}
		public void setAadharNumber(long aadharNumber) 
		{
			this.aadharNumber = aadharNumber;
		}
		public long getPhoneNumber() 
		{
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) 
		{
			this.phoneNumber = phoneNumber;
		}
		public String getDoseType()
	 	{
			return doseType;
		}
		public void setDoseType(String doseType) 
		{
			this.doseType = doseType;
		}
		public boolean getDateofbirth() {
			return dateofbirth;
		}
		public void setDateofbirth(boolean dateofbirth) {
			this.dateofbirth = dateofbirth;
		}
		public void setage(int age) {
			// TODO Auto-generated method stub
			
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}

