/*     */ package com.unisys.leida.framework.sharedobjects.client.vo;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.lang.builder.EqualsBuilder;
/*     */ import org.apache.commons.lang.builder.HashCodeBuilder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Person
/*     */   implements Serializable, Cloneable
/*     */ {
/*     */   private String personNumber;
/*     */   private String firstName;
/*     */   private String middleName;
/*     */   private String lastName;
/*     */   private String defactoId;
/*     */   private Date dob;
/*     */   
/*     */ 
/*     */   
/*     */   private int gender;
/*     */   
/*     */   private String height1;
/*     */   
/*     */   private String height2;
/*     */   
/*     */   private String weight;
/*     */   
/*     */   private String eyeColor;
/*     */   
/*  49 */   private Set personOrgRoles = new HashSet(0);
/*     */   
/*     */   
/*     */   
/*     */   private String fullName;
/*     */   
/*     */   private String registrationNumber;
/*     */   
/*  59 */   private Set personBiographicsSet = new HashSet(0);
/*     */   
/*     */   



/*     */ 
/*     */ 
/*     */   public Person(String personNumber, String firstName, String middleName, String lastName, Date dob)
/*     */   {
/* 115 */     this.personNumber = personNumber;
/* 116 */     this.firstName = firstName;
/* 117 */     this.middleName = middleName;
/* 118 */     this.lastName = lastName;
/* 119 */     this.dob = dob;
/*     */   }
/*     */   
/*     */ 
/*     */ 

/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Person(String personNumber, String firstName, String middleName, String lastName, String defactoId, Date dob)
/*     */   {
/* 144 */     this.personNumber = personNumber;
/* 145 */     this.firstName = firstName;
/* 146 */     this.middleName = middleName;
/* 147 */     this.lastName = lastName;
/* 148 */     this.defactoId = defactoId;
/* 149 */     this.dob = dob;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Person(String personNumber, String firstName, String middleName, String lastName, String deFactoId)
/*     */   {
/* 159 */     this.personNumber = personNumber;
/* 160 */     this.firstName = firstName;
/* 161 */     this.middleName = middleName;
/* 162 */     this.lastName = lastName;
/* 163 */     this.defactoId = deFactoId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Person() {}
/*     */   
/*     */ 
/*     */   public Person(String personNumber)
/*     */   {
/* 173 */     this.personNumber = personNumber;
/*     */   }
/*     */   
/*     */ 
/*     */   
/*     */   public String getPersonNumber()
/*     */   {
/* 186 */     return this.personNumber;
/*     */   }
/*     */   
/*     */   public void setPersonNumber(String personNumber)
/*     */   {
/* 191 */     this.personNumber = personNumber;
/*     */   }
/*     */   
/*     */   public String getFirstName()
/*     */   {
/* 196 */     return this.firstName;
/*     */   }
/*     */   
/*     */   public void setFirstName(String firstName)
/*     */   {
/* 201 */     this.firstName = firstName;
/*     */   }
/*     */   
/*     */   public String getMiddleName()
/*     */   {
/* 206 */     return this.middleName;
/*     */   }
/*     */   
/*     */   public void setMiddleName(String middleName)
/*     */   {
/* 211 */     this.middleName = middleName;
/*     */   }
/*     */   
/*     */   public String getLastName()
/*     */   {
/* 216 */     return this.lastName;
/*     */   }
/*     */   
/*     */   public void setLastName(String lastName)
/*     */   {
/* 221 */     this.lastName = lastName;
/*     */   }
/*     */   
/*     */   public String getDefactoId()
/*     */   {
/* 226 */     return this.defactoId;
/*     */   }
/*     */   
/*     */   public void setDefactoId(String defactoId)
/*     */   {
/* 231 */     this.defactoId = defactoId;
/*     */   }
/*     */   
/*     */   public Date getDob()
/*     */   {
/* 236 */     return this.dob;
/*     */   }
/*     */   
/*     */   public void setDob(Date dob)
/*     */   {
/* 241 */     this.dob = dob;
/*     */   }
/*     */   
/*     */   public String getEyeColor()
/*     */   {
/* 246 */     return this.eyeColor;
/*     */   }
/*     */   
/*     */   public void setEyeColor(String eyeColor)
/*     */   {
/* 251 */     this.eyeColor = eyeColor;
/*     */   }
/*     */   
/*     */   public boolean equals(Object other)
/*     */   {
/* 256 */     if (!(other instanceof Person))
/* 257 */       return false;
/* 258 */     Person castOther = (Person)other;
/* 259 */     return new EqualsBuilder().append(getPersonNumber(), castOther.getPersonNumber()).isEquals();
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 264 */     return new HashCodeBuilder().append(getPersonNumber()).toHashCode();
/*     */   }
/*     */   
/*     */   public Object Clone()
/*     */   {
/* 269 */     Object object = null;
/*     */     try
/*     */     {
/* 272 */       object = super.clone();
/*     */     }
/*     */     catch (Exception localException) {}
/*     */     
/*     */ 
/*     */ 
/* 278 */     return object;
/*     */   }

/*     */   
/*     */   public void setGender(int gender)
/*     */   {
/* 303 */     this.gender = gender;
/*     */   }
/*     */   
/*     */   public int getGender()
/*     */   {
/* 308 */     return this.gender;
/*     */   }
/*     */   
/*     */   public void setHeight1(String height1)
/*     */   {
/* 313 */     this.height1 = height1;
/*     */   }
/*     */   
/*     */   public String getHeight1()
/*     */   {
/* 318 */     return this.height1;
/*     */   }
/*     */   
/*     */   public void setWeight(String weight)
/*     */   {
/* 323 */     this.weight = weight;
/*     */   }
/*     */   
/*     */   public String getWeight()
/*     */   {
/* 328 */     return this.weight;
/*     */   }
/*     */   
/*     */   public Set getPersonOrgRoles()
/*     */   {
/* 333 */     return this.personOrgRoles;
/*     */   }
/*     */   
/*     */   public void setPersonOrgRoles(Set personOrgRoles)
/*     */   {
/* 338 */     this.personOrgRoles = personOrgRoles;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 

/*     */   public void setHeight2(String height2)
/*     */   {
/* 374 */     this.height2 = height2;
/*     */   }
/*     */   
/*     */   public String getHeight2()
/*     */   {
/* 379 */     return this.height2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 390 */     StringBuilder builder = new StringBuilder();
/* 391 */     builder.append("Person [personNumber=");
/* 392 */     builder.append(this.personNumber);
/* 393 */     builder.append(", firstName=");
/* 394 */     builder.append(this.firstName);
/* 395 */     builder.append(", middleName=");
/* 396 */     builder.append(this.middleName);
/* 397 */     builder.append(", lastName=");
/* 398 */     builder.append(this.lastName);
/* 399 */     builder.append(", defactoId=");
/* 400 */     builder.append(this.defactoId);
/* 401 */     builder.append(", dob=");
/* 402 */     builder.append(this.dob);

/* 407 */     builder.append(", gender=");
/* 408 */     builder.append(this.gender);
/* 409 */     builder.append(", height1=");
/* 410 */     builder.append(this.height1);
/* 411 */     builder.append(", height2=");
/* 412 */     builder.append(this.height2);
/* 413 */     builder.append(", weight=");
/* 414 */     builder.append(this.weight);
/* 415 */     builder.append(", registrationNumber=");
/* 416 */     builder.append(this.registrationNumber);
/* 417 */     builder.append("]");
/* 418 */     return builder.toString();
/*     */   }
/*     */   
/*     */   public String getFullName() {
/* 422 */     StringBuffer buffer = new StringBuffer();
/* 423 */     if (null != this.firstName) {
/* 424 */       buffer.append(this.firstName);
/*     */     }
/* 426 */     if (null != this.lastName) {
/* 427 */       buffer.append(" ");
/* 428 */       buffer.append(this.lastName);
/*     */     }
/* 430 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   public void setFullName(String fullName)
/*     */   {
/* 435 */     this.fullName = fullName;
/*     */   }
/*     */   
/*     */   public String getRegistrationNumber() {
/* 439 */     return this.registrationNumber;
/*     */   }
/*     */   
/*     */   public void setRegistrationNumber(String registrationNumber) {
/* 443 */     this.registrationNumber = registrationNumber;
/*     */   }
/*     */   

/* 454 */   public Set getPersonBiographicsSet() { return this.personBiographicsSet; }
/*     */   
/*     */   public void setPersonBiographicsSet(Set personBiographicsSet) {
/* 457 */     this.personBiographicsSet = personBiographicsSet;
/*     */   }
/*     */ }


