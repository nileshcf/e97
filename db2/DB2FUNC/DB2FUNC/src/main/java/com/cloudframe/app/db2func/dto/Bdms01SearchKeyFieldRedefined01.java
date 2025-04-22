package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01SearchKeyFieldRedefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Bdms01SearchKeyFieldRedefined01 extends Bdms01SearchKeyFieldRedefined01Serialized { 
   

								private long bdms01SearchKeyEis;

						private char[] bdms01SearchKeyEisCntry = Field.fillLowValue(2);
	
	/**
	* Constructor for Bdms01SearchKeyFieldRedefined01
	**/
    public Bdms01SearchKeyFieldRedefined01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01SearchKeyFieldRedefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SearchKeyFieldRedefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01SearchKeyEis
	 *	@return bdms01SearchKeyEis
	 */
	public long getBdms01SearchKeyEis() throws CFException {
       if (isBdms01SearchKeyEisModified()) { 
           bdms01SearchKeyEis = refreshBdms01SearchKeyEis();
        }
   		return bdms01SearchKeyEis;
	}
	

	
	   
	/**
	 * 	Update Bdms01SearchKeyEis with the passed value
	 *  Corresponding COBOL Variable is BDMS01-SEARCH-KEY-EIS
	 *	@param number
	 */
	public void setBdms01SearchKeyEis(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01SearchKeyEis = checkBdms01SearchKeyEisMaxLimit(number); 
		serializeBdms01SearchKeyEis(bdms01SearchKeyEis);
	}
	

	/**
	 * 	Update Bdms01SearchKeyEis with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01SearchKeyEis(char[] value) throws CFException {
		 bdms01SearchKeyEis = serializeBdms01SearchKeyEis(value);
	}
	/**
	 * 	Update Bdms01SearchKeyEis with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01SearchKeyEisString(char[] value) throws CFException {
		 setBdms01SearchKeyEis(value);
	}
	/**
	 *	Returns the value of bdms01SearchKeyEisCntry
	 *	@return bdms01SearchKeyEisCntry
	 */
   public char[] getBdms01SearchKeyEisCntry() throws CFException{
     if (isBdms01SearchKeyEisCntryModified()) { 
        bdms01SearchKeyEisCntry = refreshBdms01SearchKeyEisCntry();
     }
   		return bdms01SearchKeyEisCntry;
   }

  
	/**
	*  set variable bdms01SearchKeyEisCntry
	*  Corresponding COBOL Variable is BDMS01-SEARCH-KEY-EIS-CNTRY
	*  @param value
	**/
   public void setBdms01SearchKeyEisCntry(char[] value) {
      bdms01SearchKeyEisCntry = checkBdms01SearchKeyEisCntryConstraints(value);
      serializeBdms01SearchKeyEisCntry(bdms01SearchKeyEisCntry);
   } 

     /**
	 * 	Update Bdms01SearchKeyEisCntry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchKeyEisCntry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchKeyEisCntry,bdms01SearchKeyEisCntry.length);
   	
   }
   
   public void setBdms01SearchKeyEisCntry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyEisCntry,bdms01SearchKeyEisCntry.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchKeyEisCntry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyEisCntry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyEisCntry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchKeyEisCntry with another Field
	 *	@param value
	 */
   public void setBdms01SearchKeyEisCntry(Field source) {
       replace(source,0,source.length(),beginBdms01SearchKeyEisCntry,BDMS_01_SEARCH_KEY_EIS_CNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchKeyEisCntry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchKeyEisCntry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyEisCntry,BDMS_01_SEARCH_KEY_EIS_CNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchKeyEisCntry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyEisCntry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyEisCntry+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBdms01SearchKeyFieldRedefined01FieldLength() {
			return BDMS_01_SEARCH_KEY_FIELD_REDEFINED_01_LENGTH;
		}

}
  
