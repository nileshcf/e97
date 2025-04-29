package com.cloudframe.app.sf326010.dto;

/**
*  The class FixedHeader801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FixedHeader801 extends FixedHeader801Serialized { 
   

						private char[] sys001MiplogClass801 = Field.fillLowValue(1);

						private char[] sys001MiplogTyp801 = Field.fillLowValue(1);

						private char[] sys001MiplogRefNum801 = Field.fillLowValue(6);

						private char[] sys001MiplogBoxId801 = Field.fillLowValue(3);
				private Sys001MiplogTime801 sys001MiplogTime801 = new Sys001MiplogTime801();
				private Sys001MiplogDate801 sys001MiplogDate801 = new Sys001MiplogDate801();

						private char[] sys001MiplogElaTimX801 = Field.fillLowValue(4);
	
	/**
	* Constructor for FixedHeader801
	**/
    public FixedHeader801() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FixedHeader801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FixedHeader801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sys001MiplogTime801.setParent(this,getStartOffset() + 26);
	       			sys001MiplogDate801.setParent(this,getStartOffset() + 29);
    } 

	/**
	 *	Returns the value of sys001MiplogClass801
	 *	@return sys001MiplogClass801
	 */
   public char[] getSys001MiplogClass801() throws CFException{
     if (isSys001MiplogClass801Modified()) { 
        sys001MiplogClass801 = refreshSys001MiplogClass801();
     }
   		return sys001MiplogClass801;
   }

  
	/**
	*  set variable sys001MiplogClass801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-CLASS
	*  @param value
	**/
   public void setSys001MiplogClass801(char[] value) {
      sys001MiplogClass801 = checkSys001MiplogClass801Constraints(value);
      serializeSys001MiplogClass801(sys001MiplogClass801);
   } 

     /**
	 * 	Update Sys001MiplogClass801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogClass801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogClass801,sys001MiplogClass801.length);
   	
   }
   
   public void setSys001MiplogClass801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogClass801,sys001MiplogClass801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogClass801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogClass801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogClass801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogClass801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogClass801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogClass801,SYS_001_MIPLOG_CLASS_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogClass801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogClass801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogClass801,SYS_001_MIPLOG_CLASS_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogClass801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogClass801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogClass801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys001MiplogTyp801
	 *	@return sys001MiplogTyp801
	 */
   public char[] getSys001MiplogTyp801() throws CFException{
     if (isSys001MiplogTyp801Modified()) { 
        sys001MiplogTyp801 = refreshSys001MiplogTyp801();
     }
   		return sys001MiplogTyp801;
   }

  
	/**
	*  set variable sys001MiplogTyp801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-TYP
	*  @param value
	**/
   public void setSys001MiplogTyp801(char[] value) {
      sys001MiplogTyp801 = checkSys001MiplogTyp801Constraints(value);
      serializeSys001MiplogTyp801(sys001MiplogTyp801);
   } 

     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTyp801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogTyp801,sys001MiplogTyp801.length);
   	
   }
   
   public void setSys001MiplogTyp801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTyp801,sys001MiplogTyp801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTyp801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTyp801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogTyp801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTyp801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogTyp801,SYS_001_MIPLOG_TYP_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTyp801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogTyp801,SYS_001_MIPLOG_TYP_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTyp801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTyp801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys001MiplogRefNum801
	 *	@return sys001MiplogRefNum801
	 */
   public char[] getSys001MiplogRefNum801() throws CFException{
     if (isSys001MiplogRefNum801Modified()) { 
        sys001MiplogRefNum801 = refreshSys001MiplogRefNum801();
     }
   		return sys001MiplogRefNum801;
   }

  
	/**
	*  set variable sys001MiplogRefNum801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-REF-NUM
	*  @param value
	**/
   public void setSys001MiplogRefNum801(char[] value) {
      sys001MiplogRefNum801 = checkSys001MiplogRefNum801Constraints(value);
      serializeSys001MiplogRefNum801(sys001MiplogRefNum801);
   } 

     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogRefNum801,sys001MiplogRefNum801.length);
   	
   }
   
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogRefNum801,sys001MiplogRefNum801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogRefNum801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogRefNum801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogRefNum801,SYS_001_MIPLOG_REF_NUM_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogRefNum801,SYS_001_MIPLOG_REF_NUM_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogRefNum801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys001MiplogBoxId801
	 *	@return sys001MiplogBoxId801
	 */
   public char[] getSys001MiplogBoxId801() throws CFException{
     if (isSys001MiplogBoxId801Modified()) { 
        sys001MiplogBoxId801 = refreshSys001MiplogBoxId801();
     }
   		return sys001MiplogBoxId801;
   }

  
	/**
	*  set variable sys001MiplogBoxId801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-BOX-ID
	*  @param value
	**/
   public void setSys001MiplogBoxId801(char[] value) {
      sys001MiplogBoxId801 = checkSys001MiplogBoxId801Constraints(value);
      serializeSys001MiplogBoxId801(sys001MiplogBoxId801);
   } 

     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogBoxId801,sys001MiplogBoxId801.length);
   	
   }
   
   public void setSys001MiplogBoxId801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogBoxId801,sys001MiplogBoxId801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogBoxId801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogBoxId801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogBoxId801,SYS_001_MIPLOG_BOX_ID_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogBoxId801,SYS_001_MIPLOG_BOX_ID_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogBoxId801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys001MiplogTime801
	 *	@return sys001MiplogTime801
	 */   
	 public Sys001MiplogTime801 getSys001MiplogTime801() {
   	return sys001MiplogTime801;
   }
   /**
	* 	Update Sys001MiplogTime801 with the passed value
	*   Corresponding COBOL Variable is 801-SYS001-MIPLOG-TIME
	*	@param value
	*/
   public void setSys001MiplogTime801(char[] value) {
      sys001MiplogTime801.setString(value); 
   }   
    
     /**
	 * 	Update Sys001MiplogTime801 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTime801(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys001MiplogTime801.begin,sys001MiplogTime801.length());
   }
   
     /**
	 * 	Update Sys001MiplogTime801 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTime801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys001MiplogTime801.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogTime801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTime801(Field source) {
   	replace(source,0,source.length(),sys001MiplogTime801.begin,sys001MiplogTime801.length());
   }  
   
     /**
	 * 	Update Sys001MiplogTime801 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTime801(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys001MiplogTime801.begin,sys001MiplogTime801.length());
   }
   
     /**
	 * 	Update Sys001MiplogTime801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTime801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys001MiplogTime801.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sys001MiplogDate801
	 *	@return sys001MiplogDate801
	 */   
	 public Sys001MiplogDate801 getSys001MiplogDate801() {
   	return sys001MiplogDate801;
   }
   /**
	* 	Update Sys001MiplogDate801 with the passed value
	*   Corresponding COBOL Variable is 801-SYS001-MIPLOG-DATE
	*	@param value
	*/
   public void setSys001MiplogDate801(char[] value) {
      sys001MiplogDate801.setString(value); 
   }   
    
     /**
	 * 	Update Sys001MiplogDate801 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDate801(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys001MiplogDate801.begin,sys001MiplogDate801.length());
   }
   
     /**
	 * 	Update Sys001MiplogDate801 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDate801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys001MiplogDate801.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogDate801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogDate801(Field source) {
   	replace(source,0,source.length(),sys001MiplogDate801.begin,sys001MiplogDate801.length());
   }  
   
     /**
	 * 	Update Sys001MiplogDate801 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDate801(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys001MiplogDate801.begin,sys001MiplogDate801.length());
   }
   
     /**
	 * 	Update Sys001MiplogDate801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDate801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys001MiplogDate801.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sys001MiplogElaTimX801
	 *	@return sys001MiplogElaTimX801
	 */
   public char[] getSys001MiplogElaTimX801() throws CFException{
     if (isSys001MiplogElaTimX801Modified()) { 
        sys001MiplogElaTimX801 = refreshSys001MiplogElaTimX801();
     }
   		return sys001MiplogElaTimX801;
   }

  
	/**
	*  set variable sys001MiplogElaTimX801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-ELA-TIM-X
	*  @param value
	**/
   public void setSys001MiplogElaTimX801(char[] value) {
      sys001MiplogElaTimX801 = checkSys001MiplogElaTimX801Constraints(value);
      serializeSys001MiplogElaTimX801(sys001MiplogElaTimX801);
   } 

     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogElaTimX801,sys001MiplogElaTimX801.length);
   	
   }
   
   public void setSys001MiplogElaTimX801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogElaTimX801,sys001MiplogElaTimX801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogElaTimX801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogElaTimX801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogElaTimX801,SYS_001_MIPLOG_ELA_TIM_X_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogElaTimX801,SYS_001_MIPLOG_ELA_TIM_X_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogElaTimX801+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFixedHeader801FieldLength() {
			return FIXED_HEADER_801_LENGTH;
		}

}
  
