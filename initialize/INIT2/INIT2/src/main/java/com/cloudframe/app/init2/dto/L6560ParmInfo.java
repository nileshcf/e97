package com.cloudframe.app.init2.dto;

/**
*  The class L6560ParmInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class L6560ParmInfo extends L6560ParmInfoSerialized {
   
				private L6560InputParmInfo l6560InputParmInfo = new L6560InputParmInfo();

						private char[] l6560IoParmInfo = Field.fillLowValue(25);
				private L6560OutputParmInfo l6560OutputParmInfo = new L6560OutputParmInfo();
	
	/**
	* Constructor for L6560ParmInfo
	**/
    public L6560ParmInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			l6560InputParmInfo.setParent(this,getStartOffset() + 0);
	       			l6560OutputParmInfo.setParent(this,getStartOffset() + 157);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of l6560InputParmInfo
	 *	@return l6560InputParmInfo
	 */   
	 public L6560InputParmInfo getL6560InputParmInfo() {
   	return l6560InputParmInfo;
   }
   /**
	* 	Update L6560InputParmInfo with the passed value
	*   Corresponding COBOL Variable is L6560-INPUT-PARM-INFO
	*	@param value
	*/
   public void setL6560InputParmInfo(char[] value) {
      l6560InputParmInfo.setString(value); 
   }   
    
     /**
	 * 	Update L6560InputParmInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setL6560InputParmInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,l6560InputParmInfo.begin,l6560InputParmInfo.length());
   }
   
     /**
	 * 	Update L6560InputParmInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560InputParmInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,l6560InputParmInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update L6560InputParmInfo with another Field
	 *	@param value
	 */
   public void setL6560InputParmInfo(Field source) {
   	replace(source,0,source.length(),l6560InputParmInfo.begin,l6560InputParmInfo.length());
   }  
   
     /**
	 * 	Update L6560InputParmInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setL6560InputParmInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,l6560InputParmInfo.begin,l6560InputParmInfo.length());
   }
   
     /**
	 * 	Update L6560InputParmInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560InputParmInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,l6560InputParmInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of l6560IoParmInfo
	 *	@return l6560IoParmInfo
	 */
   public char[] getL6560IoParmInfo() throws CFException{
     if (isL6560IoParmInfoModified()) { 
        l6560IoParmInfo = refreshL6560IoParmInfo();
     }
   		return l6560IoParmInfo;
   }

  
	/**
	*  set variable l6560IoParmInfo
	*  Corresponding COBOL Variable is L6560-IO-PARM-INFO
	*  @param value
	**/
   public void setL6560IoParmInfo(char[] value) {
      l6560IoParmInfo = checkL6560IoParmInfoConstraints(value);
      serializeL6560IoParmInfo(l6560IoParmInfo);
   } 

     /**
	 * 	Update L6560IoParmInfo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL6560IoParmInfo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL6560IoParmInfo,l6560IoParmInfo.length);
   	
   }
   
   public void setL6560IoParmInfo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL6560IoParmInfo,l6560IoParmInfo.length);
   	
   }
   
     /**
	 * 	Update L6560IoParmInfo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560IoParmInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560IoParmInfo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L6560IoParmInfo with another Field
	 *	@param value
	 */
   public void setL6560IoParmInfo(Field source) {
       replace(source,0,source.length(),beginL6560IoParmInfo,L_6560_IO_PARM_INFO_LEN);
   	
   }  
   
     /**
	 * 	Update L6560IoParmInfo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL6560IoParmInfo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL6560IoParmInfo,L_6560_IO_PARM_INFO_LEN);
   	
   }
   
     /**
	 * 	Update L6560IoParmInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560IoParmInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL6560IoParmInfo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of l6560OutputParmInfo
	 *	@return l6560OutputParmInfo
	 */   
	 public L6560OutputParmInfo getL6560OutputParmInfo() {
   	return l6560OutputParmInfo;
   }
   /**
	* 	Update L6560OutputParmInfo with the passed value
	*   Corresponding COBOL Variable is L6560-OUTPUT-PARM-INFO
	*	@param value
	*/
   public void setL6560OutputParmInfo(char[] value) {
      l6560OutputParmInfo.setString(value); 
   }   
    
     /**
	 * 	Update L6560OutputParmInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setL6560OutputParmInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,l6560OutputParmInfo.begin,l6560OutputParmInfo.length());
   }
   
     /**
	 * 	Update L6560OutputParmInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL6560OutputParmInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,l6560OutputParmInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update L6560OutputParmInfo with another Field
	 *	@param value
	 */
   public void setL6560OutputParmInfo(Field source) {
   	replace(source,0,source.length(),l6560OutputParmInfo.begin,l6560OutputParmInfo.length());
   }  
   
     /**
	 * 	Update L6560OutputParmInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setL6560OutputParmInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,l6560OutputParmInfo.begin,l6560OutputParmInfo.length());
   }
   
     /**
	 * 	Update L6560OutputParmInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL6560OutputParmInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,l6560OutputParmInfo.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getL6560ParmInfoFieldLength() {
			return L_6560_PARM_INFO_LENGTH;
		}

}
  
