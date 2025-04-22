package com.cloudframe.app.ar640010.dto;

/**
*  The class TsSuffix600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TsSuffix600 extends TsSuffix600Serialized { 
   

				private TsDate600 tsDate600 = new TsDate600();

				private TsTime600 tsTime600 = new TsTime600();


						private char[] tsHundredth600 = new char[2];
	
	/**
	* Constructor for TsSuffix600
	**/
    public TsSuffix600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TsSuffix600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TsSuffix600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			tsDate600.setParent(this,getStartOffset() + 9);
	       			tsTime600.setParent(this,getStartOffset() + 27);
       replaceValue( // serialize and save the value
             (" - DATE: ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             (", TIME: ").toCharArray()
             , getStartOffset() + 19
             ,8
             );
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 35
             ,1
             );
								setTsHundredth600(fillSpace(2));
    } 

	/**
	 *	Returns the value of tsDate600
	 *	@return tsDate600
	 */   
	 public TsDate600 getTsDate600() {
   	return tsDate600;
   }
   /**
	* 	Update TsDate600 with the passed value
	*   Corresponding COBOL Variable is 600-TS-DATE
	*	@param value
	*/
   public void setTsDate600(char[] value) {
      tsDate600.setString(value); 
   }   
    
     /**
	 * 	Update TsDate600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTsDate600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tsDate600.begin,tsDate600.length());
   }
   
     /**
	 * 	Update TsDate600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTsDate600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tsDate600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TsDate600 with another Field
	 *	@param value
	 */
   public void setTsDate600(Field source) {
   	replace(source,0,source.length(),tsDate600.begin,tsDate600.length());
   }  
   
     /**
	 * 	Update TsDate600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTsDate600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tsDate600.begin,tsDate600.length());
   }
   
     /**
	 * 	Update TsDate600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTsDate600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tsDate600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tsTime600
	 *	@return tsTime600
	 */   
	 public TsTime600 getTsTime600() {
   	return tsTime600;
   }
   /**
	* 	Update TsTime600 with the passed value
	*   Corresponding COBOL Variable is 600-TS-TIME
	*	@param value
	*/
   public void setTsTime600(char[] value) {
      tsTime600.setString(value); 
   }   
    
     /**
	 * 	Update TsTime600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTsTime600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tsTime600.begin,tsTime600.length());
   }
   
     /**
	 * 	Update TsTime600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTsTime600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tsTime600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TsTime600 with another Field
	 *	@param value
	 */
   public void setTsTime600(Field source) {
   	replace(source,0,source.length(),tsTime600.begin,tsTime600.length());
   }  
   
     /**
	 * 	Update TsTime600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTsTime600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tsTime600.begin,tsTime600.length());
   }
   
     /**
	 * 	Update TsTime600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTsTime600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tsTime600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tsHundredth600
	 *	@return tsHundredth600
	 */
   public char[] getTsHundredth600() throws CFException{
     if (isTsHundredth600Modified()) { 
        tsHundredth600 = refreshTsHundredth600();
     }
   		return tsHundredth600;
   }

  
	/**
	*  set variable tsHundredth600
	*  Corresponding COBOL Variable is 600-TS-HUNDREDTH
	*  @param value
	**/
   public void setTsHundredth600(char[] value) {
      tsHundredth600 = checkTsHundredth600Constraints(value);
      serializeTsHundredth600(tsHundredth600);
   } 

     /**
	 * 	Update TsHundredth600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTsHundredth600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTsHundredth600,tsHundredth600.length);
   	
   }
   
   public void setTsHundredth600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTsHundredth600,tsHundredth600.length);
   	
   }
   
     /**
	 * 	Update TsHundredth600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTsHundredth600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsHundredth600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TsHundredth600 with another Field
	 *	@param value
	 */
   public void setTsHundredth600(Field source) {
       replace(source,0,source.length(),beginTsHundredth600,TS_HUNDREDTH_600_LEN);
   	
   }  
   
     /**
	 * 	Update TsHundredth600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTsHundredth600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTsHundredth600,TS_HUNDREDTH_600_LEN);
   	
   }
   
     /**
	 * 	Update TsHundredth600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTsHundredth600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsHundredth600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTsSuffix600FieldLength() {
			return TS_SUFFIX_600_LENGTH;
		}

}
  
