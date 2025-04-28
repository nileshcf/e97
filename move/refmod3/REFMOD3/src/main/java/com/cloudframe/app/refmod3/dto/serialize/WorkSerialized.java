package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOne;
            protected  int beginThree;
            protected  int beginFive;
            protected  int beginDplJulianDate;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOne = getStartOffset() + 0;	// set offset for serialization
  
             beginThree = getStartOffset() + 1;	// set offset for serialization
  
             beginFive = getStartOffset() + 2;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginDplJulianDate = getStartOffset() + 3;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localOneCounter = -1;
     public boolean isOneModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOneCounter != sharedCounter;
         localOneCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of one
	 *	@return one
	 */
	public char[]  getOneString() {
	     return getCharArray(beginOne,ONE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean oneIsNumeric() {
	    return isNumeric(beginOne
	                    ,beginOne + ONE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ONE_LEN = 1;
  	/**
	 * serializeOne
	 */
	protected void serializeOne(int one) {
		 putNumber(beginOne,one,ONE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOneCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOne
	 */
   	protected  int serializeOne(char[] value) {
	    int  one;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    one = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginOne
		       ,1
		      );
		 localOneCounter = shareString.getSerializedField().getModifiedCounter();
		return  one;
    }

   protected int checkOneMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOne is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOne() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOne
			                 ,ONE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("one", beginOne,ONE_LEN);
    }
   	}
     int localThreeCounter = -1;
     public boolean isThreeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localThreeCounter != sharedCounter;
         localThreeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of three
	 *	@return three
	 */
	public char[]  getThreeString() {
	     return getCharArray(beginThree,THREE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean threeIsNumeric() {
	    return isNumeric(beginThree
	                    ,beginThree + THREE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int THREE_LEN = 1;
  	/**
	 * serializeThree
	 */
	protected void serializeThree(int three) {
		 putNumber(beginThree,three,THREE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localThreeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeThree
	 */
   	protected  int serializeThree(char[] value) {
	    int  three;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    three = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginThree
		       ,1
		      );
		 localThreeCounter = shareString.getSerializedField().getModifiedCounter();
		return  three;
    }

   protected int checkThreeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshThree is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshThree() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginThree
			                 ,THREE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("three", beginThree,THREE_LEN);
    }
   	}
     int localFiveCounter = -1;
     public boolean isFiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiveCounter != sharedCounter;
         localFiveCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of five
	 *	@return five
	 */
	public char[]  getFiveString() {
	     return getCharArray(beginFive,FIVE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fiveIsNumeric() {
	    return isNumeric(beginFive
	                    ,beginFive + FIVE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FIVE_LEN = 1;
  	/**
	 * serializeFive
	 */
	protected void serializeFive(int five) {
		 putNumber(beginFive,five,FIVE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFiveCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFive
	 */
   	protected  int serializeFive(char[] value) {
	    int  five;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    five = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginFive
		       ,1
		      );
		 localFiveCounter = shareString.getSerializedField().getModifiedCounter();
		return  five;
    }

   protected int checkFiveMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFive() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFive
			                 ,FIVE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("five", beginFive,FIVE_LEN);
    }
   	}
         int localSLen2Counter = -1;
         public boolean isSLen2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSLen2Counter != sharedCounter;
            localSLen2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSLen2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTLen2Counter = -1;
         public boolean isTLen2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTLen2Counter != sharedCounter;
            localTLen2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTLen2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localAS22Counter = -1;
     public boolean isAS22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS22Counter != sharedCounter;
         localAS22Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS22Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS22Counter = -1;
     public boolean isBS22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS22Counter != sharedCounter;
         localBS22Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS22Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS24Counter = -1;
     public boolean isAS24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS24Counter != sharedCounter;
         localAS24Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS24Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS24Counter = -1;
     public boolean isBS24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS24Counter != sharedCounter;
         localBS24Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS24Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS28Counter = -1;
     public boolean isAS28Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS28Counter != sharedCounter;
         localAS28Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS28Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS28Counter = -1;
     public boolean isBS28Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS28Counter != sharedCounter;
         localBS28Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS28Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS212Counter = -1;
     public boolean isAS212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS212Counter != sharedCounter;
         localAS212Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS212Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS212Counter = -1;
     public boolean isBS212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS212Counter != sharedCounter;
         localBS212Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS212Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS218Counter = -1;
     public boolean isAS218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS218Counter != sharedCounter;
         localAS218Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS218Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS218Counter = -1;
     public boolean isBS218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS218Counter != sharedCounter;
         localBS218Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS218Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS220Counter = -1;
     public boolean isAS220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS220Counter != sharedCounter;
         localAS220Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS220Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS220Counter = -1;
     public boolean isBS220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS220Counter != sharedCounter;
         localBS220Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS220Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localWse22aSCounter = -1;
     public boolean isWse22aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse22aSCounter != sharedCounter;
         localWse22aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse22aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse22bSCounter = -1;
     public boolean isWse22bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse22bSCounter != sharedCounter;
         localWse22bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse22bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse24aSCounter = -1;
     public boolean isWse24aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse24aSCounter != sharedCounter;
         localWse24aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse24aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse24bSCounter = -1;
     public boolean isWse24bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse24bSCounter != sharedCounter;
         localWse24bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse24bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse28aSCounter = -1;
     public boolean isWse28aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse28aSCounter != sharedCounter;
         localWse28aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse28aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse28bSCounter = -1;
     public boolean isWse28bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse28bSCounter != sharedCounter;
         localWse28bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse28bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse212aSCounter = -1;
     public boolean isWse212aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse212aSCounter != sharedCounter;
         localWse212aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse212aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse212bSCounter = -1;
     public boolean isWse212bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse212bSCounter != sharedCounter;
         localWse212bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse212bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse218aSCounter = -1;
     public boolean isWse218aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse218aSCounter != sharedCounter;
         localWse218aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse218aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse218bSCounter = -1;
     public boolean isWse218bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse218bSCounter != sharedCounter;
         localWse218bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse218bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse220aSCounter = -1;
     public boolean isWse220aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220aSCounter != sharedCounter;
         localWse220aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse220aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse220bSCounter = -1;
     public boolean isWse220bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220bSCounter != sharedCounter;
         localWse220bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse220bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse220cTCounter = -1;
     public boolean isWse220cTModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220cTCounter != sharedCounter;
         localWse220cTCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse220cTConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localDplJulianDateCounter = -1;
     public boolean isDplJulianDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDplJulianDateCounter != sharedCounter;
         localDplJulianDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dplJulianDate
	 *	@return dplJulianDate
	 */
	public char[]  getDplJulianDateString() {
	     return getCharArray(beginDplJulianDate,DPL_JULIAN_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dplJulianDateIsNumeric() {
	    return isNumeric(beginDplJulianDate
	                    ,beginDplJulianDate + DPL_JULIAN_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DPL_JULIAN_DATE_LEN = 5;
  	/**
	 * serializeDplJulianDate
	 */
	protected void serializeDplJulianDate(long dplJulianDate) {
		 putNumber(beginDplJulianDate,dplJulianDate,DPL_JULIAN_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDplJulianDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDplJulianDate
	 */
   	protected  long serializeDplJulianDate(char[] value) {
	    long  dplJulianDate;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dplJulianDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginDplJulianDate
		       ,5
		      );
		 localDplJulianDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  dplJulianDate;
    }

   protected long checkDplJulianDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDplJulianDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDplJulianDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDplJulianDate
			                 ,DPL_JULIAN_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dplJulianDate", beginDplJulianDate,DPL_JULIAN_DATE_LEN);
    }
   	}
     int localVar1Counter = -1;
     public boolean isVar1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVar1Counter != sharedCounter;
         localVar1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVar1Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }




}
  
