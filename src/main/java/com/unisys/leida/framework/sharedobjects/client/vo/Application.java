package com.unisys.leida.framework.sharedobjects.client.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Application
  implements Serializable, Cloneable
{
  private String applicationNumber;
  private Long typeOfApplication;
  private Long status;
  private String priority;
  private Long modeOfApplication;
  private Integer expeditedprocessing;
  private Person person = new Person();
  private Set applicationExceptions;
  private Set applicationComments;
  private List applicationSupportingdocuments;
  private Date applicationDate;
  private String comments;
  private Long reasonCode;
  private Set authenticatedDocument;
  private String proxy = null;

  private String registrationNo = null;
  private String sourceEvent = null;
  private String checkedOutUser = null;

  private List event = null;
  private String customAppId;
  private String reviewComments = null;
  private String state = null;
  private String typeOfAppString = null;
  private int maxFetchResults;
  private int recordCount;

  
  public List getEvent()
  {
    return this.event;
  }
  
  public void setEvent(List event)
  {
    this.event = event;
  }
  
  public Application(String applicationNumber, Long typeOfApplication)
  {
    this.applicationNumber = applicationNumber;
    this.typeOfApplication = typeOfApplication;
  }
  
  public Application(String applicationNumber, Long typeOfApplication, Long status, Date applicationDate)
  {
    this.applicationNumber = applicationNumber;
    this.typeOfApplication = typeOfApplication;
    this.status = status;
    this.applicationDate = applicationDate;
  }
  
  public String getApplicationNumber()
  {
    return this.applicationNumber;
  }
  
  public void setApplicationNumber(String applicationNumber)
  {
    this.applicationNumber = applicationNumber;
  }
  
  public Long getTypeOfApplication()
  {
    return this.typeOfApplication;
  }
  
  public void setTypeOfApplication(Long typeOfApplication)
  {
    this.typeOfApplication = typeOfApplication;
  }
  
  public Long getStatus()
  {
    return this.status;
  }
  
  public void setStatus(Long status)
  {
    this.status = status;
  }
  
  public Long getModeOfApplication()
  {
    return this.modeOfApplication;
  }
  
  public void setModeOfApplication(Long modeOfApplication)
  {
    this.modeOfApplication = modeOfApplication;
  }
  
  public Integer getExpeditedprocessing()
  {
    return this.expeditedprocessing;
  }
  
  public void setExpeditedprocessing(Integer expeditedprocessing)
  {
    this.expeditedprocessing = expeditedprocessing;
  }
  
  public Person getPerson()
  {
    return this.person;
  }
  
  public void setPerson(Person person)
  {
    this.person = person;
  }
  
  public Set getApplicationExceptions()
  {
    return this.applicationExceptions;
  }
  
  public void setApplicationExceptions(Set applicationExceptions)
  {
    this.applicationExceptions = applicationExceptions;
  }
  
  public Date getApplicationDate()
  {
    return this.applicationDate;
  }
  
  public void setApplicationDate(Date date)
  {
    this.applicationDate = date;
  }
  
  public Set getApplicationComments()
  {
    return this.applicationComments;
  }
  
  public void setApplicationComments(Set applicationComments)
  {
    this.applicationComments = applicationComments;
  }
  
  public List getApplicationSupportingdocuments()
  {
    return this.applicationSupportingdocuments;
  }
  
  public void setApplicationSupportingdocuments(List applicationSupportingdocuments)
  {
    this.applicationSupportingdocuments = applicationSupportingdocuments;
  }
  
  public boolean equals(Object other)
  {
    if (!(other instanceof Application)) {
      return false;
    }
    Application castOther = (Application)other;
    return new EqualsBuilder().append(getApplicationNumber(), castOther
      .getApplicationNumber()).isEquals();
  }
  
  public int hashCode()
  {
    return new HashCodeBuilder().append(getApplicationNumber()).toHashCode();
  }
  
  public String getComments()
  {
    return this.comments;
  }
  
  public Long getReasonCode()
  {
    return this.reasonCode;
  }
  
  public void setComments(String comments)
  {
    this.comments = comments;
  }
  
  public Set getAuthenticatedDocument()
  {
    return this.authenticatedDocument;
  }
  
  public void setAuthenticatedDocument(Set authenticatedDocument)
  {
    this.authenticatedDocument = authenticatedDocument;
  }
  
  public String getProxy()
  {
    return this.proxy;
  }
  
  public void setProxy(String proxy)
  {
    this.proxy = proxy;
  }
  
  public void setReasonCode(Long reasonCode)
  {
    this.reasonCode = reasonCode;
  }
  
  public Set getAuthenticatedDocuments()
  {
    return this.authenticatedDocument;
  }
  

  public String getRegistrationNo()
  {
    return this.registrationNo;
  }
  
  public void setRegistrationNo(String string)
  {
    this.registrationNo = string;
  }
  
  public void setAuthenticatedDocuments(Set authenticatedDocument)
  {
    this.authenticatedDocument = authenticatedDocument;
  }
  
  public Object clone()
  {
    Application application = null;
    try
    {
      application = (Application)super.clone();
      application.person = ((Person)this.person.Clone());
    }
    catch (Exception localException) {}
    return application;
  }
  
  public String getCheckedOutUser()
  {
    return this.checkedOutUser;
  }
  
  public void setCheckedOutUser(String string)
  {
    this.checkedOutUser = string;
  }
  
  public String getSourceEvent()
  {
    return this.sourceEvent;
  }
  
  public void setSourceEvent(String sourceEvent)
  {
    this.sourceEvent = sourceEvent;
  }

  
  public String getPriority()
  {
    return this.priority;
  }
  
  public void setPriority(String priority)
  {
    this.priority = priority;
  }
 
  
  public Application() {}
  
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("Application [applicationNumber=");
    builder.append(this.applicationNumber);
    builder.append(", typeOfApplication=");
    builder.append(this.typeOfApplication);
    builder.append(", status=");
    builder.append(this.status);
    builder.append(", modeOfApplication=");
    builder.append(this.modeOfApplication);
    builder.append(", expeditedprocessing=");
    builder.append(this.expeditedprocessing);
    builder.append(", person=");
    builder.append(this.person);
    builder.append(", applicationExceptions=");
    builder.append(this.applicationExceptions);
    builder.append(", applicationComments=");
    builder.append(this.applicationComments);
    builder.append(", applicationSupportingdocuments=");
    builder.append(this.applicationSupportingdocuments);
    builder.append(", applicationDate=");
    builder.append(this.applicationDate);
    builder.append(", comments=");
    builder.append(this.comments);
    builder.append(", reasonCode=");
    builder.append(this.reasonCode);
    builder.append(", authenticatedDocument=");
    builder.append(this.authenticatedDocument);
    builder.append(", proxy=");
    builder.append(this.proxy);
    builder.append(", priority=");
    builder.append(this.priority);
    builder.append(", registrationNo=");
    builder.append(this.registrationNo);
    builder.append(", sourceEvent=");
    builder.append(this.sourceEvent);
    builder.append(", checkedOutUser=");
    builder.append(this.checkedOutUser);
    builder.append(", event=");
    builder.append(this.event);
    builder.append("]");
    return builder.toString();
  }
  
  
  public String getCustomAppId()
  {
    return this.customAppId;
  }
  
  public void setCustomAppId(String customAppId)
  {
    this.customAppId = customAppId;
  }
  
  public String getReviewComments()
  {
    return this.reviewComments;
  }
  
  public void setReviewComments(String reviewComments)
  {
    this.reviewComments = reviewComments;
  }
  
  public String getState()
  {
    return this.state;
  }
  
  public void setState(String state)
  {
    this.state = state;
  }
  
  public String getTypeOfAppString()
  {
    return this.typeOfAppString;
  }
  
  public void setTypeOfAppString(String typeOfAppString)
  {
    this.typeOfAppString = typeOfAppString;
  }
  
  public int getMaxFetchResults()
  {
    return this.maxFetchResults;
  }
  
  public int getRecordCount()
  {
    return this.recordCount;
  }
  
  public void setMaxFetchResults(int maxFetchResults)
  {
    this.maxFetchResults = maxFetchResults;
  }
  
  public void setRecordCount(int recordCount)
  {
    this.recordCount = recordCount;
  }
}
