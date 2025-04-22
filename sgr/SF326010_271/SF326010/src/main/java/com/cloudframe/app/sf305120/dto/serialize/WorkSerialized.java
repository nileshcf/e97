package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNumber01300;
	
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
  
  
  
  
  
  
  
  
  
  
  
             beginNumber01300 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localFirstTimeFlag100Counter = -1;
     public boolean isFirstTimeFlag100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFirstTimeFlag100Counter != sharedCounter;
         localFirstTimeFlag100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFirstTimeFlag100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localZlogReleaseFlag100Counter = -1;
     public boolean isZlogReleaseFlag100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZlogReleaseFlag100Counter != sharedCounter;
         localZlogReleaseFlag100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkZlogReleaseFlag100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localOeHeaderData280Counter = -1;
     public boolean isOeHeaderData280Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOeHeaderData280Counter != sharedCounter;
         localOeHeaderData280Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOeHeaderData280Constraints(char[] value) {
   			return super.checkConstraints(value , 138 ,false, false);
   }
         int localEsV1HdrLnth300Counter = -1;
         public boolean isEsV1HdrLnth300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV1HdrLnth300Counter != sharedCounter;
            localEsV1HdrLnth300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkEsV1HdrLnth300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localEsV2HdrLnth300Counter = -1;
         public boolean isEsV2HdrLnth300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV2HdrLnth300Counter != sharedCounter;
            localEsV2HdrLnth300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkEsV2HdrLnth300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localEsV3HdrLnth300Counter = -1;
         public boolean isEsV3HdrLnth300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV3HdrLnth300Counter != sharedCounter;
            localEsV3HdrLnth300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkEsV3HdrLnth300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localOeStructLnth300Counter = -1;
         public boolean isOeStructLnth300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOeStructLnth300Counter != sharedCounter;
            localOeStructLnth300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkOeStructLnth300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localEsHdrOffset300Counter = -1;
         public boolean isEsHdrOffset300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsHdrOffset300Counter != sharedCounter;
            localEsHdrOffset300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkEsHdrOffset300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localEsV2Majic300Counter = -1;
         public boolean isEsV2Majic300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV2Majic300Counter != sharedCounter;
            localEsV2Majic300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkEsV2Majic300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localEsV3Majic300Counter = -1;
         public boolean isEsV3Majic300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV3Majic300Counter != sharedCounter;
            localEsV3Majic300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkEsV3Majic300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localProgramSf305120300Counter = -1;
     public boolean isProgramSf305120300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProgramSf305120300Counter != sharedCounter;
         localProgramSf305120300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkProgramSf305120300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localNumber01300Counter = -1;
     public boolean isNumber01300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumber01300Counter != sharedCounter;
         localNumber01300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of number01300
	 *	@return number01300
	 */
	public char[]  getNumber01300String() {
	     return getCharArray(beginNumber01300,NUMBER_01300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean number01300IsNumeric() {
	    return isNumeric(beginNumber01300
	                    ,beginNumber01300 + NUMBER_01300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUMBER_01300_LEN = 2;
  	/**
	 * serializeNumber01300
	 */
	protected void serializeNumber01300(int number01300) {
		 putNumber(beginNumber01300,number01300,NUMBER_01300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumber01300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNumber01300
	 */
   	protected  int serializeNumber01300(char[] value) {
	    int  number01300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    number01300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNumber01300
		       ,2
		      );
		 localNumber01300Counter = shareString.getSerializedField().getModifiedCounter();
		return  number01300;
    }

   protected int checkNumber01300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNumber01300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNumber01300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNumber01300
			                 ,NUMBER_01300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("number01300", beginNumber01300,NUMBER_01300_LEN);
    }
   	}
         int localBinary1300Counter = -1;
         public boolean isBinary1300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary1300Counter != sharedCounter;
            localBinary1300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary1300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary2300Counter = -1;
         public boolean isBinary2300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary2300Counter != sharedCounter;
            localBinary2300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary2300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary3300Counter = -1;
         public boolean isBinary3300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary3300Counter != sharedCounter;
            localBinary3300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary3300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary4300Counter = -1;
         public boolean isBinary4300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary4300Counter != sharedCounter;
            localBinary4300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary4300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary8300Counter = -1;
         public boolean isBinary8300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary8300Counter != sharedCounter;
            localBinary8300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary8300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary11300Counter = -1;
         public boolean isBinary11300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary11300Counter != sharedCounter;
            localBinary11300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary11300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary15300Counter = -1;
         public boolean isBinary15300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary15300Counter != sharedCounter;
            localBinary15300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary15300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary16300Counter = -1;
         public boolean isBinary16300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary16300Counter != sharedCounter;
            localBinary16300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary16300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary21300Counter = -1;
         public boolean isBinary21300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary21300Counter != sharedCounter;
            localBinary21300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary21300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary24300Counter = -1;
         public boolean isBinary24300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary24300Counter != sharedCounter;
            localBinary24300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary24300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary38300Counter = -1;
         public boolean isBinary38300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary38300Counter != sharedCounter;
            localBinary38300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary38300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary39300Counter = -1;
         public boolean isBinary39300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary39300Counter != sharedCounter;
            localBinary39300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary39300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary40300Counter = -1;
         public boolean isBinary40300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary40300Counter != sharedCounter;
            localBinary40300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary40300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary64300Counter = -1;
         public boolean isBinary64300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary64300Counter != sharedCounter;
            localBinary64300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary64300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary512300Counter = -1;
         public boolean isBinary512300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary512300Counter != sharedCounter;
            localBinary512300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary512300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError4300Counter = -1;
         public boolean isError4300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError4300Counter != sharedCounter;
            localError4300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError4300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError16300Counter = -1;
         public boolean isError16300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError16300Counter != sharedCounter;
            localError16300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError16300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError17300Counter = -1;
         public boolean isError17300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError17300Counter != sharedCounter;
            localError17300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError17300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError18300Counter = -1;
         public boolean isError18300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError18300Counter != sharedCounter;
            localError18300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError18300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError19300Counter = -1;
         public boolean isError19300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError19300Counter != sharedCounter;
            localError19300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError19300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError20300Counter = -1;
         public boolean isError20300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError20300Counter != sharedCounter;
            localError20300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError20300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError21300Counter = -1;
         public boolean isError21300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError21300Counter != sharedCounter;
            localError21300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError21300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError22300Counter = -1;
         public boolean isError22300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError22300Counter != sharedCounter;
            localError22300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError22300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError41300Counter = -1;
         public boolean isError41300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError41300Counter != sharedCounter;
            localError41300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError41300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError42300Counter = -1;
         public boolean isError42300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError42300Counter != sharedCounter;
            localError42300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError42300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError43300Counter = -1;
         public boolean isError43300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError43300Counter != sharedCounter;
            localError43300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError43300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError44300Counter = -1;
         public boolean isError44300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError44300Counter != sharedCounter;
            localError44300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError44300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError45300Counter = -1;
         public boolean isError45300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError45300Counter != sharedCounter;
            localError45300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError45300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError46300Counter = -1;
         public boolean isError46300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError46300Counter != sharedCounter;
            localError46300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError46300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localError99300Counter = -1;
         public boolean isError99300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localError99300Counter != sharedCounter;
            localError99300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkError99300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localCharZ300Counter = -1;
     public boolean isCharZ300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharZ300Counter != sharedCounter;
         localCharZ300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCharZ300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCharC300Counter = -1;
     public boolean isCharC300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharC300Counter != sharedCounter;
         localCharC300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCharC300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localBlankLine300Counter = -1;
     public boolean isBlankLine300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBlankLine300Counter != sharedCounter;
         localBlankLine300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBlankLine300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localAsciiSr300Counter = -1;
     public boolean isAsciiSr300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsciiSr300Counter != sharedCounter;
         localAsciiSr300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAsciiSr300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLiteralEs300Counter = -1;
     public boolean isLiteralEs300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLiteralEs300Counter != sharedCounter;
         localLiteralEs300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLiteralEs300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLiteralOe300Counter = -1;
     public boolean isLiteralOe300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLiteralOe300Counter != sharedCounter;
         localLiteralOe300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLiteralOe300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLiteralSv300Counter = -1;
     public boolean isLiteralSv300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLiteralSv300Counter != sharedCounter;
         localLiteralSv300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLiteralSv300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLiteralPl300Counter = -1;
     public boolean isLiteralPl300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLiteralPl300Counter != sharedCounter;
         localLiteralPl300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLiteralPl300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLiteralRe300Counter = -1;
     public boolean isLiteralRe300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLiteralRe300Counter != sharedCounter;
         localLiteralRe300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLiteralRe300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLiteralRo300Counter = -1;
     public boolean isLiteralRo300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLiteralRo300Counter != sharedCounter;
         localLiteralRo300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLiteralRo300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLiteralIn300Counter = -1;
     public boolean isLiteralIn300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLiteralIn300Counter != sharedCounter;
         localLiteralIn300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLiteralIn300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLiteralEd300Counter = -1;
     public boolean isLiteralEd300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLiteralEd300Counter != sharedCounter;
         localLiteralEd300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLiteralEd300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
         int localCurrOffset420Counter = -1;
         public boolean isCurrOffset420Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCurrOffset420Counter != sharedCounter;
            localCurrOffset420Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkCurrOffset420MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localWorkLength420Counter = -1;
         public boolean isWorkLength420Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWorkLength420Counter != sharedCounter;
            localWorkLength420Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkWorkLength420MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSf305120VersionMsg600Counter = -1;
     public boolean isSf305120VersionMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf305120VersionMsg600Counter != sharedCounter;
         localSf305120VersionMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSf305120VersionMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
     int localMessage0001600Counter = -1;
     public boolean isMessage0001600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessage0001600Counter != sharedCounter;
         localMessage0001600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMessage0001600Constraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
     int localCurrDateYyyy600Counter = -1;
     public boolean isCurrDateYyyy600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateYyyy600Counter != sharedCounter;
         localCurrDateYyyy600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrDateYyyy600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localCurrDateMm600Counter = -1;
     public boolean isCurrDateMm600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateMm600Counter != sharedCounter;
         localCurrDateMm600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrDateMm600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localCurrDateDd600Counter = -1;
     public boolean isCurrDateDd600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateDd600Counter != sharedCounter;
         localCurrDateDd600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrDateDd600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localCurrTimeHh600Counter = -1;
     public boolean isCurrTimeHh600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeHh600Counter != sharedCounter;
         localCurrTimeHh600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrTimeHh600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localCurrTimeMm600Counter = -1;
     public boolean isCurrTimeMm600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeMm600Counter != sharedCounter;
         localCurrTimeMm600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrTimeMm600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localCurrTimeSs600Counter = -1;
     public boolean isCurrTimeSs600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeSs600Counter != sharedCounter;
         localCurrTimeSs600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrTimeSs600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localZlogSr2Area803Counter = -1;
     public boolean isZlogSr2Area803Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZlogSr2Area803Counter != sharedCounter;
         localZlogSr2Area803Counter = sharedCounter; return hasModified;
     }

   protected char[] checkZlogSr2Area803Constraints(char[] value) {
   			return super.checkConstraints(value , 8167 ,false, false);
   }
         int localRhTotalLnth810Counter = -1;
         public boolean isRhTotalLnth810Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRhTotalLnth810Counter != sharedCounter;
            localRhTotalLnth810Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkRhTotalLnth810MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localRhLnth1810Counter = -1;
         public boolean isRhLnth1810Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRhLnth1810Counter != sharedCounter;
            localRhLnth1810Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkRhLnth1810MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localRhLnth2810Counter = -1;
         public boolean isRhLnth2810Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRhLnth2810Counter != sharedCounter;
            localRhLnth2810Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkRhLnth2810MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localRhLnth3810Counter = -1;
         public boolean isRhLnth3810Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRhLnth3810Counter != sharedCounter;
            localRhLnth3810Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkRhLnth3810MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localRhWaitTime810Counter = -1;
     public boolean isRhWaitTime810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRhWaitTime810Counter != sharedCounter;
         localRhWaitTime810Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRhWaitTime810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
