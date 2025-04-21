package com.cloudframe.app.vsammon4.file.records;

/**
*  The class VsvksdsRecordO is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:57. using version 5.0.0.256
**/


import com.cloudframe.app.vsammon4.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class VsvksdsRecordO extends VsvksdsRecordOSerialized {
   

								private long vskOPrimaryKey;

						private char[] vskOSysid = Field.fillLowValue(4);

								private int vskOTaskNo;

								private int vskOReqSize;

						private char[] vskOVarStruct = Field.fillLowValue(200);
	
	/**
	* Constructor for VsvksdsRecordO
	**/
    public VsvksdsRecordO() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of vskOPrimaryKey
	 *	@return vskOPrimaryKey
	 */
	public long getVskOPrimaryKey() throws CFException {
       if (isVskOPrimaryKeyModified()) { 
           vskOPrimaryKey = refreshVskOPrimaryKey();
        }
   		return vskOPrimaryKey;
	}
	

	
	   
	/**
	 * 	Update VskOPrimaryKey with the passed value
	 *  Corresponding COBOL Variable is VSK-O-PRIMARY-KEY
	 *	@param number
	 */
	public void setVskOPrimaryKey(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    vskOPrimaryKey = checkVskOPrimaryKeyMaxLimit(number); 
		serializeVskOPrimaryKey(vskOPrimaryKey);
	}
	

	/**
	 * 	Update VskOPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskOPrimaryKey(char[] value) throws CFException {
		 vskOPrimaryKey = serializeVskOPrimaryKey(value);
	}
	/**
	 * 	Update VskOPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskOPrimaryKeyString(char[] value) throws CFException {
		 setVskOPrimaryKey(value);
	}
	/**
	 *	Returns the value of vskOSysid
	 *	@return vskOSysid
	 */
   public char[] getVskOSysid() throws CFException{
     if (isVskOSysidModified()) { 
        vskOSysid = refreshVskOSysid();
     }
   		return vskOSysid;
   }

  
	/**
	*  set variable vskOSysid
	*  Corresponding COBOL Variable is VSK-O-SYSID
	*  @param value
	**/
   public void setVskOSysid(char[] value) {
      vskOSysid = checkVskOSysidConstraints(value);
      serializeVskOSysid(vskOSysid);
   } 

     /**
	 * 	Update VskOSysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskOSysid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVskOSysid,vskOSysid.length);
   	
   }
   
   public void setVskOSysid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVskOSysid,vskOSysid.length);
   	
   }
   
     /**
	 * 	Update VskOSysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskOSysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskOSysid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VskOSysid with another Field
	 *	@param value
	 */
   public void setVskOSysid(Field source) {
       replace(source,0,source.length(),beginVskOSysid,VSK_OSYSID_LEN);
   	
   }  
   
     /**
	 * 	Update VskOSysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskOSysid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVskOSysid,VSK_OSYSID_LEN);
   	
   }
   
     /**
	 * 	Update VskOSysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskOSysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskOSysid+targetIndex,targetLen);
    
   }
	public int getVskOTaskNo() throws CFException {
        if (isVskOTaskNoModified()) { 
           vskOTaskNo = refreshVskOTaskNo();
        }
   		return vskOTaskNo;
	}
	
	/**
	 * 	Update VskOTaskNo with the passed value
	 *  Corresponding COBOL Variable is VSK-O-TASK-NO
	 *	@param number
	 */
	public void setVskOTaskNo(int number) {
			vskOTaskNo = checkVskOTaskNoMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeVskOTaskNo(vskOTaskNo);
	}


	public void setVskOTaskNo(long number) {
	    number = checkVskOTaskNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setVskOTaskNo((int)number);
	}
	
	/**
	 *	Returns the value of vskOReqSize
	 *	@return vskOReqSize
	 */
	public int getVskOReqSize() throws CFException {
        if (isVskOReqSizeModified()) { 
           vskOReqSize = refreshVskOReqSize();
        }
   		return vskOReqSize;
	}
	
	/**
	 * 	Update VskOReqSize with the passed value
	 *  Corresponding COBOL Variable is VSK-O-REQ-SIZE
	 *	@param number
	 */
	public void setVskOReqSize(int number) {
	     // Truncate if the number is beyond +/- Max range
	    vskOReqSize = checkVskOReqSizeMaxLimit(number); 
		serializeVskOReqSize(vskOReqSize);
	}


	public void setVskOReqSize(long number) {
	    number = checkVskOReqSizeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setVskOReqSize((int)number);
	}
	
	/**
	 *	Returns the value of vskOVarStruct
	 *	@return vskOVarStruct
	 */
   public char[] getVskOVarStruct() throws CFException{
     if (isVskOVarStructModified()) { 
        vskOVarStruct = refreshVskOVarStruct();
     }
   		return vskOVarStruct;
   }

  
	/**
	*  set variable vskOVarStruct
	*  Corresponding COBOL Variable is VSK-O-VAR-STRUCT
	*  @param value
	**/
   public void setVskOVarStruct(char[] value) {
      vskOVarStruct = checkVskOVarStructConstraints(value);
      serializeVskOVarStruct(vskOVarStruct);
   } 

     /**
	 * 	Update VskOVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskOVarStruct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVskOVarStruct,vskOVarStruct.length);
   	
   }
   
   public void setVskOVarStruct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVskOVarStruct,vskOVarStruct.length);
   	
   }
   
     /**
	 * 	Update VskOVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskOVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskOVarStruct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VskOVarStruct with another Field
	 *	@param value
	 */
   public void setVskOVarStruct(Field source) {
       replace(source,0,source.length(),beginVskOVarStruct,VSK_OVAR_STRUCT_LEN);
   	
   }  
   
     /**
	 * 	Update VskOVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskOVarStruct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVskOVarStruct,VSK_OVAR_STRUCT_LEN);
   	
   }
   
     /**
	 * 	Update VskOVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskOVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVskOVarStruct+targetIndex,targetLen);
    
   }

	
	
	

		public static int getVsvksdsRecordOFieldLength() {
			return VSVKSDS_RECORD_O_LENGTH;
		}

}
  
