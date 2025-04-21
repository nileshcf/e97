package com.cloudframe.app.ar640010.dto;

/**
*  The class TsTime600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TsTime600 extends TsTime600Serialized { 
   

						private char[] tsHour600 = new char[2];


						private char[] tsMinute600 = new char[2];


						private char[] tsSecond600 = new char[2];
	
	/**
	* Constructor for TsTime600
	**/
    public TsTime600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TsTime600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TsTime600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTsHour600(fillSpace(2));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setTsMinute600(fillSpace(2));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setTsSecond600(fillSpace(2));
    } 

	/**
	 *	Returns the value of tsHour600
	 *	@return tsHour600
	 */
   public char[] getTsHour600() throws CFException{
     if (isTsHour600Modified()) { 
        tsHour600 = refreshTsHour600();
     }
   		return tsHour600;
   }

  
	/**
	*  set variable tsHour600
	*  Corresponding COBOL Variable is 600-TS-HOUR
	*  @param value
	**/
   public void setTsHour600(char[] value) {
      tsHour600 = checkTsHour600Constraints(value);
      serializeTsHour600(tsHour600);
   } 

     /**
	 * 	Update TsHour600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTsHour600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTsHour600,tsHour600.length);
   	
   }
   
   public void setTsHour600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTsHour600,tsHour600.length);
   	
   }
   
     /**
	 * 	Update TsHour600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTsHour600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsHour600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TsHour600 with another Field
	 *	@param value
	 */
   public void setTsHour600(Field source) {
       replace(source,0,source.length(),beginTsHour600,TS_HOUR_600_LEN);
   	
   }  
   
     /**
	 * 	Update TsHour600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTsHour600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTsHour600,TS_HOUR_600_LEN);
   	
   }
   
     /**
	 * 	Update TsHour600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTsHour600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsHour600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tsMinute600
	 *	@return tsMinute600
	 */
   public char[] getTsMinute600() throws CFException{
     if (isTsMinute600Modified()) { 
        tsMinute600 = refreshTsMinute600();
     }
   		return tsMinute600;
   }

  
	/**
	*  set variable tsMinute600
	*  Corresponding COBOL Variable is 600-TS-MINUTE
	*  @param value
	**/
   public void setTsMinute600(char[] value) {
      tsMinute600 = checkTsMinute600Constraints(value);
      serializeTsMinute600(tsMinute600);
   } 

     /**
	 * 	Update TsMinute600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTsMinute600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTsMinute600,tsMinute600.length);
   	
   }
   
   public void setTsMinute600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTsMinute600,tsMinute600.length);
   	
   }
   
     /**
	 * 	Update TsMinute600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTsMinute600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsMinute600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TsMinute600 with another Field
	 *	@param value
	 */
   public void setTsMinute600(Field source) {
       replace(source,0,source.length(),beginTsMinute600,TS_MINUTE_600_LEN);
   	
   }  
   
     /**
	 * 	Update TsMinute600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTsMinute600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTsMinute600,TS_MINUTE_600_LEN);
   	
   }
   
     /**
	 * 	Update TsMinute600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTsMinute600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsMinute600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tsSecond600
	 *	@return tsSecond600
	 */
   public char[] getTsSecond600() throws CFException{
     if (isTsSecond600Modified()) { 
        tsSecond600 = refreshTsSecond600();
     }
   		return tsSecond600;
   }

  
	/**
	*  set variable tsSecond600
	*  Corresponding COBOL Variable is 600-TS-SECOND
	*  @param value
	**/
   public void setTsSecond600(char[] value) {
      tsSecond600 = checkTsSecond600Constraints(value);
      serializeTsSecond600(tsSecond600);
   } 

     /**
	 * 	Update TsSecond600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTsSecond600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTsSecond600,tsSecond600.length);
   	
   }
   
   public void setTsSecond600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTsSecond600,tsSecond600.length);
   	
   }
   
     /**
	 * 	Update TsSecond600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTsSecond600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsSecond600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TsSecond600 with another Field
	 *	@param value
	 */
   public void setTsSecond600(Field source) {
       replace(source,0,source.length(),beginTsSecond600,TS_SECOND_600_LEN);
   	
   }  
   
     /**
	 * 	Update TsSecond600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTsSecond600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTsSecond600,TS_SECOND_600_LEN);
   	
   }
   
     /**
	 * 	Update TsSecond600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTsSecond600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTsSecond600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTsTime600FieldLength() {
			return TS_TIME_600_LENGTH;
		}

}
  
