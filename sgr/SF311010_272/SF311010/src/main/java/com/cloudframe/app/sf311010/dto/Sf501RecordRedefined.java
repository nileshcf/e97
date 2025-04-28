package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501RecordRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf501RecordRedefined extends Sf501RecordRedefinedSerialized { 
   

						private char[] sf501Class = Field.fillLowValue(1);

						private char[] sf501Type = Field.fillLowValue(1);
				private Sf501Header sf501Header = new Sf501Header();

						private char[] sf501JIcSeqNo = Field.fillLowValue(4);

								private long sf501JIcSeqNoComp;

						private char[] sf501JIsoData = Field.fillLowValue(7939);
				private Sf501JIsoDataRedefined sf501JIsoDataRedefined = new Sf501JIsoDataRedefined();
	
	/**
	* Constructor for Sf501RecordRedefined
	**/
    public Sf501RecordRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf501RecordRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501RecordRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf501Header.setParent(this,getStartOffset() + 2);
	       			sf501JIsoDataRedefined.setParent(this,getStartOffset() + 61);
    } 

	/**
	 *	Returns the value of sf501Class
	 *	@return sf501Class
	 */
   public char[] getSf501Class() throws CFException{
     if (isSf501ClassModified()) { 
        sf501Class = refreshSf501Class();
     }
   		return sf501Class;
   }

  
	/**
	*  set variable sf501Class
	*  Corresponding COBOL Variable is SF501-CLASS
	*  @param value
	**/
   public void setSf501Class(char[] value) {
      sf501Class = checkSf501ClassConstraints(value);
      serializeSf501Class(sf501Class);
   } 

     /**
	 * 	Update Sf501Class 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501Class(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501Class,sf501Class.length);
   	
   }
   
   public void setSf501Class(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501Class,sf501Class.length);
   	
   }
   
     /**
	 * 	Update Sf501Class 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501Class(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501Class+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501Class with another Field
	 *	@param value
	 */
   public void setSf501Class(Field source) {
       replace(source,0,source.length(),beginSf501Class,SF_501_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501Class 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501Class(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501Class,SF_501_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update Sf501Class 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501Class(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501Class+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501Type
	 *	@return sf501Type
	 */
   public char[] getSf501Type() throws CFException{
     if (isSf501TypeModified()) { 
        sf501Type = refreshSf501Type();
     }
   		return sf501Type;
   }

  
	/**
	*  set variable sf501Type
	*  Corresponding COBOL Variable is SF501-TYPE
	*  @param value
	**/
   public void setSf501Type(char[] value) {
      sf501Type = checkSf501TypeConstraints(value);
      serializeSf501Type(sf501Type);
   } 

     /**
	 * 	Update Sf501Type 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501Type(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501Type,sf501Type.length);
   	
   }
   
   public void setSf501Type(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501Type,sf501Type.length);
   	
   }
   
     /**
	 * 	Update Sf501Type 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501Type(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501Type+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501Type with another Field
	 *	@param value
	 */
   public void setSf501Type(Field source) {
       replace(source,0,source.length(),beginSf501Type,SF_501_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501Type 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501Type(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501Type,SF_501_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf501Type 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501Type(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501Type+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501Header
	 *	@return sf501Header
	 */   
	 public Sf501Header getSf501Header() {
   	return sf501Header;
   }
   /**
	* 	Update Sf501Header with the passed value
	*   Corresponding COBOL Variable is SF501-HEADER
	*	@param value
	*/
   public void setSf501Header(char[] value) {
      sf501Header.setString(value); 
   }   
    
     /**
	 * 	Update Sf501Header 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf501Header(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501Header.begin,sf501Header.length());
   }
   
     /**
	 * 	Update Sf501Header 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501Header(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501Header.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf501Header with another Field
	 *	@param value
	 */
   public void setSf501Header(Field source) {
   	replace(source,0,source.length(),sf501Header.begin,sf501Header.length());
   }  
   
     /**
	 * 	Update Sf501Header 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf501Header(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501Header.begin,sf501Header.length());
   }
   
     /**
	 * 	Update Sf501Header 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501Header(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501Header.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf501JIcSeqNo
	 *	@return sf501JIcSeqNo
	 */
   public char[] getSf501JIcSeqNo() throws CFException{
     if (isSf501JIcSeqNoModified()) { 
        sf501JIcSeqNo = refreshSf501JIcSeqNo();
     }
   		return sf501JIcSeqNo;
   }

  
	/**
	*  set variable sf501JIcSeqNo
	*  Corresponding COBOL Variable is SF501-J-IC-SEQ-NO
	*  @param value
	**/
   public void setSf501JIcSeqNo(char[] value) {
      sf501JIcSeqNo = checkSf501JIcSeqNoConstraints(value);
      serializeSf501JIcSeqNo(sf501JIcSeqNo);
   } 

     /**
	 * 	Update Sf501JIcSeqNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501JIcSeqNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501JIcSeqNo,sf501JIcSeqNo.length);
   	
   }
   
   public void setSf501JIcSeqNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JIcSeqNo,sf501JIcSeqNo.length);
   	
   }
   
     /**
	 * 	Update Sf501JIcSeqNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501JIcSeqNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JIcSeqNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501JIcSeqNo with another Field
	 *	@param value
	 */
   public void setSf501JIcSeqNo(Field source) {
       replace(source,0,source.length(),beginSf501JIcSeqNo,SF_501_JIC_SEQ_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501JIcSeqNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501JIcSeqNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501JIcSeqNo,SF_501_JIC_SEQ_NO_LEN);
   	
   }
   
     /**
	 * 	Update Sf501JIcSeqNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501JIcSeqNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JIcSeqNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501JIcSeqNoComp
	 *	@return sf501JIcSeqNoComp
	 */
	public long getSf501JIcSeqNoComp() throws CFException {
        if (isSf501JIcSeqNoCompModified()) { 
           sf501JIcSeqNoComp = refreshSf501JIcSeqNoComp();
        }
   		return sf501JIcSeqNoComp;
	}
	
	/**
	 * 	Update Sf501JIcSeqNoComp with the passed value
	 *  Corresponding COBOL Variable is SF501-J-IC-SEQ-NO-COMP
	 *	@param number
	 */
	public void setSf501JIcSeqNoComp(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sf501JIcSeqNoComp = checkSf501JIcSeqNoCompMaxLimit(number); 
		serializeSf501JIcSeqNoComp(sf501JIcSeqNoComp);
	}


	/**
	 *	Returns the value of sf501JIsoData
	 *	@return sf501JIsoData
	 */
   public char[] getSf501JIsoData() throws CFException{
     if (isSf501JIsoDataModified()) { 
        sf501JIsoData = refreshSf501JIsoData();
     }
   		return sf501JIsoData;
   }

  
	/**
	*  set variable sf501JIsoData
	*  Corresponding COBOL Variable is SF501-J-ISO-DATA
	*  @param value
	**/
   public void setSf501JIsoData(char[] value) {
      sf501JIsoData = checkSf501JIsoDataConstraints(value);
      serializeSf501JIsoData(sf501JIsoData);
   } 

     /**
	 * 	Update Sf501JIsoData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501JIsoData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501JIsoData,sf501JIsoData.length);
   	
   }
   
   public void setSf501JIsoData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JIsoData,sf501JIsoData.length);
   	
   }
   
     /**
	 * 	Update Sf501JIsoData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501JIsoData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JIsoData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501JIsoData with another Field
	 *	@param value
	 */
   public void setSf501JIsoData(Field source) {
       replace(source,0,source.length(),beginSf501JIsoData,SF_501_JISO_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501JIsoData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501JIsoData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501JIsoData,SF_501_JISO_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf501JIsoData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501JIsoData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501JIsoData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501JIsoDataRedefined
	 *	@return sf501JIsoDataRedefined
	 */   
	 public Sf501JIsoDataRedefined getSf501JIsoDataRedefined() {
   	return sf501JIsoDataRedefined;
   }
   /**
	* 	Update Sf501JIsoDataRedefined with the passed value
	*   Corresponding COBOL Variable is SF501-J-ISO-DATA-REDEFINED
	*	@param value
	*/
   public void setSf501JIsoDataRedefined(char[] value) {
      sf501JIsoDataRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Sf501JIsoDataRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf501JIsoDataRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501JIsoDataRedefined.begin,sf501JIsoDataRedefined.length());
   }
   
     /**
	 * 	Update Sf501JIsoDataRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501JIsoDataRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501JIsoDataRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf501JIsoDataRedefined with another Field
	 *	@param value
	 */
   public void setSf501JIsoDataRedefined(Field source) {
   	replace(source,0,source.length(),sf501JIsoDataRedefined.begin,sf501JIsoDataRedefined.length());
   }  
   
     /**
	 * 	Update Sf501JIsoDataRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf501JIsoDataRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501JIsoDataRedefined.begin,sf501JIsoDataRedefined.length());
   }
   
     /**
	 * 	Update Sf501JIsoDataRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501JIsoDataRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501JIsoDataRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSf501RecordRedefinedFieldLength() {
			return SF_501_RECORD_REDEFINED_LENGTH;
		}

}
  
