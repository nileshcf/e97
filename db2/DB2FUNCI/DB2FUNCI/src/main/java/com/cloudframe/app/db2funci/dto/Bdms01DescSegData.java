package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01DescSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


public class Bdms01DescSegData extends Bdms01DescSegDataSerialized { 
   

								private int bdms01DescSegSqlcd;

						private char[] msdSecurityDesc2 = Field.fillLowValue(30);

						private char[] msdSecurityDesc3 = Field.fillLowValue(30);

						private char[] msdBondDesc3 = Field.fillLowValue(30);

						private char[] msdStkDesc3 = Field.fillLowValue(30);
			private List<Bdms01CallParametersArray1> bdms01CallParametersArray1 = new ArrayList<>();
    	

	
	/**
	* Constructor for Bdms01DescSegData
	**/
    public Bdms01DescSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01DescSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01DescSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01DescSegSqlcd
	 *	@return bdms01DescSegSqlcd
	 */
	public int getBdms01DescSegSqlcd() throws CFException {
       if (isBdms01DescSegSqlcdModified()) { 
           bdms01DescSegSqlcd = refreshBdms01DescSegSqlcd();
        }
   		return bdms01DescSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01DescSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-DESC-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01DescSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01DescSegSqlcd = checkBdms01DescSegSqlcdMaxLimit(number); 
		serializeBdms01DescSegSqlcd(bdms01DescSegSqlcd);
	}
	

