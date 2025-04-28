package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWCntString;
            protected  int beginWIndOpc;
            protected  int beginLlaTroParti;
            protected  int beginNumCarParti;
            protected  int beginWpointAnt;
            protected  int beginWpointAct;
            protected  int beginWguarCar;
            protected  int beginWswCarDiv;
            protected  int beginWcntNumTro;
            protected  int beginWcntString01;
            protected  int beginWcntNcar;
	
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
  
  
  
             beginWCntString = getStartOffset() + 0;	// set offset for serialization
  
             beginWIndOpc = getStartOffset() + 2;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginLlaTroParti = getStartOffset() + 4;	// set offset for serialization
  
             beginNumCarParti = getStartOffset() + 6;	// set offset for serialization
  
  
  
             beginWpointAnt = getStartOffset() + 8;	// set offset for serialization
  
             beginWpointAct = getStartOffset() + 10;	// set offset for serialization
  
             beginWguarCar = getStartOffset() + 12;	// set offset for serialization
  
             beginWswCarDiv = getStartOffset() + 14;	// set offset for serialization
  
             beginWcntNumTro = getStartOffset() + 15;	// set offset for serialization
  
             beginWcntString01 = getStartOffset() + 17;	// set offset for serialization
  
             beginWcntNcar = getStartOffset() + 19;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWSwiInpUp1vezCounter = -1;
     public boolean isWSwiInpUp1vezModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSwiInpUp1vezCounter != sharedCounter;
         localWSwiInpUp1vezCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWSwiInpUp1vezConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWSwiInoUp1vezCounter = -1;
     public boolean isWSwiInoUp1vezModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSwiInoUp1vezCounter != sharedCounter;
         localWSwiInoUp1vezCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWSwiInoUp1vezConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWSwiInpDown1vezCounter = -1;
     public boolean isWSwiInpDown1vezModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSwiInpDown1vezCounter != sharedCounter;
         localWSwiInpDown1vezCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWSwiInpDown1vezConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
        int localWCntStringCounter = -1;
        public boolean isWCntStringModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWCntStringCounter != sharedCounter;
           localWCntStringCounter = sharedCounter; return hasModified; 
        }
	    public boolean wCntStringIsNumeric() {
	      return decimalIsNumeric(beginWCntString,W_CNT_STRING_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int W_CNT_STRING_LEN = 2;
  	/**
	 * 	serializeWCntString
	 */
	protected void serializeWCntString(int wCntString) {
		   putDecimal(beginWCntString,wCntString,W_CNT_STRING_LEN,false);
   }
   

   protected int checkWCntStringMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshWCntString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWCntString() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWCntString,W_CNT_STRING_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("wCntString", beginWCntString,W_CNT_STRING_LEN);
     }
   	}
     int localWIndOpcCounter = -1;
     public boolean isWIndOpcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWIndOpcCounter != sharedCounter;
         localWIndOpcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wIndOpc
	 *	@return wIndOpc
	 */
	public char[]  getWIndOpcString() {
	     return getCharArray(beginWIndOpc,W_IND_OPC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wIndOpcIsNumeric() {
	    return isNumeric(beginWIndOpc
	                    ,beginWIndOpc + W_IND_OPC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_IND_OPC_LEN = 2;
  	/**
	 * serializeWIndOpc
	 */
	protected void serializeWIndOpc(int wIndOpc) {
		 putNumber(beginWIndOpc,wIndOpc,W_IND_OPC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWIndOpcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWIndOpc
	 */
   	protected  int serializeWIndOpc(char[] value) {
	    int  wIndOpc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wIndOpc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWIndOpc
		       ,2
		      );
		 localWIndOpcCounter = shareString.getSerializedField().getModifiedCounter();
		return  wIndOpc;
    }

   protected int checkWIndOpcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWIndOpc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWIndOpc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWIndOpc
			                 ,W_IND_OPC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wIndOpc", beginWIndOpc,W_IND_OPC_LEN);
    }
   	}
     int localWNomPerCounter = -1;
     public boolean isWNomPerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNomPerCounter != sharedCounter;
         localWNomPerCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWNomPerConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWPapPerCounter = -1;
     public boolean isWPapPerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPapPerCounter != sharedCounter;
         localWPapPerCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWPapPerConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localWSapPerCounter = -1;
     public boolean isWSapPerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSapPerCounter != sharedCounter;
         localWSapPerCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWSapPerConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWSepApeCounter = -1;
     public boolean isWSepApeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSepApeCounter != sharedCounter;
         localWSepApeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWSepApeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWNomComCounter = -1;
     public boolean isWNomComModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNomComCounter != sharedCounter;
         localWNomComCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWNomComConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWNomApeCounter = -1;
     public boolean isWNomApeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNomApeCounter != sharedCounter;
         localWNomApeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWNomApeConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
     int localWNomRedCounter = -1;
     public boolean isWNomRedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNomRedCounter != sharedCounter;
         localWNomRedCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWNomRedConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
     int localWEsp1Counter = -1;
     public boolean isWEsp1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWEsp1Counter != sharedCounter;
         localWEsp1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWEsp1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWEsp2Counter = -1;
     public boolean isWEsp2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWEsp2Counter != sharedCounter;
         localWEsp2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWEsp2Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localWPuntoCounter = -1;
     public boolean isWPuntoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPuntoCounter != sharedCounter;
         localWPuntoCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWPuntoConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWAsterCounter = -1;
     public boolean isWAsterModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWAsterCounter != sharedCounter;
         localWAsterCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWAsterConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWnomPer01Counter = -1;
     public boolean isWnomPer01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWnomPer01Counter != sharedCounter;
         localWnomPer01Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWnomPer01Constraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
     int localWpapPer01Counter = -1;
     public boolean isWpapPer01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpapPer01Counter != sharedCounter;
         localWpapPer01Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWpapPer01Constraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
     int localWsapPer01Counter = -1;
     public boolean isWsapPer01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsapPer01Counter != sharedCounter;
         localWsapPer01Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWsapPer01Constraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
     int localLlaTroPartiCounter = -1;
     public boolean isLlaTroPartiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLlaTroPartiCounter != sharedCounter;
         localLlaTroPartiCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of llaTroParti
	 *	@return llaTroParti
	 */
	public char[]  getLlaTroPartiString() {
	     return getCharArray(beginLlaTroParti,LLA_TRO_PARTI_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean llaTroPartiIsNumeric() {
	    return isNumeric(beginLlaTroParti
	                    ,beginLlaTroParti + LLA_TRO_PARTI_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LLA_TRO_PARTI_LEN = 2;
  	/**
	 * serializeLlaTroParti
	 */
	protected void serializeLlaTroParti(int llaTroParti) {
		 putNumber(beginLlaTroParti,llaTroParti,LLA_TRO_PARTI_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLlaTroPartiCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLlaTroParti
	 */
   	protected  int serializeLlaTroParti(char[] value) {
	    int  llaTroParti;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    llaTroParti = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginLlaTroParti
		       ,2
		      );
		 localLlaTroPartiCounter = shareString.getSerializedField().getModifiedCounter();
		return  llaTroParti;
    }

   protected int checkLlaTroPartiMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLlaTroParti is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLlaTroParti() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLlaTroParti
			                 ,LLA_TRO_PARTI_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("llaTroParti", beginLlaTroParti,LLA_TRO_PARTI_LEN);
    }
   	}
     int localNumCarPartiCounter = -1;
     public boolean isNumCarPartiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumCarPartiCounter != sharedCounter;
         localNumCarPartiCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of numCarParti
	 *	@return numCarParti
	 */
	public char[]  getNumCarPartiString() {
	     return getCharArray(beginNumCarParti,NUM_CAR_PARTI_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numCarPartiIsNumeric() {
	    return isNumeric(beginNumCarParti
	                    ,beginNumCarParti + NUM_CAR_PARTI_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_CAR_PARTI_LEN = 2;
  	/**
	 * serializeNumCarParti
	 */
	protected void serializeNumCarParti(int numCarParti) {
		 putNumber(beginNumCarParti,numCarParti,NUM_CAR_PARTI_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumCarPartiCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNumCarParti
	 */
   	protected  int serializeNumCarParti(char[] value) {
	    int  numCarParti;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    numCarParti = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNumCarParti
		       ,2
		      );
		 localNumCarPartiCounter = shareString.getSerializedField().getModifiedCounter();
		return  numCarParti;
    }

   protected int checkNumCarPartiMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNumCarParti is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNumCarParti() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNumCarParti
			                 ,NUM_CAR_PARTI_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("numCarParti", beginNumCarParti,NUM_CAR_PARTI_LEN);
    }
   	}
     int localNomP01PartiCounter = -1;
     public boolean isNomP01PartiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNomP01PartiCounter != sharedCounter;
         localNomP01PartiCounter = sharedCounter; return hasModified;
     }

   protected char[] checkNomP01PartiConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localNomP02PartiCounter = -1;
     public boolean isNomP02PartiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNomP02PartiCounter != sharedCounter;
         localNomP02PartiCounter = sharedCounter; return hasModified;
     }

   protected char[] checkNomP02PartiConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
        int localWpointAntCounter = -1;
        public boolean isWpointAntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWpointAntCounter != sharedCounter;
           localWpointAntCounter = sharedCounter; return hasModified; 
        }
	    public boolean wpointAntIsNumeric() {
	      return decimalIsNumeric(beginWpointAnt,WPOINT_ANT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WPOINT_ANT_LEN = 2;
  	/**
	 * 	serializeWpointAnt
	 */
	protected void serializeWpointAnt(int wpointAnt) {
		   putDecimal(beginWpointAnt,wpointAnt,WPOINT_ANT_LEN,false);
   }
   

   protected int checkWpointAntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshWpointAnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWpointAnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWpointAnt,WPOINT_ANT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("wpointAnt", beginWpointAnt,WPOINT_ANT_LEN);
     }
   	}
        int localWpointActCounter = -1;
        public boolean isWpointActModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWpointActCounter != sharedCounter;
           localWpointActCounter = sharedCounter; return hasModified; 
        }
	    public boolean wpointActIsNumeric() {
	      return decimalIsNumeric(beginWpointAct,WPOINT_ACT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WPOINT_ACT_LEN = 2;
  	/**
	 * 	serializeWpointAct
	 */
	protected void serializeWpointAct(int wpointAct) {
		   putDecimal(beginWpointAct,wpointAct,WPOINT_ACT_LEN,false);
   }
   

   protected int checkWpointActMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshWpointAct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWpointAct() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWpointAct,WPOINT_ACT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("wpointAct", beginWpointAct,WPOINT_ACT_LEN);
     }
   	}
        int localWguarCarCounter = -1;
        public boolean isWguarCarModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWguarCarCounter != sharedCounter;
           localWguarCarCounter = sharedCounter; return hasModified; 
        }
	    public boolean wguarCarIsNumeric() {
	      return decimalIsNumeric(beginWguarCar,WGUAR_CAR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WGUAR_CAR_LEN = 2;
  	/**
	 * 	serializeWguarCar
	 */
	protected void serializeWguarCar(int wguarCar) {
		   putDecimal(beginWguarCar,wguarCar,WGUAR_CAR_LEN,false);
   }
   

   protected int checkWguarCarMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshWguarCar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWguarCar() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWguarCar,WGUAR_CAR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("wguarCar", beginWguarCar,WGUAR_CAR_LEN);
     }
   	}
        int localWswCarDivCounter = -1;
        public boolean isWswCarDivModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWswCarDivCounter != sharedCounter;
           localWswCarDivCounter = sharedCounter; return hasModified; 
        }
	    public boolean wswCarDivIsNumeric() {
	      return decimalIsNumeric(beginWswCarDiv,WSW_CAR_DIV_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WSW_CAR_DIV_LEN = 1;
  	/**
	 * 	serializeWswCarDiv
	 */
	protected void serializeWswCarDiv(int wswCarDiv) {
		   putDecimal(beginWswCarDiv,wswCarDiv,WSW_CAR_DIV_LEN,false);
   }
   

   protected int checkWswCarDivMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshWswCarDiv is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWswCarDiv() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWswCarDiv,WSW_CAR_DIV_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("wswCarDiv", beginWswCarDiv,WSW_CAR_DIV_LEN);
     }
   	}
        int localWcntNumTroCounter = -1;
        public boolean isWcntNumTroModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcntNumTroCounter != sharedCounter;
           localWcntNumTroCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcntNumTroIsNumeric() {
	      return decimalIsNumeric(beginWcntNumTro,WCNT_NUM_TRO_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WCNT_NUM_TRO_LEN = 2;
  	/**
	 * 	serializeWcntNumTro
	 */
	protected void serializeWcntNumTro(int wcntNumTro) {
		   putDecimal(beginWcntNumTro,wcntNumTro,WCNT_NUM_TRO_LEN,false);
   }
   

   protected int checkWcntNumTroMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshWcntNumTro is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcntNumTro() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWcntNumTro,WCNT_NUM_TRO_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcntNumTro", beginWcntNumTro,WCNT_NUM_TRO_LEN);
     }
   	}
        int localWcntString01Counter = -1;
        public boolean isWcntString01Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcntString01Counter != sharedCounter;
           localWcntString01Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcntString01IsNumeric() {
	      return decimalIsNumeric(beginWcntString01,WCNT_STRING_01_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WCNT_STRING_01_LEN = 2;
  	/**
	 * 	serializeWcntString01
	 */
	protected void serializeWcntString01(int wcntString01) {
		   putDecimal(beginWcntString01,wcntString01,WCNT_STRING_01_LEN,false);
   }
   

   protected int checkWcntString01MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshWcntString01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcntString01() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWcntString01,WCNT_STRING_01_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcntString01", beginWcntString01,WCNT_STRING_01_LEN);
     }
   	}
        int localWcntNcarCounter = -1;
        public boolean isWcntNcarModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcntNcarCounter != sharedCounter;
           localWcntNcarCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcntNcarIsNumeric() {
	      return decimalIsNumeric(beginWcntNcar,WCNT_NCAR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WCNT_NCAR_LEN = 2;
  	/**
	 * 	serializeWcntNcar
	 */
	protected void serializeWcntNcar(int wcntNcar) {
		   putDecimal(beginWcntNcar,wcntNcar,WCNT_NCAR_LEN,false);
   }
   

   protected int checkWcntNcarMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshWcntNcar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcntNcar() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWcntNcar,WCNT_NCAR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcntNcar", beginWcntNcar,WCNT_NCAR_LEN);
     }
   	}
     int localWrespCounter = -1;
     public boolean isWrespModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrespCounter != sharedCounter;
         localWrespCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWrespConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }




}
  
