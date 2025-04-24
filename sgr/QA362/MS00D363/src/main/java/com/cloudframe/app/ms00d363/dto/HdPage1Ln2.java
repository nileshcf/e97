package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln2 extends HdPage1Ln2Serialized { 
   

						private char[] hd12Cc = new char[1];


						private char[] hd12MceMsg = new char[3];

						private char[] hd12DailyMon = new char[11];




						private char[] hd13CntryName = new char[9];

						private char[] hd13Country = new char[3];


						private char[] hd1DateMsg = new char[10];

								private int hd12Mm;


								private int hd12Dd;


								private int hd12Yy;

	
	/**
	* Constructor for HdPage1Ln2
	**/
    public HdPage1Ln2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd12Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(49)
             , getStartOffset() + 1
             ,49
             );
								setHd12MceMsg(fillSpace(3));
								setHd12DailyMon(("      DAILY").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 64
             ,1
             );
       replaceValue( // serialize and save the value
             ("CONTROL REPORT").toCharArray()
             , getStartOffset() + 65
             ,14
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 79
             ,6
             );
								setHd13CntryName(("COUNTRY: ").toCharArray());
								setHd13Country(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 97
             ,17
             );
								setHd1DateMsg((" WORK OF: ").toCharArray());
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 126
             ,1
             );
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 129
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 132
             ,1
             );
    }


 

	/**
	 *	Returns the value of hd12Cc
	 *	@return hd12Cc
	 */
   public char[] getHd12Cc() throws CFException{
     if (isHd12CcModified()) { 
        hd12Cc = refreshHd12Cc();
     }
   		return hd12Cc;
   }

  
	/**
	*  set variable hd12Cc
	*  Corresponding COBOL Variable is HD1-2-CC
	*  @param value
	**/
   public void setHd12Cc(char[] value) {
      hd12Cc = checkHd12CcConstraints(value);
      serializeHd12Cc(hd12Cc);
   } 

     /**
	 * 	Update Hd12Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd12Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd12Cc,hd12Cc.length);
   	
   }
   
   public void setHd12Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd12Cc,hd12Cc.length);
   	
   }
   
     /**
	 * 	Update Hd12Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd12Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd12Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd12Cc with another Field
	 *	@param value
	 */
   public void setHd12Cc(Field source) {
       replace(source,0,source.length(),beginHd12Cc,HD_12_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd12Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd12Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd12Cc,HD_12_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd12Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd12Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd12Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd12MceMsg
	 *	@return hd12MceMsg
	 */
   public char[] getHd12MceMsg() throws CFException{
     if (isHd12MceMsgModified()) { 
        hd12MceMsg = refreshHd12MceMsg();
     }
   		return hd12MceMsg;
   }

  
	/**
	*  set variable hd12MceMsg
	*  Corresponding COBOL Variable is HD1-2-MCE-MSG
	*  @param value
	**/
   public void setHd12MceMsg(char[] value) {
      hd12MceMsg = checkHd12MceMsgConstraints(value);
      serializeHd12MceMsg(hd12MceMsg);
   } 

     /**
	 * 	Update Hd12MceMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd12MceMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd12MceMsg,hd12MceMsg.length);
   	
   }
   
   public void setHd12MceMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd12MceMsg,hd12MceMsg.length);
   	
   }
   
     /**
	 * 	Update Hd12MceMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd12MceMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd12MceMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd12MceMsg with another Field
	 *	@param value
	 */
   public void setHd12MceMsg(Field source) {
       replace(source,0,source.length(),beginHd12MceMsg,HD_12_MCE_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update Hd12MceMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd12MceMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd12MceMsg,HD_12_MCE_MSG_LEN);
   	
   }
   
     /**
	 * 	Update Hd12MceMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd12MceMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd12MceMsg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd12DailyMon
	 *	@return hd12DailyMon
	 */
   public char[] getHd12DailyMon() throws CFException{
     if (isHd12DailyMonModified()) { 
        hd12DailyMon = refreshHd12DailyMon();
     }
   		return hd12DailyMon;
   }

  
	/**
	*  set variable hd12DailyMon
	*  Corresponding COBOL Variable is HD1-2-DAILY-MON
	*  @param value
	**/
   public void setHd12DailyMon(char[] value) {
      hd12DailyMon = checkHd12DailyMonConstraints(value);
      serializeHd12DailyMon(hd12DailyMon);
   } 

     /**
	 * 	Update Hd12DailyMon 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd12DailyMon(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd12DailyMon,hd12DailyMon.length);
   	
   }
   
   public void setHd12DailyMon(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd12DailyMon,hd12DailyMon.length);
   	
   }
   
     /**
	 * 	Update Hd12DailyMon 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd12DailyMon(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd12DailyMon+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd12DailyMon with another Field
	 *	@param value
	 */
   public void setHd12DailyMon(Field source) {
       replace(source,0,source.length(),beginHd12DailyMon,HD_12_DAILY_MON_LEN);
   	
   }  
   
     /**
	 * 	Update Hd12DailyMon 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd12DailyMon(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd12DailyMon,HD_12_DAILY_MON_LEN);
   	
   }
   
     /**
	 * 	Update Hd12DailyMon 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd12DailyMon(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd12DailyMon+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd13CntryName
	 *	@return hd13CntryName
	 */
   public char[] getHd13CntryName() throws CFException{
     if (isHd13CntryNameModified()) { 
        hd13CntryName = refreshHd13CntryName();
     }
   		return hd13CntryName;
   }

  
	/**
	*  set variable hd13CntryName
	*  Corresponding COBOL Variable is HD1-3-CNTRY-NAME
	*  @param value
	**/
   public void setHd13CntryName(char[] value) {
      hd13CntryName = checkHd13CntryNameConstraints(value);
      serializeHd13CntryName(hd13CntryName);
   } 

     /**
	 * 	Update Hd13CntryName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd13CntryName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd13CntryName,hd13CntryName.length);
   	
   }
   
   public void setHd13CntryName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd13CntryName,hd13CntryName.length);
   	
   }
   
     /**
	 * 	Update Hd13CntryName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd13CntryName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13CntryName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd13CntryName with another Field
	 *	@param value
	 */
   public void setHd13CntryName(Field source) {
       replace(source,0,source.length(),beginHd13CntryName,HD_13_CNTRY_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Hd13CntryName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd13CntryName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd13CntryName,HD_13_CNTRY_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Hd13CntryName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd13CntryName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13CntryName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd13Country
	 *	@return hd13Country
	 */
   public char[] getHd13Country() throws CFException{
     if (isHd13CountryModified()) { 
        hd13Country = refreshHd13Country();
     }
   		return hd13Country;
   }

  
	/**
	*  set variable hd13Country
	*  Corresponding COBOL Variable is HD1-3-COUNTRY
	*  @param value
	**/
   public void setHd13Country(char[] value) {
      hd13Country = checkHd13CountryConstraints(value);
      serializeHd13Country(hd13Country);
   } 

     /**
	 * 	Update Hd13Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd13Country(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd13Country,hd13Country.length);
   	
   }
   
   public void setHd13Country(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Country,hd13Country.length);
   	
   }
   
     /**
	 * 	Update Hd13Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd13Country(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Country+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd13Country with another Field
	 *	@param value
	 */
   public void setHd13Country(Field source) {
       replace(source,0,source.length(),beginHd13Country,HD_13_COUNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Hd13Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd13Country(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd13Country,HD_13_COUNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Hd13Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd13Country(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd13Country+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd1DateMsg
	 *	@return hd1DateMsg
	 */
   public char[] getHd1DateMsg() throws CFException{
     if (isHd1DateMsgModified()) { 
        hd1DateMsg = refreshHd1DateMsg();
     }
   		return hd1DateMsg;
   }

  
	/**
	*  set variable hd1DateMsg
	*  Corresponding COBOL Variable is HD1-DATE-MSG
	*  @param value
	**/
   public void setHd1DateMsg(char[] value) {
      hd1DateMsg = checkHd1DateMsgConstraints(value);
      serializeHd1DateMsg(hd1DateMsg);
   } 

     /**
	 * 	Update Hd1DateMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd1DateMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd1DateMsg,hd1DateMsg.length);
   	
   }
   
   public void setHd1DateMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd1DateMsg,hd1DateMsg.length);
   	
   }
   
     /**
	 * 	Update Hd1DateMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd1DateMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd1DateMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd1DateMsg with another Field
	 *	@param value
	 */
   public void setHd1DateMsg(Field source) {
       replace(source,0,source.length(),beginHd1DateMsg,HD_1_DATE_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update Hd1DateMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd1DateMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd1DateMsg,HD_1_DATE_MSG_LEN);
   	
   }
   
     /**
	 * 	Update Hd1DateMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd1DateMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd1DateMsg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd12Mm
	 *	@return hd12Mm
	 */
	public int getHd12Mm() throws CFException {
       if (isHd12MmModified()) { 
           hd12Mm = refreshHd12Mm();
        }
   		return hd12Mm;
	}
	

	
	   
	/**
	 * 	Update Hd12Mm with the passed value
	 *  Corresponding COBOL Variable is HD1-2-MM
	 *	@param number
	 */
	public void setHd12Mm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    hd12Mm = checkHd12MmMaxLimit(number); 
		serializeHd12Mm(hd12Mm);
	}
	

	public void setHd12Mm(long number) {
	    number = checkHd12MmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setHd12Mm((int)number);
	}
	
	/**
	 * 	Update Hd12Mm with the passed value
	 *	@param value (String or char[])
	 */
	public void setHd12Mm(char[] value) throws CFException {
		 hd12Mm = serializeHd12Mm(value);
	}
	/**
	 * 	Update Hd12Mm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHd12MmString(char[] value) throws CFException {
		 setHd12Mm(value);
	}
	/**
	 *	Returns the value of hd12Dd
	 *	@return hd12Dd
	 */
	public int getHd12Dd() throws CFException {
       if (isHd12DdModified()) { 
           hd12Dd = refreshHd12Dd();
        }
   		return hd12Dd;
	}
	

	
	   
	/**
	 * 	Update Hd12Dd with the passed value
	 *  Corresponding COBOL Variable is HD1-2-DD
	 *	@param number
	 */
	public void setHd12Dd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    hd12Dd = checkHd12DdMaxLimit(number); 
		serializeHd12Dd(hd12Dd);
	}
	

	public void setHd12Dd(long number) {
	    number = checkHd12DdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setHd12Dd((int)number);
	}
	
	/**
	 * 	Update Hd12Dd with the passed value
	 *	@param value (String or char[])
	 */
	public void setHd12Dd(char[] value) throws CFException {
		 hd12Dd = serializeHd12Dd(value);
	}
	/**
	 * 	Update Hd12Dd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHd12DdString(char[] value) throws CFException {
		 setHd12Dd(value);
	}
	/**
	 *	Returns the value of hd12Yy
	 *	@return hd12Yy
	 */
	public int getHd12Yy() throws CFException {
       if (isHd12YyModified()) { 
           hd12Yy = refreshHd12Yy();
        }
   		return hd12Yy;
	}
	

	
	   
	/**
	 * 	Update Hd12Yy with the passed value
	 *  Corresponding COBOL Variable is HD1-2-YY
	 *	@param number
	 */
	public void setHd12Yy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    hd12Yy = checkHd12YyMaxLimit(number); 
		serializeHd12Yy(hd12Yy);
	}
	

	public void setHd12Yy(long number) {
	    number = checkHd12YyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setHd12Yy((int)number);
	}
	
	/**
	 * 	Update Hd12Yy with the passed value
	 *	@param value (String or char[])
	 */
	public void setHd12Yy(char[] value) throws CFException {
		 hd12Yy = serializeHd12Yy(value);
	}
	/**
	 * 	Update Hd12Yy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHd12YyString(char[] value) throws CFException {
		 setHd12Yy(value);
	}

	
	
	

		public static int getHdPage1Ln2FieldLength() {
			return HD_PAGE_1_LN_2_LENGTH;
		}

}
  
