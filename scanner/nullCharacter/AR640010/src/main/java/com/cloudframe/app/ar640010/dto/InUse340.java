package com.cloudframe.app.ar640010.dto;

/**
*  The class InUse340 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InUse340 extends InUse340Serialized {
   

								private short copyAttempts340;
				private CopyIntervalGroup340 copyIntervalGroup340 = new CopyIntervalGroup340();

								private short deleteAttempts340;
				private DeleteIntervalGroup340 deleteIntervalGroup340 = new DeleteIntervalGroup340();

								private short copyAttemptsDft340;

								private long copyIntervalDft340;

								private short deleteAttemptsDft340;

								private long deleteIntervalDft340;
	
	/**
	* Constructor for InUse340
	**/
    public InUse340() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			copyIntervalGroup340.setParent(this,getStartOffset() + 2);
	       			deleteIntervalGroup340.setParent(this,getStartOffset() + 12);
	   	/*  end of offset */
								setCopyAttempts340((short)10);
								setDeleteAttempts340((short)15);
								setCopyAttemptsDft340((short)10);
								setCopyIntervalDft340(300L);
								setDeleteAttemptsDft340((short)15);
								setDeleteIntervalDft340(200L);
    }


 

	/**
	 *	Returns the value of copyAttempts340
	 *	@return copyAttempts340
	 */
	public short getCopyAttempts340() throws CFException {
        if (isCopyAttempts340Modified()) { 
           copyAttempts340 = refreshCopyAttempts340();
        }
   		return copyAttempts340;
	}
	
	/**
	 * 	Update CopyAttempts340 with the passed value
	 *  Corresponding COBOL Variable is 340-COPY-ATTEMPTS
	 *	@param number
	 */
	public void setCopyAttempts340(short number) {
	     // Truncate if the number is beyond +/- Max range
	    copyAttempts340 = checkCopyAttempts340MaxLimit(number); 
		serializeCopyAttempts340(copyAttempts340);
	}

	public void setCopyAttempts340(int number) {
	    number = checkCopyAttempts340MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCopyAttempts340((short)number);
	}
	public void setCopyAttempts340(long number) {
	    number = checkCopyAttempts340MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCopyAttempts340((short)number);
	}
	

	/**
	 *	Returns the value of copyIntervalGroup340
	 *	@return copyIntervalGroup340
	 */   
	 public CopyIntervalGroup340 getCopyIntervalGroup340() {
   	return copyIntervalGroup340;
   }
   /**
	* 	Update CopyIntervalGroup340 with the passed value
	*   Corresponding COBOL Variable is 340-COPY-INTERVAL-GROUP
	*	@param value
	*/
   public void setCopyIntervalGroup340(char[] value) {
      copyIntervalGroup340.setString(value); 
   }   
    
     /**
	 * 	Update CopyIntervalGroup340 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCopyIntervalGroup340(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,copyIntervalGroup340.begin,copyIntervalGroup340.length());
   }
   
     /**
	 * 	Update CopyIntervalGroup340 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopyIntervalGroup340(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,copyIntervalGroup340.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CopyIntervalGroup340 with another Field
	 *	@param value
	 */
   public void setCopyIntervalGroup340(Field source) {
   	replace(source,0,source.length(),copyIntervalGroup340.begin,copyIntervalGroup340.length());
   }  
   
     /**
	 * 	Update CopyIntervalGroup340 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCopyIntervalGroup340(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,copyIntervalGroup340.begin,copyIntervalGroup340.length());
   }
   
     /**
	 * 	Update CopyIntervalGroup340 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopyIntervalGroup340(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,copyIntervalGroup340.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of deleteAttempts340
	 *	@return deleteAttempts340
	 */
	public short getDeleteAttempts340() throws CFException {
        if (isDeleteAttempts340Modified()) { 
           deleteAttempts340 = refreshDeleteAttempts340();
        }
   		return deleteAttempts340;
	}
	
	/**
	 * 	Update DeleteAttempts340 with the passed value
	 *  Corresponding COBOL Variable is 340-DELETE-ATTEMPTS
	 *	@param number
	 */
	public void setDeleteAttempts340(short number) {
	     // Truncate if the number is beyond +/- Max range
	    deleteAttempts340 = checkDeleteAttempts340MaxLimit(number); 
		serializeDeleteAttempts340(deleteAttempts340);
	}

	public void setDeleteAttempts340(int number) {
	    number = checkDeleteAttempts340MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDeleteAttempts340((short)number);
	}
	public void setDeleteAttempts340(long number) {
	    number = checkDeleteAttempts340MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDeleteAttempts340((short)number);
	}
	

	/**
	 *	Returns the value of deleteIntervalGroup340
	 *	@return deleteIntervalGroup340
	 */   
	 public DeleteIntervalGroup340 getDeleteIntervalGroup340() {
   	return deleteIntervalGroup340;
   }
   /**
	* 	Update DeleteIntervalGroup340 with the passed value
	*   Corresponding COBOL Variable is 340-DELETE-INTERVAL-GROUP
	*	@param value
	*/
   public void setDeleteIntervalGroup340(char[] value) {
      deleteIntervalGroup340.setString(value); 
   }   
    
     /**
	 * 	Update DeleteIntervalGroup340 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDeleteIntervalGroup340(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,deleteIntervalGroup340.begin,deleteIntervalGroup340.length());
   }
   
     /**
	 * 	Update DeleteIntervalGroup340 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDeleteIntervalGroup340(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,deleteIntervalGroup340.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DeleteIntervalGroup340 with another Field
	 *	@param value
	 */
   public void setDeleteIntervalGroup340(Field source) {
   	replace(source,0,source.length(),deleteIntervalGroup340.begin,deleteIntervalGroup340.length());
   }  
   
     /**
	 * 	Update DeleteIntervalGroup340 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDeleteIntervalGroup340(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,deleteIntervalGroup340.begin,deleteIntervalGroup340.length());
   }
   
     /**
	 * 	Update DeleteIntervalGroup340 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDeleteIntervalGroup340(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,deleteIntervalGroup340.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of copyAttemptsDft340
	 *	@return copyAttemptsDft340
	 */
	public short getCopyAttemptsDft340() throws CFException {
        if (isCopyAttemptsDft340Modified()) { 
           copyAttemptsDft340 = refreshCopyAttemptsDft340();
        }
   		return copyAttemptsDft340;
	}
	
	/**
	 * 	Update CopyAttemptsDft340 with the passed value
	 *  Corresponding COBOL Variable is 340-COPY-ATTEMPTS-DFT
	 *	@param number
	 */
	public void setCopyAttemptsDft340(short number) {
	     // Truncate if the number is beyond +/- Max range
	    copyAttemptsDft340 = checkCopyAttemptsDft340MaxLimit(number); 
		serializeCopyAttemptsDft340(copyAttemptsDft340);
	}

	public void setCopyAttemptsDft340(int number) {
	    number = checkCopyAttemptsDft340MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCopyAttemptsDft340((short)number);
	}
	public void setCopyAttemptsDft340(long number) {
	    number = checkCopyAttemptsDft340MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCopyAttemptsDft340((short)number);
	}
	

	/**
	 *	Returns the value of copyIntervalDft340
	 *	@return copyIntervalDft340
	 */
	public long getCopyIntervalDft340() throws CFException {
       if (isCopyIntervalDft340Modified()) { 
           copyIntervalDft340 = refreshCopyIntervalDft340();
        }
   		return copyIntervalDft340;
	}
	

	
	   
	/**
	 * 	Update CopyIntervalDft340 with the passed value
	 *  Corresponding COBOL Variable is 340-COPY-INTERVAL-DFT
	 *	@param number
	 */
	public void setCopyIntervalDft340(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    copyIntervalDft340 = checkCopyIntervalDft340MaxLimit(number); 
		serializeCopyIntervalDft340(copyIntervalDft340);
	}
	

	/**
	 * 	Update CopyIntervalDft340 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCopyIntervalDft340(char[] value) throws CFException {
		 copyIntervalDft340 = serializeCopyIntervalDft340(value);
	}
	/**
	 * 	Update CopyIntervalDft340 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCopyIntervalDft340String(char[] value) throws CFException {
		 setCopyIntervalDft340(value);
	}
	/**
	 *	Returns the value of deleteAttemptsDft340
	 *	@return deleteAttemptsDft340
	 */
	public short getDeleteAttemptsDft340() throws CFException {
        if (isDeleteAttemptsDft340Modified()) { 
           deleteAttemptsDft340 = refreshDeleteAttemptsDft340();
        }
   		return deleteAttemptsDft340;
	}
	
	/**
	 * 	Update DeleteAttemptsDft340 with the passed value
	 *  Corresponding COBOL Variable is 340-DELETE-ATTEMPTS-DFT
	 *	@param number
	 */
	public void setDeleteAttemptsDft340(short number) {
	     // Truncate if the number is beyond +/- Max range
	    deleteAttemptsDft340 = checkDeleteAttemptsDft340MaxLimit(number); 
		serializeDeleteAttemptsDft340(deleteAttemptsDft340);
	}

	public void setDeleteAttemptsDft340(int number) {
	    number = checkDeleteAttemptsDft340MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDeleteAttemptsDft340((short)number);
	}
	public void setDeleteAttemptsDft340(long number) {
	    number = checkDeleteAttemptsDft340MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDeleteAttemptsDft340((short)number);
	}
	

	/**
	 *	Returns the value of deleteIntervalDft340
	 *	@return deleteIntervalDft340
	 */
	public long getDeleteIntervalDft340() throws CFException {
       if (isDeleteIntervalDft340Modified()) { 
           deleteIntervalDft340 = refreshDeleteIntervalDft340();
        }
   		return deleteIntervalDft340;
	}
	

	
	   
	/**
	 * 	Update DeleteIntervalDft340 with the passed value
	 *  Corresponding COBOL Variable is 340-DELETE-INTERVAL-DFT
	 *	@param number
	 */
	public void setDeleteIntervalDft340(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    deleteIntervalDft340 = checkDeleteIntervalDft340MaxLimit(number); 
		serializeDeleteIntervalDft340(deleteIntervalDft340);
	}
	

	/**
	 * 	Update DeleteIntervalDft340 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDeleteIntervalDft340(char[] value) throws CFException {
		 deleteIntervalDft340 = serializeDeleteIntervalDft340(value);
	}
	/**
	 * 	Update DeleteIntervalDft340 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDeleteIntervalDft340String(char[] value) throws CFException {
		 setDeleteIntervalDft340(value);
	}

	
	
	

		public static int getInUse340FieldLength() {
			return IN_USE_340_LENGTH;
		}

}
  