	public void setBdms01DescSegSqlcd(long number) {
	    number = checkBdms01DescSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01DescSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01DescSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01DescSegSqlcd(char[] value) throws CFException {
		 bdms01DescSegSqlcd = serializeBdms01DescSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01DescSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01DescSegSqlcdString(char[] value) throws CFException {
		 setBdms01DescSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdSecurityDesc2
	 *	@return msdSecurityDesc2
	 */
   public char[] getMsdSecurityDesc2() throws CFException{
     if (isMsdSecurityDesc2Modified()) { 
        msdSecurityDesc2 = refreshMsdSecurityDesc2();
     }
   		return msdSecurityDesc2;
   }

  
	/**
	*  set variable msdSecurityDesc2
	*  Corresponding COBOL Variable is MSD-SECURITY-DESC2
	*  @param value
	**/
   public void setMsdSecurityDesc2(char[] value) {
      msdSecurityDesc2 = checkMsdSecurityDesc2Constraints(value);
      serializeMsdSecurityDesc2(msdSecurityDesc2);
   } 

     /**
	 * 	Update MsdSecurityDesc2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityDesc2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecurityDesc2,msdSecurityDesc2.length);
   	
   }
   
   public void setMsdSecurityDesc2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityDesc2,msdSecurityDesc2.length);
   	
   }
   
     /**
	 * 	Update MsdSecurityDesc2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityDesc2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityDesc2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecurityDesc2 with another Field
	 *	@param value
	 */
   public void setMsdSecurityDesc2(Field source) {
       replace(source,0,source.length(),beginMsdSecurityDesc2,MSD_SECURITY_DESC_2_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecurityDesc2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecurityDesc2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecurityDesc2,MSD_SECURITY_DESC_2_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecurityDesc2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityDesc2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityDesc2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSecurityDesc3
	 *	@return msdSecurityDesc3
	 */
   public char[] getMsdSecurityDesc3() throws CFException{
     if (isMsdSecurityDesc3Modified()) { 
        msdSecurityDesc3 = refreshMsdSecurityDesc3();
     }
   		return msdSecurityDesc3;
   }

  
	/**
	*  set variable msdSecurityDesc3
	*  Corresponding COBOL Variable is MSD-SECURITY-DESC3
	*  @param value
	**/
   public void setMsdSecurityDesc3(char[] value) {
      msdSecurityDesc3 = checkMsdSecurityDesc3Constraints(value);
      serializeMsdSecurityDesc3(msdSecurityDesc3);
   } 

     /**
	 * 	Update MsdSecurityDesc3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityDesc3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecurityDesc3,msdSecurityDesc3.length);
   	
   }
   
   public void setMsdSecurityDesc3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityDesc3,msdSecurityDesc3.length);
   	
   }
   
     /**
	 * 	Update MsdSecurityDesc3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityDesc3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityDesc3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecurityDesc3 with another Field
	 *	@param value
	 */
   public void setMsdSecurityDesc3(Field source) {
       replace(source,0,source.length(),beginMsdSecurityDesc3,MSD_SECURITY_DESC_3_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecurityDesc3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecurityDesc3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecurityDesc3,MSD_SECURITY_DESC_3_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecurityDesc3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityDesc3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityDesc3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdBondDesc3
	 *	@return msdBondDesc3
	 */
   public char[] getMsdBondDesc3() throws CFException{
     if (isMsdBondDesc3Modified()) { 
        msdBondDesc3 = refreshMsdBondDesc3();
     }
   		return msdBondDesc3;
   }

  
	/**
	*  set variable msdBondDesc3
	*  Corresponding COBOL Variable is MSD-BOND-DESC3
	*  @param value
	**/
   public void setMsdBondDesc3(char[] value) {
      msdBondDesc3 = checkMsdBondDesc3Constraints(value);
      serializeMsdBondDesc3(msdBondDesc3);
   } 

     /**
	 * 	Update MsdBondDesc3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdBondDesc3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdBondDesc3,msdBondDesc3.length);
   	
   }
   
   public void setMsdBondDesc3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondDesc3,msdBondDesc3.length);
   	
   }
   
     /**
	 * 	Update MsdBondDesc3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondDesc3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondDesc3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdBondDesc3 with another Field
	 *	@param value
	 */
   public void setMsdBondDesc3(Field source) {
       replace(source,0,source.length(),beginMsdBondDesc3,MSD_BOND_DESC_3_LEN);
   	
   }  
   
     /**
	 * 	Update MsdBondDesc3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdBondDesc3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdBondDesc3,MSD_BOND_DESC_3_LEN);
   	
   }
   
     /**
	 * 	Update MsdBondDesc3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondDesc3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondDesc3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdStkDesc3
	 *	@return msdStkDesc3
	 */
   public char[] getMsdStkDesc3() throws CFException{
     if (isMsdStkDesc3Modified()) { 
        msdStkDesc3 = refreshMsdStkDesc3();
     }
   		return msdStkDesc3;
   }

  
	/**
	*  set variable msdStkDesc3
	*  Corresponding COBOL Variable is MSD-STK-DESC3
	*  @param value
	**/
   public void setMsdStkDesc3(char[] value) {
      msdStkDesc3 = checkMsdStkDesc3Constraints(value);
      serializeMsdStkDesc3(msdStkDesc3);
   } 

     /**
	 * 	Update MsdStkDesc3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdStkDesc3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdStkDesc3,msdStkDesc3.length);
   	
   }
   
   public void setMsdStkDesc3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdStkDesc3,msdStkDesc3.length);
   	
   }
   
     /**
	 * 	Update MsdStkDesc3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdStkDesc3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdStkDesc3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdStkDesc3 with another Field
	 *	@param value
	 */
   public void setMsdStkDesc3(Field source) {
       replace(source,0,source.length(),beginMsdStkDesc3,MSD_STK_DESC_3_LEN);
   	
   }  
   
     /**
	 * 	Update MsdStkDesc3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdStkDesc3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdStkDesc3,MSD_STK_DESC_3_LEN);
   	
   }
   
     /**
	 * 	Update MsdStkDesc3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdStkDesc3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdStkDesc3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of bdms01CallParametersArray1
	 *  Corresponding COBOL Variable is FILLER
	 *	@return bdms01CallParametersArray1
	 */
   public List<Bdms01CallParametersArray1> getBdms01CallParametersArray1() {
       return bdms01CallParametersArray1;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return bdms01CallParametersArray1
	 */
	public Bdms01CallParametersArray1 getBdms01CallParametersArray1(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getBdms01CallParametersArray1(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE) {
             	index = BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE -1; // can't exceed max array size
             	logger.trace("bdms01CallParametersArray1 - Array index exceeded max Size {}, resetting it to max allowed",BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE); 
	    }
		if (index >= bdms01CallParametersArray1.size()) {
       		for (int fillIndex =  bdms01CallParametersArray1.size() -1; fillIndex < index;fillIndex++) {
		       bdms01CallParametersArray1.add(null);
		    }
			bdms01CallParametersArray1.set(index,
			   	   	new Bdms01CallParametersArray1(this,beginBdms01CallParametersArray1 + index * Bdms01CallParametersArray1.getBdms01CallParametersArray1FieldLength()) 
				                        ); 	
		} 
   	   Bdms01CallParametersArray1 value = bdms01CallParametersArray1.get(index);
   	   if (value == null) {
   	      bdms01CallParametersArray1.set(index,
			   	   	new Bdms01CallParametersArray1(this,beginBdms01CallParametersArray1 + index * Bdms01CallParametersArray1.getBdms01CallParametersArray1FieldLength()) 
				                        ); 
		  value = bdms01CallParametersArray1.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Bdms01CallParametersArray1 at index with the passed value
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setBdms01CallParametersArray1(int index,char[] value) {
   	getBdms01CallParametersArray1(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Bdms01DescSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01DescSegSqlcd(0);
         setMsdSecurityDesc2(CONSTANTS.SPACE_30);
         setMsdSecurityDesc3(CONSTANTS.SPACE_30);
     if (bdms01CallParametersArray1.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE;index++) {
              Bdms01CallParametersArray1  newElement = new Bdms01CallParametersArray1(this,beginBdms01CallParametersArray1 + index * Bdms01CallParametersArray1.getBdms01CallParametersArray1FieldLength());
              newElement.initialize();
               bdms01CallParametersArray1.add(newElement);
          }
     } else {
        if (bdms01CallParametersArray1.size() < BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE) {
          // prefill it first
          for (int index = bdms01CallParametersArray1.size();index <  BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE;index++) {
              Bdms01CallParametersArray1  newElement = new Bdms01CallParametersArray1(this,beginBdms01CallParametersArray1 + index * Bdms01CallParametersArray1.getBdms01CallParametersArray1FieldLength());
               bdms01CallParametersArray1.add(newElement);
          }
        }
        
     	for (int index = 0;index <  BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE;index++) {
     		Bdms01CallParametersArray1 bdms01CallParametersArray1Var = bdms01CallParametersArray1.get(index);
 			if (bdms01CallParametersArray1Var == null) {
                bdms01CallParametersArray1Var = new Bdms01CallParametersArray1(this,beginBdms01CallParametersArray1 + index * Bdms01CallParametersArray1.getBdms01CallParametersArray1FieldLength());
                  bdms01CallParametersArray1.set(index, bdms01CallParametersArray1Var);
			} 
			bdms01CallParametersArray1Var.initialize();
		}
     }
   }

		public static int getBdms01DescSegDataFieldLength() {
			return BDMS_01_DESC_SEG_DATA_LENGTH;
		}

}
  
