package com.cloudframe.app.crntof.dto;

/**
*  The class CrntofTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:57. using version 5.0.0.256
**/


import com.cloudframe.app.crntof.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CrntofTable extends CrntofTableSerialized {
   

						private char[] crntofId = Field.fillLowValue(4);

						private char[] crntofName01 = Field.fillLowValue(6);

								private short crntofNameN;
	
	/**
	* Constructor for CrntofTable
	**/
    public CrntofTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCrntofNameN((short)0);
    }


 

	/**
	 *	Returns the value of crntofId
	 *	@return crntofId
	 */
   public char[] getCrntofId() throws CFException{
     if (isCrntofIdModified()) { 
        crntofId = refreshCrntofId();
     }
   		return crntofId;
   }

  
	/**
	*  set variable crntofId
	*  Corresponding COBOL Variable is CRNTOF-ID
	*  @param value
	**/
   public void setCrntofId(char[] value) {
      crntofId = checkCrntofIdConstraints(value);
      serializeCrntofId(crntofId);
   } 

     /**
	 * 	Update CrntofId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrntofId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCrntofId,crntofId.length);
   	
   }
   
   public void setCrntofId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCrntofId,crntofId.length);
   	
   }
   
     /**
	 * 	Update CrntofId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrntofId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrntofId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CrntofId with another Field
	 *	@param value
	 */
   public void setCrntofId(Field source) {
       replace(source,0,source.length(),beginCrntofId,CRNTOF_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CrntofId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrntofId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCrntofId,CRNTOF_ID_LEN);
   	
   }
   
     /**
	 * 	Update CrntofId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrntofId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrntofId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of crntofName01
	 *	@return crntofName01
	 */
   public char[] getCrntofName01() throws CFException{
     if (isCrntofName01Modified()) { 
        crntofName01 = refreshCrntofName01();
     }
   		return crntofName01;
   }

  
	/**
	*  set variable crntofName01
	*  Corresponding COBOL Variable is CRNTOF-NAME
	*  @param value
	**/
   public void setCrntofName01(char[] value) {
      crntofName01 = checkCrntofName01Constraints(value);
      serializeCrntofName01(crntofName01);
   } 

     /**
	 * 	Update CrntofName01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrntofName01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCrntofName01,crntofName01.length);
   	
   }
   
   public void setCrntofName01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCrntofName01,crntofName01.length);
   	
   }
   
     /**
	 * 	Update CrntofName01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrntofName01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrntofName01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CrntofName01 with another Field
	 *	@param value
	 */
   public void setCrntofName01(Field source) {
       replace(source,0,source.length(),beginCrntofName01,CRNTOF_NAME_01_LEN);
   	
   }  
   
     /**
	 * 	Update CrntofName01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrntofName01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCrntofName01,CRNTOF_NAME_01_LEN);
   	
   }
   
     /**
	 * 	Update CrntofName01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrntofName01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrntofName01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of crntofNameN
	 *	@return crntofNameN
	 */
	public short getCrntofNameN() throws CFException {
        if (isCrntofNameNModified()) { 
           crntofNameN = refreshCrntofNameN();
        }
   		return crntofNameN;
	}
	
	/**
	 * 	Update CrntofNameN with the passed value
	 *  Corresponding COBOL Variable is CRNTOF-NAME-N
	 *	@param number
	 */
	public void setCrntofNameN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    crntofNameN = checkCrntofNameNMaxLimit(number); 
		serializeCrntofNameN(crntofNameN);
	}

	public void setCrntofNameN(int number) {
	    number = checkCrntofNameNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCrntofNameN((short)number);
	}
	public void setCrntofNameN(long number) {
	    number = checkCrntofNameNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCrntofNameN((short)number);
	}
	


	
	
	

		public static int getCrntofTableFieldLength() {
			return CRNTOF_TABLE_LENGTH;
		}

}
  
