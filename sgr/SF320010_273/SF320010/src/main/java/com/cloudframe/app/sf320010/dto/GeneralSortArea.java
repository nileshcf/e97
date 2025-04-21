package com.cloudframe.app.sf320010.dto;

/**
*  The class GeneralSortArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class GeneralSortArea extends GeneralSortAreaSerialized {
   

						private char[] generalSortId = new char[3];

						private char[] generalSortCc = new char[2];

						private char[] generalSortDate = new char[6];

						private char[] generalSortTime = new char[6];

						private char[] generalSortClass = new char[1];

						private char[] generalSortRest = new char[8176];
	
	/**
	* Constructor for GeneralSortArea
	**/
    public GeneralSortArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setGeneralSortId(fillSpace(3));
								setGeneralSortCc(fillSpace(2));
								setGeneralSortDate(fillSpace(6));
								setGeneralSortTime(fillSpace(6));
								setGeneralSortClass(fillSpace(1));
								setGeneralSortRest(pad(8176," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of generalSortId
	 *	@return generalSortId
	 */
   public char[] getGeneralSortId() throws CFException{
     if (isGeneralSortIdModified()) { 
        generalSortId = refreshGeneralSortId();
     }
   		return generalSortId;
   }

  
	/**
	*  set variable generalSortId
	*  Corresponding COBOL Variable is GENERAL-SORT-ID
	*  @param value
	**/
   public void setGeneralSortId(char[] value) {
      generalSortId = checkGeneralSortIdConstraints(value);
      serializeGeneralSortId(generalSortId);
   } 

     /**
	 * 	Update GeneralSortId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralSortId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralSortId,generalSortId.length);
   	
   }
   
   public void setGeneralSortId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortId,generalSortId.length);
   	
   }
   
     /**
	 * 	Update GeneralSortId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralSortId with another Field
	 *	@param value
	 */
   public void setGeneralSortId(Field source) {
       replace(source,0,source.length(),beginGeneralSortId,GENERAL_SORT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralSortId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralSortId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralSortId,GENERAL_SORT_ID_LEN);
   	
   }
   
     /**
	 * 	Update GeneralSortId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of generalSortCc
	 *	@return generalSortCc
	 */
   public char[] getGeneralSortCc() throws CFException{
     if (isGeneralSortCcModified()) { 
        generalSortCc = refreshGeneralSortCc();
     }
   		return generalSortCc;
   }

  
	/**
	*  set variable generalSortCc
	*  Corresponding COBOL Variable is GENERAL-SORT-CC
	*  @param value
	**/
   public void setGeneralSortCc(char[] value) {
      generalSortCc = checkGeneralSortCcConstraints(value);
      serializeGeneralSortCc(generalSortCc);
   } 

     /**
	 * 	Update GeneralSortCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralSortCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralSortCc,generalSortCc.length);
   	
   }
   
   public void setGeneralSortCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortCc,generalSortCc.length);
   	
   }
   
     /**
	 * 	Update GeneralSortCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralSortCc with another Field
	 *	@param value
	 */
   public void setGeneralSortCc(Field source) {
       replace(source,0,source.length(),beginGeneralSortCc,GENERAL_SORT_CC_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralSortCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralSortCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralSortCc,GENERAL_SORT_CC_LEN);
   	
   }
   
     /**
	 * 	Update GeneralSortCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of generalSortDate
	 *	@return generalSortDate
	 */
   public char[] getGeneralSortDate() throws CFException{
     if (isGeneralSortDateModified()) { 
        generalSortDate = refreshGeneralSortDate();
     }
   		return generalSortDate;
   }

  
	/**
	*  set variable generalSortDate
	*  Corresponding COBOL Variable is GENERAL-SORT-DATE
	*  @param value
	**/
   public void setGeneralSortDate(char[] value) {
      generalSortDate = checkGeneralSortDateConstraints(value);
      serializeGeneralSortDate(generalSortDate);
   } 

     /**
	 * 	Update GeneralSortDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralSortDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralSortDate,generalSortDate.length);
   	
   }
   
   public void setGeneralSortDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortDate,generalSortDate.length);
   	
   }
   
     /**
	 * 	Update GeneralSortDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralSortDate with another Field
	 *	@param value
	 */
   public void setGeneralSortDate(Field source) {
       replace(source,0,source.length(),beginGeneralSortDate,GENERAL_SORT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralSortDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralSortDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralSortDate,GENERAL_SORT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update GeneralSortDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of generalSortTime
	 *	@return generalSortTime
	 */
   public char[] getGeneralSortTime() throws CFException{
     if (isGeneralSortTimeModified()) { 
        generalSortTime = refreshGeneralSortTime();
     }
   		return generalSortTime;
   }

  
	/**
	*  set variable generalSortTime
	*  Corresponding COBOL Variable is GENERAL-SORT-TIME
	*  @param value
	**/
   public void setGeneralSortTime(char[] value) {
      generalSortTime = checkGeneralSortTimeConstraints(value);
      serializeGeneralSortTime(generalSortTime);
   } 

     /**
	 * 	Update GeneralSortTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralSortTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralSortTime,generalSortTime.length);
   	
   }
   
   public void setGeneralSortTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortTime,generalSortTime.length);
   	
   }
   
     /**
	 * 	Update GeneralSortTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralSortTime with another Field
	 *	@param value
	 */
   public void setGeneralSortTime(Field source) {
       replace(source,0,source.length(),beginGeneralSortTime,GENERAL_SORT_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralSortTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralSortTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralSortTime,GENERAL_SORT_TIME_LEN);
   	
   }
   
     /**
	 * 	Update GeneralSortTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of generalSortClass
	 *	@return generalSortClass
	 */
   public char[] getGeneralSortClass() throws CFException{
     if (isGeneralSortClassModified()) { 
        generalSortClass = refreshGeneralSortClass();
     }
   		return generalSortClass;
   }

  
	/**
	*  set variable generalSortClass
	*  Corresponding COBOL Variable is GENERAL-SORT-CLASS
	*  @param value
	**/
   public void setGeneralSortClass(char[] value) {
      generalSortClass = checkGeneralSortClassConstraints(value);
      serializeGeneralSortClass(generalSortClass);
   } 

     /**
	 * 	Update GeneralSortClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralSortClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralSortClass,generalSortClass.length);
   	
   }
   
   public void setGeneralSortClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortClass,generalSortClass.length);
   	
   }
   
     /**
	 * 	Update GeneralSortClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralSortClass with another Field
	 *	@param value
	 */
   public void setGeneralSortClass(Field source) {
       replace(source,0,source.length(),beginGeneralSortClass,GENERAL_SORT_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralSortClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralSortClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralSortClass,GENERAL_SORT_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update GeneralSortClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of generalSortRest
	 *	@return generalSortRest
	 */
   public char[] getGeneralSortRest() throws CFException{
     if (isGeneralSortRestModified()) { 
        generalSortRest = refreshGeneralSortRest();
     }
   		return generalSortRest;
   }

  
	/**
	*  set variable generalSortRest
	*  Corresponding COBOL Variable is GENERAL-SORT-REST
	*  @param value
	**/
   public void setGeneralSortRest(char[] value) {
      generalSortRest = checkGeneralSortRestConstraints(value);
      serializeGeneralSortRest(generalSortRest);
   } 

     /**
	 * 	Update GeneralSortRest 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGeneralSortRest(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGeneralSortRest,generalSortRest.length);
   	
   }
   
   public void setGeneralSortRest(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortRest,generalSortRest.length);
   	
   }
   
     /**
	 * 	Update GeneralSortRest 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortRest(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortRest+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GeneralSortRest with another Field
	 *	@param value
	 */
   public void setGeneralSortRest(Field source) {
       replace(source,0,source.length(),beginGeneralSortRest,GENERAL_SORT_REST_LEN);
   	
   }  
   
     /**
	 * 	Update GeneralSortRest 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGeneralSortRest(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGeneralSortRest,GENERAL_SORT_REST_LEN);
   	
   }
   
     /**
	 * 	Update GeneralSortRest 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGeneralSortRest(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGeneralSortRest+targetIndex,targetLen);
    
   }

	
	
	

		public static int getGeneralSortAreaFieldLength() {
			return GENERAL_SORT_AREA_LENGTH;
		}

}
  
