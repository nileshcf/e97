package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4CpcsInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ov4CpcsInfo extends Ov4CpcsInfoSerialized { 
   

								private long ov4CycleDate;
				private Ov4CycleDateRedefined ov4CycleDateRedefined = new Ov4CycleDateRedefined();

						private char[] ov4CycleNo = Field.fillLowValue(2);

								private int ov4EntryNumber;

								private int ov4TrcrNo;

								private int ov4BlkNo;

								private long ov4SeqNo;

	
	/**
	* Constructor for Ov4CpcsInfo
	**/
    public Ov4CpcsInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ov4CpcsInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4CpcsInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ov4CycleDateRedefined.setParent(this,getStartOffset() + 0);
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 32
             ,20
             );
    } 

	/**
	 *	Returns the value of ov4CycleDate
	 *	@return ov4CycleDate
	 */
	public long getOv4CycleDate() throws CFException {
       if (isOv4CycleDateModified()) { 
           ov4CycleDate = refreshOv4CycleDate();
        }
   		return ov4CycleDate;
	}
	

	
	   
	/**
	 * 	Update Ov4CycleDate with the passed value
	 *  Corresponding COBOL Variable is OV4-CYCLE-DATE
	 *	@param number
	 */
	public void setOv4CycleDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4CycleDate = checkOv4CycleDateMaxLimit(number); 
		serializeOv4CycleDate(ov4CycleDate);
	}
	

	/**
	 * 	Update Ov4CycleDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDate(char[] value) throws CFException {
		 ov4CycleDate = serializeOv4CycleDate(value);
	}
	/**
	 * 	Update Ov4CycleDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateString(char[] value) throws CFException {
		 setOv4CycleDate(value);
	}
	/**
	 *	Returns the value of ov4CycleDateRedefined
	 *	@return ov4CycleDateRedefined
	 */   
	 public Ov4CycleDateRedefined getOv4CycleDateRedefined() {
   	return ov4CycleDateRedefined;
   }
   /**
	* 	Update Ov4CycleDateRedefined with the passed value
	*   Corresponding COBOL Variable is OV4-CYCLE-DATE-REDEFINED
	*	@param value
	*/
   public void setOv4CycleDateRedefined(char[] value) {
      ov4CycleDateRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Ov4CycleDateRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4CycleDateRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4CycleDateRedefined.begin,ov4CycleDateRedefined.length());
   }
   
     /**
	 * 	Update Ov4CycleDateRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4CycleDateRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4CycleDateRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4CycleDateRedefined with another Field
	 *	@param value
	 */
   public void setOv4CycleDateRedefined(Field source) {
   	replace(source,0,source.length(),ov4CycleDateRedefined.begin,ov4CycleDateRedefined.length());
   }  
   
     /**
	 * 	Update Ov4CycleDateRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4CycleDateRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4CycleDateRedefined.begin,ov4CycleDateRedefined.length());
   }
   
     /**
	 * 	Update Ov4CycleDateRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4CycleDateRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4CycleDateRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ov4CycleNo
	 *	@return ov4CycleNo
	 */
   public char[] getOv4CycleNo() throws CFException{
     if (isOv4CycleNoModified()) { 
        ov4CycleNo = refreshOv4CycleNo();
     }
   		return ov4CycleNo;
   }

  
	/**
	*  set variable ov4CycleNo
	*  Corresponding COBOL Variable is OV4-CYCLE-NO
	*  @param value
	**/
   public void setOv4CycleNo(char[] value) {
      ov4CycleNo = checkOv4CycleNoConstraints(value);
      serializeOv4CycleNo(ov4CycleNo);
   } 

     /**
	 * 	Update Ov4CycleNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4CycleNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4CycleNo,ov4CycleNo.length);
   	
   }
   
   public void setOv4CycleNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4CycleNo,ov4CycleNo.length);
   	
   }
   
     /**
	 * 	Update Ov4CycleNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4CycleNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4CycleNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4CycleNo with another Field
	 *	@param value
	 */
   public void setOv4CycleNo(Field source) {
       replace(source,0,source.length(),beginOv4CycleNo,OV_4_CYCLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4CycleNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4CycleNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4CycleNo,OV_4_CYCLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ov4CycleNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4CycleNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4CycleNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4EntryNumber
	 *	@return ov4EntryNumber
	 */
	public int getOv4EntryNumber() throws CFException {
       if (isOv4EntryNumberModified()) { 
           ov4EntryNumber = refreshOv4EntryNumber();
        }
   		return ov4EntryNumber;
	}
	

	
	   
	/**
	 * 	Update Ov4EntryNumber with the passed value
	 *  Corresponding COBOL Variable is OV4-ENTRY-NUMBER
	 *	@param number
	 */
	public void setOv4EntryNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4EntryNumber = checkOv4EntryNumberMaxLimit(number); 
		serializeOv4EntryNumber(ov4EntryNumber);
	}
	

	public void setOv4EntryNumber(long number) {
	    number = checkOv4EntryNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4EntryNumber((int)number);
	}
	
	/**
	 * 	Update Ov4EntryNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4EntryNumber(char[] value) throws CFException {
		 ov4EntryNumber = serializeOv4EntryNumber(value);
	}
	/**
	 * 	Update Ov4EntryNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4EntryNumberString(char[] value) throws CFException {
		 setOv4EntryNumber(value);
	}
	/**
	 *	Returns the value of ov4TrcrNo
	 *	@return ov4TrcrNo
	 */
	public int getOv4TrcrNo() throws CFException {
       if (isOv4TrcrNoModified()) { 
           ov4TrcrNo = refreshOv4TrcrNo();
        }
   		return ov4TrcrNo;
	}
	

	
	   
	/**
	 * 	Update Ov4TrcrNo with the passed value
	 *  Corresponding COBOL Variable is OV4-TRCR-NO
	 *	@param number
	 */
	public void setOv4TrcrNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4TrcrNo = checkOv4TrcrNoMaxLimit(number); 
		serializeOv4TrcrNo(ov4TrcrNo);
	}
	

	public void setOv4TrcrNo(long number) {
	    number = checkOv4TrcrNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4TrcrNo((int)number);
	}
	
	/**
	 * 	Update Ov4TrcrNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4TrcrNo(char[] value) throws CFException {
		 ov4TrcrNo = serializeOv4TrcrNo(value);
	}
	/**
	 * 	Update Ov4TrcrNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4TrcrNoString(char[] value) throws CFException {
		 setOv4TrcrNo(value);
	}
	/**
	 *	Returns the value of ov4BlkNo
	 *	@return ov4BlkNo
	 */
	public int getOv4BlkNo() throws CFException {
       if (isOv4BlkNoModified()) { 
           ov4BlkNo = refreshOv4BlkNo();
        }
   		return ov4BlkNo;
	}
	

	
	   
	/**
	 * 	Update Ov4BlkNo with the passed value
	 *  Corresponding COBOL Variable is OV4-BLK-NO
	 *	@param number
	 */
	public void setOv4BlkNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4BlkNo = checkOv4BlkNoMaxLimit(number); 
		serializeOv4BlkNo(ov4BlkNo);
	}
	

	public void setOv4BlkNo(long number) {
	    number = checkOv4BlkNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4BlkNo((int)number);
	}
	
	/**
	 * 	Update Ov4BlkNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4BlkNo(char[] value) throws CFException {
		 ov4BlkNo = serializeOv4BlkNo(value);
	}
	/**
	 * 	Update Ov4BlkNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4BlkNoString(char[] value) throws CFException {
		 setOv4BlkNo(value);
	}
	/**
	 *	Returns the value of ov4SeqNo
	 *	@return ov4SeqNo
	 */
	public long getOv4SeqNo() throws CFException {
       if (isOv4SeqNoModified()) { 
           ov4SeqNo = refreshOv4SeqNo();
        }
   		return ov4SeqNo;
	}
	

	
	   
	/**
	 * 	Update Ov4SeqNo with the passed value
	 *  Corresponding COBOL Variable is OV4-SEQ-NO
	 *	@param number
	 */
	public void setOv4SeqNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4SeqNo = checkOv4SeqNoMaxLimit(number); 
		serializeOv4SeqNo(ov4SeqNo);
	}
	

	/**
	 * 	Update Ov4SeqNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4SeqNo(char[] value) throws CFException {
		 ov4SeqNo = serializeOv4SeqNo(value);
	}
	/**
	 * 	Update Ov4SeqNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4SeqNoString(char[] value) throws CFException {
		 setOv4SeqNo(value);
	}

	
	
	

		public static int getOv4CpcsInfoFieldLength() {
			return OV_4_CPCS_INFO_LENGTH;
		}

}
  
