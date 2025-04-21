package com.cloudframe.app.ip798030.dto;

/**
*  The class McdynamErrorMsgTxt640 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.ip798030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class McdynamErrorMsgTxt640 extends McdynamErrorMsgTxt640Serialized {
   

						private char[] mcdynamRequest640 = new char[10];

						private char[] dsn640 = new char[39];



						private char[] mcdynamRc640 = new char[4];
	
	/**
	* Constructor for McdynamErrorMsgTxt640
	**/
    public McdynamErrorMsgTxt640() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMcdynamRequest640(fillSpace(10));
								setDsn640(fillSpace(39));
       replaceValue( // serialize and save the value
             (" FAILED. ").toCharArray()
             , getStartOffset() + 49
             ,9
             );
       replaceValue( // serialize and save the value
             ("RC:").toCharArray()
             , getStartOffset() + 58
             ,3
             );
								setMcdynamRc640(fillSpace(4));
    }


 

	/**
	 *	Returns the value of mcdynamRequest640
	 *	@return mcdynamRequest640
	 */
   public char[] getMcdynamRequest640() throws CFException{
     if (isMcdynamRequest640Modified()) { 
        mcdynamRequest640 = refreshMcdynamRequest640();
     }
   		return mcdynamRequest640;
   }

  
	/**
	*  set variable mcdynamRequest640
	*  Corresponding COBOL Variable is 640-MCDYNAM-REQUEST
	*  @param value
	**/
   public void setMcdynamRequest640(char[] value) {
      mcdynamRequest640 = checkMcdynamRequest640Constraints(value);
      serializeMcdynamRequest640(mcdynamRequest640);
   } 

     /**
	 * 	Update McdynamRequest640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcdynamRequest640(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcdynamRequest640,mcdynamRequest640.length);
   	
   }
   
   public void setMcdynamRequest640(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcdynamRequest640,mcdynamRequest640.length);
   	
   }
   
     /**
	 * 	Update McdynamRequest640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcdynamRequest640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcdynamRequest640+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McdynamRequest640 with another Field
	 *	@param value
	 */
   public void setMcdynamRequest640(Field source) {
       replace(source,0,source.length(),beginMcdynamRequest640,MCDYNAM_REQUEST_640_LEN);
   	
   }  
   
     /**
	 * 	Update McdynamRequest640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcdynamRequest640(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcdynamRequest640,MCDYNAM_REQUEST_640_LEN);
   	
   }
   
     /**
	 * 	Update McdynamRequest640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcdynamRequest640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcdynamRequest640+targetIndex,targetLen);
    
   }
	char[] mcdynamAllocation8864088Value = "ALLOCATE  ".toCharArray();
	/**
	 *	Test condition "ALLOCATE  " for isMcdynamAllocation88640()
	 *	@return  Returns true if isMcdynamAllocation88640() is "ALLOCATE  "
	 */
   public boolean isMcdynamAllocation88640() throws CFException {
      return (  compareChars( getMcdynamRequest640() , mcdynamAllocation8864088Value)  == 0  );
   }


	/**
	*  set values "ALLOCATE  "
	*/
   	public void setMcdynamAllocation88640True() {  			
    	setMcdynamRequest640( mcdynamAllocation8864088Value);
   	}
	char[] mcdynamDelete8864088Value = "DELETE    ".toCharArray();
	/**
	 *	Test condition "DELETE" for isMcdynamDelete88640()
	 *	@return  Returns true if isMcdynamDelete88640() is "DELETE"
	 */
   public boolean isMcdynamDelete88640() throws CFException {
      return (  compareChars( getMcdynamRequest640() , mcdynamDelete8864088Value)  == 0  );
   }


	/**
	*  set values "DELETE"
	*/
   	public void setMcdynamDelete88640True() {  			
    	setMcdynamRequest640( mcdynamDelete8864088Value);
   	}
	/**
	 *	Returns the value of dsn640
	 *	@return dsn640
	 */
   public char[] getDsn640() throws CFException{
     if (isDsn640Modified()) { 
        dsn640 = refreshDsn640();
     }
   		return dsn640;
   }

  
	/**
	*  set variable dsn640
	*  Corresponding COBOL Variable is 640-DSN
	*  @param value
	**/
   public void setDsn640(char[] value) {
      dsn640 = checkDsn640Constraints(value);
      serializeDsn640(dsn640);
   } 

     /**
	 * 	Update Dsn640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsn640(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsn640,dsn640.length);
   	
   }
   
   public void setDsn640(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsn640,dsn640.length);
   	
   }
   
     /**
	 * 	Update Dsn640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsn640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsn640+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dsn640 with another Field
	 *	@param value
	 */
   public void setDsn640(Field source) {
       replace(source,0,source.length(),beginDsn640,DSN_640_LEN);
   	
   }  
   
     /**
	 * 	Update Dsn640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsn640(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsn640,DSN_640_LEN);
   	
   }
   
     /**
	 * 	Update Dsn640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsn640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsn640+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mcdynamRc640
	 *	@return mcdynamRc640
	 */
   public char[] getMcdynamRc640() throws CFException{
     if (isMcdynamRc640Modified()) { 
        mcdynamRc640 = refreshMcdynamRc640();
     }
   		return mcdynamRc640;
   }

  
	/**
	*  set variable mcdynamRc640
	*  Corresponding COBOL Variable is 640-MCDYNAM-RC
	*  @param value
	**/
   public void setMcdynamRc640(char[] value) {
      mcdynamRc640 = checkMcdynamRc640Constraints(value);
      serializeMcdynamRc640(mcdynamRc640);
   } 

     /**
	 * 	Update McdynamRc640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcdynamRc640(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcdynamRc640,mcdynamRc640.length);
   	
   }
   
   public void setMcdynamRc640(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcdynamRc640,mcdynamRc640.length);
   	
   }
   
     /**
	 * 	Update McdynamRc640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcdynamRc640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcdynamRc640+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McdynamRc640 with another Field
	 *	@param value
	 */
   public void setMcdynamRc640(Field source) {
       replace(source,0,source.length(),beginMcdynamRc640,MCDYNAM_RC_640_LEN);
   	
   }  
   
     /**
	 * 	Update McdynamRc640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcdynamRc640(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcdynamRc640,MCDYNAM_RC_640_LEN);
   	
   }
   
     /**
	 * 	Update McdynamRc640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcdynamRc640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcdynamRc640+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMcdynamErrorMsgTxt640FieldLength() {
			return MCDYNAM_ERROR_MSG_TXT_640_LENGTH;
		}

}
  
