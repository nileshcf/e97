package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4ParameterList is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ov4ParameterList extends Ov4ParameterListSerialized {
   

								private int ov4BankNo;

								private int ov4DeptNo;
				private Ov4ItemNo ov4ItemNo = new Ov4ItemNo();
				private Ov4V4BaseInfo ov4V4BaseInfo = new Ov4V4BaseInfo();
				private Ov4CpcsInfo ov4CpcsInfo = new Ov4CpcsInfo();
				private Ov4MicrLineInfo ov4MicrLineInfo = new Ov4MicrLineInfo();
				private Ov4AdjustmentAmount ov4AdjustmentAmount = new Ov4AdjustmentAmount();
				private Ov4IncomingCashLetterInfo ov4IncomingCashLetterInfo = new Ov4IncomingCashLetterInfo();
				private Ov4MiscData1 ov4MiscData1 = new Ov4MiscData1();
				private Ov4MiscData2 ov4MiscData2 = new Ov4MiscData2();
	
	/**
	* Constructor for Ov4ParameterList
	**/
    public Ov4ParameterList() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ov4ItemNo.setParent(this,getStartOffset() + 5);
	       			ov4V4BaseInfo.setParent(this,getStartOffset() + 15);
	       			ov4CpcsInfo.setParent(this,getStartOffset() + 73);
	       			ov4MicrLineInfo.setParent(this,getStartOffset() + 125);
	       			ov4AdjustmentAmount.setParent(this,getStartOffset() + 192);
	       			ov4IncomingCashLetterInfo.setParent(this,getStartOffset() + 211);
	       			ov4MiscData1.setParent(this,getStartOffset() + 375);
	       			ov4MiscData2.setParent(this,getStartOffset() + 425);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ov4BankNo
	 *	@return ov4BankNo
	 */
	public int getOv4BankNo() throws CFException {
       if (isOv4BankNoModified()) { 
           ov4BankNo = refreshOv4BankNo();
        }
   		return ov4BankNo;
	}
	

	
	   
	/**
	 * 	Update Ov4BankNo with the passed value
	 *  Corresponding COBOL Variable is OV4-BANK-NO
	 *	@param number
	 */
	public void setOv4BankNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4BankNo = checkOv4BankNoMaxLimit(number); 
		serializeOv4BankNo(ov4BankNo);
	}
	

	public void setOv4BankNo(long number) {
	    number = checkOv4BankNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4BankNo((int)number);
	}
	
	/**
	 * 	Update Ov4BankNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4BankNo(char[] value) throws CFException {
		 ov4BankNo = serializeOv4BankNo(value);
	}
	/**
	 * 	Update Ov4BankNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4BankNoString(char[] value) throws CFException {
		 setOv4BankNo(value);
	}
	/**
	 *	Returns the value of ov4DeptNo
	 *	@return ov4DeptNo
	 */
	public int getOv4DeptNo() throws CFException {
       if (isOv4DeptNoModified()) { 
           ov4DeptNo = refreshOv4DeptNo();
        }
   		return ov4DeptNo;
	}
	

	
	   
	/**
	 * 	Update Ov4DeptNo with the passed value
	 *  Corresponding COBOL Variable is OV4-DEPT-NO
	 *	@param number
	 */
	public void setOv4DeptNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4DeptNo = checkOv4DeptNoMaxLimit(number); 
		serializeOv4DeptNo(ov4DeptNo);
	}
	

	public void setOv4DeptNo(long number) {
	    number = checkOv4DeptNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4DeptNo((int)number);
	}
	
	/**
	 * 	Update Ov4DeptNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4DeptNo(char[] value) throws CFException {
		 ov4DeptNo = serializeOv4DeptNo(value);
	}
	/**
	 * 	Update Ov4DeptNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4DeptNoString(char[] value) throws CFException {
		 setOv4DeptNo(value);
	}
	/**
	 *	Returns the value of ov4ItemNo
	 *	@return ov4ItemNo
	 */   
	 public Ov4ItemNo getOv4ItemNo() {
   	return ov4ItemNo;
   }
   /**
	* 	Update Ov4ItemNo with the passed value
	*   Corresponding COBOL Variable is OV4-ITEM-NO
	*	@param value
	*/
   public void setOv4ItemNo(char[] value) {
      ov4ItemNo.setString(value); 
   }   
    
     /**
	 * 	Update Ov4ItemNo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4ItemNo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4ItemNo.begin,ov4ItemNo.length());
   }
   
     /**
	 * 	Update Ov4ItemNo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4ItemNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4ItemNo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4ItemNo with another Field
	 *	@param value
	 */
   public void setOv4ItemNo(Field source) {
   	replace(source,0,source.length(),ov4ItemNo.begin,ov4ItemNo.length());
   }  
   
     /**
	 * 	Update Ov4ItemNo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4ItemNo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4ItemNo.begin,ov4ItemNo.length());
   }
   
     /**
	 * 	Update Ov4ItemNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4ItemNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4ItemNo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ov4V4BaseInfo
	 *	@return ov4V4BaseInfo
	 */   
	 public Ov4V4BaseInfo getOv4V4BaseInfo() {
   	return ov4V4BaseInfo;
   }
   /**
	* 	Update Ov4V4BaseInfo with the passed value
	*   Corresponding COBOL Variable is OV4-V4-BASE-INFO
	*	@param value
	*/
   public void setOv4V4BaseInfo(char[] value) {
      ov4V4BaseInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ov4V4BaseInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4V4BaseInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4V4BaseInfo.begin,ov4V4BaseInfo.length());
   }
   
     /**
	 * 	Update Ov4V4BaseInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4V4BaseInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4V4BaseInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4V4BaseInfo with another Field
	 *	@param value
	 */
   public void setOv4V4BaseInfo(Field source) {
   	replace(source,0,source.length(),ov4V4BaseInfo.begin,ov4V4BaseInfo.length());
   }  
   
     /**
	 * 	Update Ov4V4BaseInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4V4BaseInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4V4BaseInfo.begin,ov4V4BaseInfo.length());
   }
   
     /**
	 * 	Update Ov4V4BaseInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4V4BaseInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4V4BaseInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ov4CpcsInfo
	 *	@return ov4CpcsInfo
	 */   
	 public Ov4CpcsInfo getOv4CpcsInfo() {
   	return ov4CpcsInfo;
   }
   /**
	* 	Update Ov4CpcsInfo with the passed value
	*   Corresponding COBOL Variable is OV4-CPCS-INFO
	*	@param value
	*/
   public void setOv4CpcsInfo(char[] value) {
      ov4CpcsInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ov4CpcsInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4CpcsInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4CpcsInfo.begin,ov4CpcsInfo.length());
   }
   
     /**
	 * 	Update Ov4CpcsInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4CpcsInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4CpcsInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4CpcsInfo with another Field
	 *	@param value
	 */
   public void setOv4CpcsInfo(Field source) {
   	replace(source,0,source.length(),ov4CpcsInfo.begin,ov4CpcsInfo.length());
   }  
   
     /**
	 * 	Update Ov4CpcsInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4CpcsInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4CpcsInfo.begin,ov4CpcsInfo.length());
   }
   
     /**
	 * 	Update Ov4CpcsInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4CpcsInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4CpcsInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ov4MicrLineInfo
	 *	@return ov4MicrLineInfo
	 */   
	 public Ov4MicrLineInfo getOv4MicrLineInfo() {
   	return ov4MicrLineInfo;
   }
   /**
	* 	Update Ov4MicrLineInfo with the passed value
	*   Corresponding COBOL Variable is OV4-MICR-LINE-INFO
	*	@param value
	*/
   public void setOv4MicrLineInfo(char[] value) {
      ov4MicrLineInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ov4MicrLineInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4MicrLineInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4MicrLineInfo.begin,ov4MicrLineInfo.length());
   }
   
     /**
	 * 	Update Ov4MicrLineInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4MicrLineInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4MicrLineInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4MicrLineInfo with another Field
	 *	@param value
	 */
   public void setOv4MicrLineInfo(Field source) {
   	replace(source,0,source.length(),ov4MicrLineInfo.begin,ov4MicrLineInfo.length());
   }  
   
     /**
	 * 	Update Ov4MicrLineInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4MicrLineInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4MicrLineInfo.begin,ov4MicrLineInfo.length());
   }
   
     /**
	 * 	Update Ov4MicrLineInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4MicrLineInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4MicrLineInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ov4AdjustmentAmount
	 *	@return ov4AdjustmentAmount
	 */   
	 public Ov4AdjustmentAmount getOv4AdjustmentAmount() {
   	return ov4AdjustmentAmount;
   }
   /**
	* 	Update Ov4AdjustmentAmount with the passed value
	*   Corresponding COBOL Variable is OV4-ADJUSTMENT-AMOUNT
	*	@param value
	*/
   public void setOv4AdjustmentAmount(char[] value) {
      ov4AdjustmentAmount.setString(value); 
   }   
    
     /**
	 * 	Update Ov4AdjustmentAmount 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4AdjustmentAmount(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4AdjustmentAmount.begin,ov4AdjustmentAmount.length());
   }
   
     /**
	 * 	Update Ov4AdjustmentAmount 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4AdjustmentAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4AdjustmentAmount.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4AdjustmentAmount with another Field
	 *	@param value
	 */
   public void setOv4AdjustmentAmount(Field source) {
   	replace(source,0,source.length(),ov4AdjustmentAmount.begin,ov4AdjustmentAmount.length());
   }  
   
     /**
	 * 	Update Ov4AdjustmentAmount 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4AdjustmentAmount(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4AdjustmentAmount.begin,ov4AdjustmentAmount.length());
   }
   
     /**
	 * 	Update Ov4AdjustmentAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4AdjustmentAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4AdjustmentAmount.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ov4IncomingCashLetterInfo
	 *	@return ov4IncomingCashLetterInfo
	 */   
	 public Ov4IncomingCashLetterInfo getOv4IncomingCashLetterInfo() {
   	return ov4IncomingCashLetterInfo;
   }
   /**
	* 	Update Ov4IncomingCashLetterInfo with the passed value
	*   Corresponding COBOL Variable is OV4-INCOMING-CASH-LETTER-INFO
	*	@param value
	*/
   public void setOv4IncomingCashLetterInfo(char[] value) {
      ov4IncomingCashLetterInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ov4IncomingCashLetterInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4IncomingCashLetterInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4IncomingCashLetterInfo.begin,ov4IncomingCashLetterInfo.length());
   }
   
     /**
	 * 	Update Ov4IncomingCashLetterInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4IncomingCashLetterInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4IncomingCashLetterInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4IncomingCashLetterInfo with another Field
	 *	@param value
	 */
   public void setOv4IncomingCashLetterInfo(Field source) {
   	replace(source,0,source.length(),ov4IncomingCashLetterInfo.begin,ov4IncomingCashLetterInfo.length());
   }  
   
     /**
	 * 	Update Ov4IncomingCashLetterInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4IncomingCashLetterInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4IncomingCashLetterInfo.begin,ov4IncomingCashLetterInfo.length());
   }
   
     /**
	 * 	Update Ov4IncomingCashLetterInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4IncomingCashLetterInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4IncomingCashLetterInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ov4MiscData1
	 *	@return ov4MiscData1
	 */   
	 public Ov4MiscData1 getOv4MiscData1() {
   	return ov4MiscData1;
   }
   /**
	* 	Update Ov4MiscData1 with the passed value
	*   Corresponding COBOL Variable is OV4-MISC-DATA1
	*	@param value
	*/
   public void setOv4MiscData1(char[] value) {
      ov4MiscData1.setString(value); 
   }   
    
     /**
	 * 	Update Ov4MiscData1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4MiscData1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4MiscData1.begin,ov4MiscData1.length());
   }
   
     /**
	 * 	Update Ov4MiscData1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4MiscData1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4MiscData1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4MiscData1 with another Field
	 *	@param value
	 */
   public void setOv4MiscData1(Field source) {
   	replace(source,0,source.length(),ov4MiscData1.begin,ov4MiscData1.length());
   }  
   
     /**
	 * 	Update Ov4MiscData1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4MiscData1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4MiscData1.begin,ov4MiscData1.length());
   }
   
     /**
	 * 	Update Ov4MiscData1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4MiscData1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4MiscData1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ov4MiscData2
	 *	@return ov4MiscData2
	 */   
	 public Ov4MiscData2 getOv4MiscData2() {
   	return ov4MiscData2;
   }
   /**
	* 	Update Ov4MiscData2 with the passed value
	*   Corresponding COBOL Variable is OV4-MISC-DATA2
	*	@param value
	*/
   public void setOv4MiscData2(char[] value) {
      ov4MiscData2.setString(value); 
   }   
    
     /**
	 * 	Update Ov4MiscData2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4MiscData2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4MiscData2.begin,ov4MiscData2.length());
   }
   
     /**
	 * 	Update Ov4MiscData2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4MiscData2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4MiscData2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4MiscData2 with another Field
	 *	@param value
	 */
   public void setOv4MiscData2(Field source) {
   	replace(source,0,source.length(),ov4MiscData2.begin,ov4MiscData2.length());
   }  
   
     /**
	 * 	Update Ov4MiscData2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4MiscData2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4MiscData2.begin,ov4MiscData2.length());
   }
   
     /**
	 * 	Update Ov4MiscData2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4MiscData2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4MiscData2.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getOv4ParameterListFieldLength() {
			return OV_4_PARAMETER_LIST_LENGTH;
		}

}
  
