package com.cloudframe.app.ar640010.dto;

/**
*  The class TsDate600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TsDate600 extends TsDate600Serialized { 
   

						private char[] tsYear600 = new char[4];


						private char[] tsMonth600 = new char[2];


						private char[] tsDay600 = new char[2];
	
	/**
	* Constructor for TsDate600
	**/
    public TsDate600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TsDate600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TsDate600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTsYear600(fillSpace(4));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
								setTsMonth600(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 7
             ,1
             );
								setTsDay600(fillSpace(2));
    } 

	/**
	 *	Returns the value of tsYear600
	 *	@return tsYear600
	 */
   public char[] getTsYear600() throws CFException{
     if (isTsYear600Modified()) { 
        tsYear600 = refreshTsYear600();
     }
   		return tsYear600;
   }

  
	/**
	*  set variable tsYear600
	*  Corresponding COBOL Variable is 600-TS-YEAR
	*  @param value
	**/
   public void setTsYear600(char[] value) {
      tsYear600 = checkTsYear600Constraints(value);
      serializeTsYear600(tsYear600);
   } 

     /**
	 * 	Update TsYear600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTsYear600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTsYear600,tsYear600.length);
   	
   }
   
   public void setTsYear600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTsYear600,tsYear600.length);
   	
   }
   
     /**
	 * 	Update TsYear600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTsYear600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsYear600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TsYear600 with another Field
	 *	@param value
	 */
   public void setTsYear600(Field source) {
       replace(source,0,source.length(),beginTsYear600,TS_YEAR_600_LEN);
   	
   }  
   
     /**
	 * 	Update TsYear600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTsYear600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTsYear600,TS_YEAR_600_LEN);
   	
   }
   
     /**
	 * 	Update TsYear600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTsYear600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsYear600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tsMonth600
	 *	@return tsMonth600
	 */
   public char[] getTsMonth600() throws CFException{
     if (isTsMonth600Modified()) { 
        tsMonth600 = refreshTsMonth600();
     }
   		return tsMonth600;
   }

  
	/**
	*  set variable tsMonth600
	*  Corresponding COBOL Variable is 600-TS-MONTH
	*  @param value
	**/
   public void setTsMonth600(char[] value) {
      tsMonth600 = checkTsMonth600Constraints(value);
      serializeTsMonth600(tsMonth600);
   } 

     /**
	 * 	Update TsMonth600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTsMonth600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTsMonth600,tsMonth600.length);
   	
   }
   
   public void setTsMonth600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTsMonth600,tsMonth600.length);
   	
   }
   
     /**
	 * 	Update TsMonth600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTsMonth600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsMonth600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TsMonth600 with another Field
	 *	@param value
	 */
   public void setTsMonth600(Field source) {
       replace(source,0,source.length(),beginTsMonth600,TS_MONTH_600_LEN);
   	
   }  
   
     /**
	 * 	Update TsMonth600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTsMonth600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTsMonth600,TS_MONTH_600_LEN);
   	
   }
   
     /**
	 * 	Update TsMonth600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTsMonth600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsMonth600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tsDay600
	 *	@return tsDay600
	 */
   public char[] getTsDay600() throws CFException{
     if (isTsDay600Modified()) { 
        tsDay600 = refreshTsDay600();
     }
   		return tsDay600;
   }

  
	/**
	*  set variable tsDay600
	*  Corresponding COBOL Variable is 600-TS-DAY
	*  @param value
	**/
   public void setTsDay600(char[] value) {
      tsDay600 = checkTsDay600Constraints(value);
      serializeTsDay600(tsDay600);
   } 

     /**
	 * 	Update TsDay600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTsDay600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTsDay600,tsDay600.length);
   	
   }
   
   public void setTsDay600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTsDay600,tsDay600.length);
   	
   }
   
     /**
	 * 	Update TsDay600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTsDay600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsDay600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TsDay600 with another Field
	 *	@param value
	 */
   public void setTsDay600(Field source) {
       replace(source,0,source.length(),beginTsDay600,TS_DAY_600_LEN);
   	
   }  
   
     /**
	 * 	Update TsDay600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTsDay600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTsDay600,TS_DAY_600_LEN);
   	
   }
   
     /**
	 * 	Update TsDay600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTsDay600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsDay600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTsDate600FieldLength() {
			return TS_DATE_600_LENGTH;
		}

}
  
