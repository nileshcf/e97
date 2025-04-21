package com.cloudframe.app.vsammon4.file.records;

/**
*  The class VsvksdsRecordIo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:03. using version 5.0.0.256
**/


import com.cloudframe.app.vsammon4.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class VsvksdsRecordIo extends VsvksdsRecordIoSerialized {
   

								private long vskIoPrimaryKey;

						private char[] vskIoSysid = Field.fillLowValue(4);

								private int vskIoTaskNo;

								private int vskIoReqSize;

						private char[] vskIoVarStruct = Field.fillLowValue(200);
	
	/**
	* Constructor for VsvksdsRecordIo
	**/
    public VsvksdsRecordIo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
       if (isVskIoPrimaryKeyModified()) { 
           vskIoPrimaryKey = refreshVskIoPrimaryKey();
        }
   		return vskIoPrimaryKey;
	}
	

	
	   
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *  Corresponding COBOL Variable is VSK-IO-PRIMARY-KEY
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    vskIoPrimaryKey = checkVskIoPrimaryKeyMaxLimit(number); 
		serializeVskIoPrimaryKey(vskIoPrimaryKey);
	}
	

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value) throws CFException {
		 vskIoPrimaryKey = serializeVskIoPrimaryKey(value);
	}
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value) throws CFException {
		 setVskIoPrimaryKey(value);
	}
	/**
	 *	Returns the value of vskIoSysid
	 *	@return vskIoSysid
	 */
   public char[] getVskIoSysid() throws CFException{
     if (isVskIoSysidModified()) { 
        vskIoSysid = refreshVskIoSysid();
     }
   		return vskIoSysid;
   }

  
	/**
	*  set variable vskIoSysid
	*  Corresponding COBOL Variable is VSK-IO-SYSID
	*  @param value
	**/
   public void setVskIoSysid(char[] value) {
      vskIoSysid = checkVskIoSysidConstraints(value);
      serializeVskIoSysid(vskIoSysid);
   } 

     /**
	 * 	Update VskIoSysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskIoSysid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVskIoSysid,vskIoSysid.length);
   	
   }
   
   public void setVskIoSysid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVskIoSysid,vskIoSysid.length);
   	
   }
   
     /**
	 * 	Update VskIoSysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskIoSysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskIoSysid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VskIoSysid with another Field
	 *	@param value
	 */
   public void setVskIoSysid(Field source) {
       replace(source,0,source.length(),beginVskIoSysid,VSK_IO_SYSID_LEN);
   	
   }  
   
     /**
	 * 	Update VskIoSysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskIoSysid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVskIoSysid,VSK_IO_SYSID_LEN);
   	
   }
   
     /**
	 * 	Update VskIoSysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskIoSysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskIoSysid+targetIndex,targetLen);
    
   }
	public int getVskIoTaskNo() throws CFException {
        if (isVskIoTaskNoModified()) { 
           vskIoTaskNo = refreshVskIoTaskNo();
        }
   		return vskIoTaskNo;
	}
	
	/**
	 * 	Update VskIoTaskNo with the passed value
	 *  Corresponding COBOL Variable is VSK-IO-TASK-NO
	 *	@param number
	 */
	public void setVskIoTaskNo(int number) {
			vskIoTaskNo = checkVskIoTaskNoMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeVskIoTaskNo(vskIoTaskNo);
	}


	public void setVskIoTaskNo(long number) {
	    number = checkVskIoTaskNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setVskIoTaskNo((int)number);
	}
	
	/**
	 *	Returns the value of vskIoReqSize
	 *	@return vskIoReqSize
	 */
	public int getVskIoReqSize() throws CFException {
        if (isVskIoReqSizeModified()) { 
           vskIoReqSize = refreshVskIoReqSize();
        }
   		return vskIoReqSize;
	}
	
	/**
	 * 	Update VskIoReqSize with the passed value
	 *  Corresponding COBOL Variable is VSK-IO-REQ-SIZE
	 *	@param number
	 */
	public void setVskIoReqSize(int number) {
	     // Truncate if the number is beyond +/- Max range
	    vskIoReqSize = checkVskIoReqSizeMaxLimit(number); 
		serializeVskIoReqSize(vskIoReqSize);
	}


	public void setVskIoReqSize(long number) {
	    number = checkVskIoReqSizeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setVskIoReqSize((int)number);
	}
	
	/**
	 *	Returns the value of vskIoVarStruct
	 *	@return vskIoVarStruct
	 */
   public char[] getVskIoVarStruct() throws CFException{
     if (isVskIoVarStructModified()) { 
        vskIoVarStruct = refreshVskIoVarStruct();
     }
   		return vskIoVarStruct;
   }

  
	/**
	*  set variable vskIoVarStruct
	*  Corresponding COBOL Variable is VSK-IO-VAR-STRUCT
	*  @param value
	**/
   public void setVskIoVarStruct(char[] value) {
      vskIoVarStruct = checkVskIoVarStructConstraints(value);
      serializeVskIoVarStruct(vskIoVarStruct);
   } 

     /**
	 * 	Update VskIoVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskIoVarStruct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVskIoVarStruct,vskIoVarStruct.length);
   	
   }
   
   public void setVskIoVarStruct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVskIoVarStruct,vskIoVarStruct.length);
   	
   }
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskIoVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskIoVarStruct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VskIoVarStruct with another Field
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source) {
       replace(source,0,source.length(),beginVskIoVarStruct,VSK_IO_VAR_STRUCT_LEN);
   	
   }  
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVskIoVarStruct,VSK_IO_VAR_STRUCT_LEN);
   	
   }
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskIoVarStruct+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes VsvksdsRecordIo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setVskIoPrimaryKey(0);
         setVskIoSysid(CONSTANTS.SPACE_4);
                     setVskIoTaskNo(0);
                     setVskIoReqSize(0);
         setVskIoVarStruct(CONSTANTS.SPACE_200);
   }

		public static int getVsvksdsRecordIoFieldLength() {
			return VSVKSDS_RECORD_IO_LENGTH;
		}

}
  
