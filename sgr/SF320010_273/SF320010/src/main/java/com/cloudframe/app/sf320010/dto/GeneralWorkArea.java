package com.cloudframe.app.sf320010.dto;

/**
*  The class GeneralWorkArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class GeneralWorkArea extends GeneralWorkAreaSerialized {
   

						private char[] generalWorkId = new char[3];

						private char[] generalWorkDate = new char[6];

						private char[] generalWorkTime = new char[6];

						private char[] generalWorkClass = new char[1];

						private char[] generalWorkRest = new char[8176];
	
	/**
	* Constructor for GeneralWorkArea
	**/
    public GeneralWorkArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setGeneralWorkId(fillSpace(3));
								setGeneralWorkDate(fillSpace(6));
								setGeneralWorkTime(fillSpace(6));
								setGeneralWorkClass(fillSpace(1));
								setGeneralWorkRest(pad(8176," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of generalWorkId
	 *	@return generalWorkId
	 */
   public char[] getGeneralWorkId() throws CFException{
     if (isGeneralWorkIdModified()) { 
        generalWorkId = refreshGeneralWorkId();
     }
   		return generalWorkId;
   }

  
	/**
	*  set variable generalWorkId
	*  Corresponding COBOL Variable is GENERAL-WORK-ID
	*  @param value
	**/
   public void setGeneralWorkId(char[] value) {
      generalWorkId = checkGeneralWorkIdConstraints(value);
      serializeGeneralWorkId(generalWorkId);
   } 

     /**
	 * 	Update GeneralWorkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralWorkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralWorkId,generalWorkId.length);
   	
   }
   
   public void setGeneralWorkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkId,generalWorkId.length);
   	
   }
   
     /**
	 * 	Update GeneralWorkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralWorkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralWorkId with another Field
	 *	@param value
	 */
   public void setGeneralWorkId(Field source) {
       replace(source,0,source.length(),beginGeneralWorkId,GENERAL_WORK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralWorkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralWorkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralWorkId,GENERAL_WORK_ID_LEN);
   	
   }
   
     /**
	 * 	Update GeneralWorkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralWorkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of generalWorkDate
	 *	@return generalWorkDate
	 */
   public char[] getGeneralWorkDate() throws CFException{
     if (isGeneralWorkDateModified()) { 
        generalWorkDate = refreshGeneralWorkDate();
     }
   		return generalWorkDate;
   }

  
	/**
	*  set variable generalWorkDate
	*  Corresponding COBOL Variable is GENERAL-WORK-DATE
	*  @param value
	**/
   public void setGeneralWorkDate(char[] value) {
      generalWorkDate = checkGeneralWorkDateConstraints(value);
      serializeGeneralWorkDate(generalWorkDate);
   } 

     /**
	 * 	Update GeneralWorkDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralWorkDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralWorkDate,generalWorkDate.length);
   	
   }
   
   public void setGeneralWorkDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkDate,generalWorkDate.length);
   	
   }
   
     /**
	 * 	Update GeneralWorkDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralWorkDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralWorkDate with another Field
	 *	@param value
	 */
   public void setGeneralWorkDate(Field source) {
       replace(source,0,source.length(),beginGeneralWorkDate,GENERAL_WORK_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralWorkDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralWorkDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralWorkDate,GENERAL_WORK_DATE_LEN);
   	
   }
   
     /**
	 * 	Update GeneralWorkDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralWorkDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of generalWorkTime
	 *	@return generalWorkTime
	 */
   public char[] getGeneralWorkTime() throws CFException{
     if (isGeneralWorkTimeModified()) { 
        generalWorkTime = refreshGeneralWorkTime();
     }
   		return generalWorkTime;
   }

  
	/**
	*  set variable generalWorkTime
	*  Corresponding COBOL Variable is GENERAL-WORK-TIME
	*  @param value
	**/
   public void setGeneralWorkTime(char[] value) {
      generalWorkTime = checkGeneralWorkTimeConstraints(value);
      serializeGeneralWorkTime(generalWorkTime);
   } 

     /**
	 * 	Update GeneralWorkTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralWorkTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralWorkTime,generalWorkTime.length);
   	
   }
   
   public void setGeneralWorkTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkTime,generalWorkTime.length);
   	
   }
   
     /**
	 * 	Update GeneralWorkTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralWorkTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralWorkTime with another Field
	 *	@param value
	 */
   public void setGeneralWorkTime(Field source) {
       replace(source,0,source.length(),beginGeneralWorkTime,GENERAL_WORK_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralWorkTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralWorkTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralWorkTime,GENERAL_WORK_TIME_LEN);
   	
   }
   
     /**
	 * 	Update GeneralWorkTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralWorkTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of generalWorkClass
	 *	@return generalWorkClass
	 */
   public char[] getGeneralWorkClass() throws CFException{
     if (isGeneralWorkClassModified()) { 
        generalWorkClass = refreshGeneralWorkClass();
     }
   		return generalWorkClass;
   }

  
	/**
	*  set variable generalWorkClass
	*  Corresponding COBOL Variable is GENERAL-WORK-CLASS
	*  @param value
	**/
   public void setGeneralWorkClass(char[] value) {
      generalWorkClass = checkGeneralWorkClassConstraints(value);
      serializeGeneralWorkClass(generalWorkClass);
   } 

     /**
	 * 	Update GeneralWorkClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralWorkClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralWorkClass,generalWorkClass.length);
   	
   }
   
   public void setGeneralWorkClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkClass,generalWorkClass.length);
   	
   }
   
     /**
	 * 	Update GeneralWorkClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralWorkClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralWorkClass with another Field
	 *	@param value
	 */
   public void setGeneralWorkClass(Field source) {
       replace(source,0,source.length(),beginGeneralWorkClass,GENERAL_WORK_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralWorkClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralWorkClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralWorkClass,GENERAL_WORK_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update GeneralWorkClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralWorkClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of generalWorkRest
	 *	@return generalWorkRest
	 */
   public char[] getGeneralWorkRest() throws CFException{
     if (isGeneralWorkRestModified()) { 
        generalWorkRest = refreshGeneralWorkRest();
     }
   		return generalWorkRest;
   }

  
	/**
	*  set variable generalWorkRest
	*  Corresponding COBOL Variable is GENERAL-WORK-REST
	*  @param value
	**/
   public void setGeneralWorkRest(char[] value) {
      generalWorkRest = checkGeneralWorkRestConstraints(value);
      serializeGeneralWorkRest(generalWorkRest);
   } 

     /**
	 * 	Update GeneralWorkRest 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralWorkRest(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralWorkRest,generalWorkRest.length);
   	
   }
   
   public void setGeneralWorkRest(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkRest,generalWorkRest.length);
   	
   }
   
     /**
	 * 	Update GeneralWorkRest 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralWorkRest(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkRest+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralWorkRest with another Field
	 *	@param value
	 */
   public void setGeneralWorkRest(Field source) {
       replace(source,0,source.length(),beginGeneralWorkRest,GENERAL_WORK_REST_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralWorkRest 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralWorkRest(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralWorkRest,GENERAL_WORK_REST_LEN);
   	
   }
   
     /**
	 * 	Update GeneralWorkRest 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralWorkRest(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralWorkRest+targetIndex,targetLen);
    
   }

	
	
	

		public static int getGeneralWorkAreaFieldLength() {
			return GENERAL_WORK_AREA_LENGTH;
		}

}
  
