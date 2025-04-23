package com.cloudframe.app.vsammon4.file.records;

/**
*  The class VsvksdsRecordS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon4.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class VsvksdsRecordS extends VsvksdsRecordSSerialized {
   

								private long vskSPrimaryKey;

						private char[] vskSSysid = Field.fillLowValue(4);

								private int vskSTaskNo;

								private int vskSReqSize;

						private char[] vskSVarStruct = Field.fillLowValue(200);
	
	/**
	* Constructor for VsvksdsRecordS
	**/
    public VsvksdsRecordS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
       if (isVskSPrimaryKeyModified()) { 
           vskSPrimaryKey = refreshVskSPrimaryKey();
        }
   		return vskSPrimaryKey;
	}
	

	
	   
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *  Corresponding COBOL Variable is VSK-S-PRIMARY-KEY
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    vskSPrimaryKey = checkVskSPrimaryKeyMaxLimit(number); 
		serializeVskSPrimaryKey(vskSPrimaryKey);
	}
	

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value) throws CFException {
		 vskSPrimaryKey = serializeVskSPrimaryKey(value);
	}
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value) throws CFException {
		 setVskSPrimaryKey(value);
	}
	/**
	 *	Returns the value of vskSSysid
	 *	@return vskSSysid
	 */
   public char[] getVskSSysid() throws CFException{
     if (isVskSSysidModified()) { 
        vskSSysid = refreshVskSSysid();
     }
   		return vskSSysid;
   }

  
	/**
	*  set variable vskSSysid
	*  Corresponding COBOL Variable is VSK-S-SYSID
	*  @param value
	**/
   public void setVskSSysid(char[] value) {
      vskSSysid = checkVskSSysidConstraints(value);
      serializeVskSSysid(vskSSysid);
   } 

     /**
	 * 	Update VskSSysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskSSysid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVskSSysid,vskSSysid.length);
   	
   }
   
   public void setVskSSysid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVskSSysid,vskSSysid.length);
   	
   }
   
     /**
	 * 	Update VskSSysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskSSysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskSSysid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VskSSysid with another Field
	 *	@param value
	 */
   public void setVskSSysid(Field source) {
       replace(source,0,source.length(),beginVskSSysid,VSK_SSYSID_LEN);
   	
   }  
   
     /**
	 * 	Update VskSSysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskSSysid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVskSSysid,VSK_SSYSID_LEN);
   	
   }
   
     /**
	 * 	Update VskSSysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskSSysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskSSysid+targetIndex,targetLen);
    
   }
	public int getVskSTaskNo() throws CFException {
        if (isVskSTaskNoModified()) { 
           vskSTaskNo = refreshVskSTaskNo();
        }
   		return vskSTaskNo;
	}
	
	/**
	 * 	Update VskSTaskNo with the passed value
	 *  Corresponding COBOL Variable is VSK-S-TASK-NO
	 *	@param number
	 */
	public void setVskSTaskNo(int number) {
			vskSTaskNo = checkVskSTaskNoMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeVskSTaskNo(vskSTaskNo);
	}


	public void setVskSTaskNo(long number) {
	    number = checkVskSTaskNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setVskSTaskNo((int)number);
	}
	
	/**
	 *	Returns the value of vskSReqSize
	 *	@return vskSReqSize
	 */
	public int getVskSReqSize() throws CFException {
        if (isVskSReqSizeModified()) { 
           vskSReqSize = refreshVskSReqSize();
        }
   		return vskSReqSize;
	}
	
	/**
	 * 	Update VskSReqSize with the passed value
	 *  Corresponding COBOL Variable is VSK-S-REQ-SIZE
	 *	@param number
	 */
	public void setVskSReqSize(int number) {
	     // Truncate if the number is beyond +/- Max range
	    vskSReqSize = checkVskSReqSizeMaxLimit(number); 
		serializeVskSReqSize(vskSReqSize);
	}


	public void setVskSReqSize(long number) {
	    number = checkVskSReqSizeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setVskSReqSize((int)number);
	}
	
	/**
	 *	Returns the value of vskSVarStruct
	 *	@return vskSVarStruct
	 */
   public char[] getVskSVarStruct() throws CFException{
     if (isVskSVarStructModified()) { 
        vskSVarStruct = refreshVskSVarStruct();
     }
   		return vskSVarStruct;
   }

  
	/**
	*  set variable vskSVarStruct
	*  Corresponding COBOL Variable is VSK-S-VAR-STRUCT
	*  @param value
	**/
   public void setVskSVarStruct(char[] value) {
      vskSVarStruct = checkVskSVarStructConstraints(value);
      serializeVskSVarStruct(vskSVarStruct);
   } 

     /**
	 * 	Update VskSVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskSVarStruct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVskSVarStruct,vskSVarStruct.length);
   	
   }
   
   public void setVskSVarStruct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVskSVarStruct,vskSVarStruct.length);
   	
   }
   
     /**
	 * 	Update VskSVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskSVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskSVarStruct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VskSVarStruct with another Field
	 *	@param value
	 */
   public void setVskSVarStruct(Field source) {
       replace(source,0,source.length(),beginVskSVarStruct,VSK_SVAR_STRUCT_LEN);
   	
   }  
   
     /**
	 * 	Update VskSVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskSVarStruct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVskSVarStruct,VSK_SVAR_STRUCT_LEN);
   	
   }
   
     /**
	 * 	Update VskSVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskSVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskSVarStruct+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes VsvksdsRecordS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setVskSPrimaryKey(0);
         setVskSSysid(CONSTANTS.SPACE_4);
                     setVskSTaskNo(0);
                     setVskSReqSize(0);
         setVskSVarStruct(CONSTANTS.SPACE_200);
   }

		public static int getVsvksdsRecordSFieldLength() {
			return VSVKSDS_RECORD_S_LENGTH;
		}

}
  
