package com.cloudframe.app.bm80022.file.records.serialize;

/**
*  The class Ge0018fSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ge0018fSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ge0018fSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GE_0018F_LENGTH = 139;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGe0018fCodentid;
            protected  int beginGe0018fTipproduct;
            protected  int beginGe0018fCodcontrat;
            protected  int beginGe0018fOfigestora;
            protected  int beginGe0018fIdepsig;
            protected  int beginGe0018fNumpersona;
            protected  int beginGe0018fNumcartera;
            protected  int beginGe0018fCodcartera;
            protected  int beginGe0018fFechaalta;
            protected  int beginGe0018fFechabaja;
            protected  int beginGe0018fCodnodo;
            protected  int beginGe0018fResambito;
            protected  int beginGe0018fNumresamb;
            protected  int beginGe0018fNumpresamb;
            protected  int beginGe0018fCengescapt;
            protected  int beginGe0018fNumgescap;
            protected  int beginGe0018fNumpgescap;
            protected  int beginGe0018fNumpesprie;
            protected  int beginGe0018fCodcarrie;
            protected  int beginGe0018fFecciecurso;
	
	/**
	* Constructor for Ge0018fSerialized
	**/
    public Ge0018fSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ge0018fSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GE_0018F_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGe0018fCodentid = getStartOffset() + 0;	// set offset for serialization
  
             beginGe0018fTipproduct = getStartOffset() + 2;	// set offset for serialization
  
             beginGe0018fCodcontrat = getStartOffset() + 5;	// set offset for serialization
  
             beginGe0018fOfigestora = getStartOffset() + 13;	// set offset for serialization
  
             beginGe0018fIdepsig = getStartOffset() + 17;	// set offset for serialization
  
             beginGe0018fNumpersona = getStartOffset() + 29;	// set offset for serialization
  
             beginGe0018fNumcartera = getStartOffset() + 34;	// set offset for serialization
  
             beginGe0018fCodcartera = getStartOffset() + 42;	// set offset for serialization
  
             beginGe0018fFechaalta = getStartOffset() + 50;	// set offset for serialization
  
             beginGe0018fFechabaja = getStartOffset() + 60;	// set offset for serialization
  
             beginGe0018fCodnodo = getStartOffset() + 70;	// set offset for serialization
  
             beginGe0018fResambito = getStartOffset() + 78;	// set offset for serialization
  
             beginGe0018fNumresamb = getStartOffset() + 90;	// set offset for serialization
  
             beginGe0018fNumpresamb = getStartOffset() + 94;	// set offset for serialization
  
             beginGe0018fCengescapt = getStartOffset() + 99;	// set offset for serialization
  
             beginGe0018fNumgescap = getStartOffset() + 107;	// set offset for serialization
  
             beginGe0018fNumpgescap = getStartOffset() + 111;	// set offset for serialization
  
             beginGe0018fNumpesprie = getStartOffset() + 116;	// set offset for serialization
  
             beginGe0018fCodcarrie = getStartOffset() + 121;	// set offset for serialization
  
             beginGe0018fFecciecurso = getStartOffset() + 129;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGe0018fCodentidCounter = -1;
     public boolean isGe0018fCodentidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fCodentidCounter != sharedCounter;
         localGe0018fCodentidCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_CODENTID_LEN = 2;
	/**
	 * 	serialize this Ge0018fCodentid
	 */
   protected void serializeGe0018fCodentid(char[] ge0018fCodentid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fCodentid,0,getStringValue(),beginGe0018fCodentid,GE_0018F_CODENTID_LEN);
       localGe0018fCodentidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fCodentidConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGe0018fCodentid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fCodentid() {	 
   		return (substring(getStringValue(),beginGe0018fCodentid,beginGe0018fCodentid + GE_0018F_CODENTID_LEN));
   	}
     int localGe0018fTipproductCounter = -1;
     public boolean isGe0018fTipproductModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fTipproductCounter != sharedCounter;
         localGe0018fTipproductCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_TIPPRODUCT_LEN = 3;
	/**
	 * 	serialize this Ge0018fTipproduct
	 */
   protected void serializeGe0018fTipproduct(char[] ge0018fTipproduct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fTipproduct,0,getStringValue(),beginGe0018fTipproduct,GE_0018F_TIPPRODUCT_LEN);
       localGe0018fTipproductCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fTipproductConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshGe0018fTipproduct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fTipproduct() {	 
   		return (substring(getStringValue(),beginGe0018fTipproduct,beginGe0018fTipproduct + GE_0018F_TIPPRODUCT_LEN));
   	}
        int localGe0018fCodcontratCounter = -1;
        public boolean isGe0018fCodcontratModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localGe0018fCodcontratCounter != sharedCounter;
           localGe0018fCodcontratCounter = sharedCounter; return hasModified; 
        }
	    public boolean ge0018fCodcontratIsNumeric() {
	      return decimalIsNumeric(beginGe0018fCodcontrat,GE_0018F_CODCONTRAT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int GE_0018F_CODCONTRAT_LEN = 8;
  	/**
	 * 	serializeGe0018fCodcontrat
	 */
	protected void serializeGe0018fCodcontrat(long ge0018fCodcontrat) {
		   putDecimal(beginGe0018fCodcontrat,ge0018fCodcontrat,GE_0018F_CODCONTRAT_LEN,true);
   }
   

   protected long checkGe0018fCodcontratMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshGe0018fCodcontrat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshGe0018fCodcontrat() throws CFException {	
   	try { 
		 return (getLongDecimal(beginGe0018fCodcontrat,GE_0018F_CODCONTRAT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ge0018fCodcontrat", beginGe0018fCodcontrat,GE_0018F_CODCONTRAT_LEN);
     }
   	}
     int localGe0018fOfigestoraCounter = -1;
     public boolean isGe0018fOfigestoraModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fOfigestoraCounter != sharedCounter;
         localGe0018fOfigestoraCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ge0018fOfigestora
	 *	@return ge0018fOfigestora
	 */
	public char[]  getGe0018fOfigestoraString() {
	     return getCharArray(beginGe0018fOfigestora,GE_0018F_OFIGESTORA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ge0018fOfigestoraIsNumeric() {
	    return isNumeric(beginGe0018fOfigestora
	                    ,beginGe0018fOfigestora + GE_0018F_OFIGESTORA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int GE_0018F_OFIGESTORA_LEN = 4;
  	/**
	 * serializeGe0018fOfigestora
	 */
	protected void serializeGe0018fOfigestora(int ge0018fOfigestora) {
		 putNumber(beginGe0018fOfigestora,ge0018fOfigestora,GE_0018F_OFIGESTORA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localGe0018fOfigestoraCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeGe0018fOfigestora
	 */
   	protected  int serializeGe0018fOfigestora(char[] value) {
	    int  ge0018fOfigestora;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ge0018fOfigestora = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginGe0018fOfigestora
		       ,4
		      );
		 localGe0018fOfigestoraCounter = shareString.getSerializedField().getModifiedCounter();
		return  ge0018fOfigestora;
    }

   protected int checkGe0018fOfigestoraMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshGe0018fOfigestora is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGe0018fOfigestora() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginGe0018fOfigestora
			                 ,GE_0018F_OFIGESTORA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ge0018fOfigestora", beginGe0018fOfigestora,GE_0018F_OFIGESTORA_LEN);
    }
   	}
     int localGe0018fIdepsigCounter = -1;
     public boolean isGe0018fIdepsigModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fIdepsigCounter != sharedCounter;
         localGe0018fIdepsigCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_IDEPSIG_LEN = 12;
	/**
	 * 	serialize this Ge0018fIdepsig
	 */
   protected void serializeGe0018fIdepsig(char[] ge0018fIdepsig) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fIdepsig,0,getStringValue(),beginGe0018fIdepsig,GE_0018F_IDEPSIG_LEN);
       localGe0018fIdepsigCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fIdepsigConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshGe0018fIdepsig is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fIdepsig() {	 
   		return (substring(getStringValue(),beginGe0018fIdepsig,beginGe0018fIdepsig + GE_0018F_IDEPSIG_LEN));
   	}
        int localGe0018fNumpersonaCounter = -1;
        public boolean isGe0018fNumpersonaModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localGe0018fNumpersonaCounter != sharedCounter;
           localGe0018fNumpersonaCounter = sharedCounter; return hasModified; 
        }
	    public boolean ge0018fNumpersonaIsNumeric() {
	      return decimalIsNumeric(beginGe0018fNumpersona,GE_0018F_NUMPERSONA_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int GE_0018F_NUMPERSONA_LEN = 5;
  	/**
	 * 	serializeGe0018fNumpersona
	 */
	protected void serializeGe0018fNumpersona(int ge0018fNumpersona) {
		   putDecimal(beginGe0018fNumpersona,ge0018fNumpersona,GE_0018F_NUMPERSONA_LEN,true);
   }
   

   protected int checkGe0018fNumpersonaMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshGe0018fNumpersona is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGe0018fNumpersona() throws CFException {	
   	try { 
		 return (getIntDecimal(beginGe0018fNumpersona,GE_0018F_NUMPERSONA_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ge0018fNumpersona", beginGe0018fNumpersona,GE_0018F_NUMPERSONA_LEN);
     }
   	}
     int localGe0018fNumcarteraCounter = -1;
     public boolean isGe0018fNumcarteraModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fNumcarteraCounter != sharedCounter;
         localGe0018fNumcarteraCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ge0018fNumcartera
	 *	@return ge0018fNumcartera
	 */
	public char[]  getGe0018fNumcarteraString() {
	     return getCharArray(beginGe0018fNumcartera,GE_0018F_NUMCARTERA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ge0018fNumcarteraIsNumeric() {
	    return isNumeric(beginGe0018fNumcartera
	                    ,beginGe0018fNumcartera + GE_0018F_NUMCARTERA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int GE_0018F_NUMCARTERA_LEN = 8;
  	/**
	 * serializeGe0018fNumcartera
	 */
	protected void serializeGe0018fNumcartera(long ge0018fNumcartera) {
		 putNumber(beginGe0018fNumcartera,ge0018fNumcartera,GE_0018F_NUMCARTERA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localGe0018fNumcarteraCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeGe0018fNumcartera
	 */
   	protected  long serializeGe0018fNumcartera(char[] value) {
	    long  ge0018fNumcartera;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ge0018fNumcartera = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginGe0018fNumcartera
		       ,8
		      );
		 localGe0018fNumcarteraCounter = shareString.getSerializedField().getModifiedCounter();
		return  ge0018fNumcartera;
    }

   protected long checkGe0018fNumcarteraMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshGe0018fNumcartera is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshGe0018fNumcartera() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginGe0018fNumcartera
			                 ,GE_0018F_NUMCARTERA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ge0018fNumcartera", beginGe0018fNumcartera,GE_0018F_NUMCARTERA_LEN);
    }
   	}
     int localGe0018fCodcarteraCounter = -1;
     public boolean isGe0018fCodcarteraModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fCodcarteraCounter != sharedCounter;
         localGe0018fCodcarteraCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_CODCARTERA_LEN = 8;
	/**
	 * 	serialize this Ge0018fCodcartera
	 */
   protected void serializeGe0018fCodcartera(char[] ge0018fCodcartera) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fCodcartera,0,getStringValue(),beginGe0018fCodcartera,GE_0018F_CODCARTERA_LEN);
       localGe0018fCodcarteraCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fCodcarteraConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshGe0018fCodcartera is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fCodcartera() {	 
   		return (substring(getStringValue(),beginGe0018fCodcartera,beginGe0018fCodcartera + GE_0018F_CODCARTERA_LEN));
   	}
     int localGe0018fFechaaltaCounter = -1;
     public boolean isGe0018fFechaaltaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fFechaaltaCounter != sharedCounter;
         localGe0018fFechaaltaCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_FECHAALTA_LEN = 10;
	/**
	 * 	serialize this Ge0018fFechaalta
	 */
   protected void serializeGe0018fFechaalta(char[] ge0018fFechaalta) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fFechaalta,0,getStringValue(),beginGe0018fFechaalta,GE_0018F_FECHAALTA_LEN);
       localGe0018fFechaaltaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fFechaaltaConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshGe0018fFechaalta is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fFechaalta() {	 
   		return (substring(getStringValue(),beginGe0018fFechaalta,beginGe0018fFechaalta + GE_0018F_FECHAALTA_LEN));
   	}
     int localGe0018fFechabajaCounter = -1;
     public boolean isGe0018fFechabajaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fFechabajaCounter != sharedCounter;
         localGe0018fFechabajaCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_FECHABAJA_LEN = 10;
	/**
	 * 	serialize this Ge0018fFechabaja
	 */
   protected void serializeGe0018fFechabaja(char[] ge0018fFechabaja) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fFechabaja,0,getStringValue(),beginGe0018fFechabaja,GE_0018F_FECHABAJA_LEN);
       localGe0018fFechabajaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fFechabajaConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshGe0018fFechabaja is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fFechabaja() {	 
   		return (substring(getStringValue(),beginGe0018fFechabaja,beginGe0018fFechabaja + GE_0018F_FECHABAJA_LEN));
   	}
     int localGe0018fCodnodoCounter = -1;
     public boolean isGe0018fCodnodoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fCodnodoCounter != sharedCounter;
         localGe0018fCodnodoCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_CODNODO_LEN = 8;
	/**
	 * 	serialize this Ge0018fCodnodo
	 */
   protected void serializeGe0018fCodnodo(char[] ge0018fCodnodo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fCodnodo,0,getStringValue(),beginGe0018fCodnodo,GE_0018F_CODNODO_LEN);
       localGe0018fCodnodoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fCodnodoConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshGe0018fCodnodo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fCodnodo() {	 
   		return (substring(getStringValue(),beginGe0018fCodnodo,beginGe0018fCodnodo + GE_0018F_CODNODO_LEN));
   	}
     int localGe0018fResambitoCounter = -1;
     public boolean isGe0018fResambitoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fResambitoCounter != sharedCounter;
         localGe0018fResambitoCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_RESAMBITO_LEN = 12;
	/**
	 * 	serialize this Ge0018fResambito
	 */
   protected void serializeGe0018fResambito(char[] ge0018fResambito) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fResambito,0,getStringValue(),beginGe0018fResambito,GE_0018F_RESAMBITO_LEN);
       localGe0018fResambitoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fResambitoConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshGe0018fResambito is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fResambito() {	 
   		return (substring(getStringValue(),beginGe0018fResambito,beginGe0018fResambito + GE_0018F_RESAMBITO_LEN));
   	}
         int localGe0018fNumresambCounter = -1;
         public boolean isGe0018fNumresambModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGe0018fNumresambCounter != sharedCounter;
            localGe0018fNumresambCounter = sharedCounter; return hasModified; 
         }
   protected static final int GE_0018F_NUMRESAMB_LEN = 4;
  	/**
	 * serializeGe0018fNumresamb
	 */
	protected void serializeGe0018fNumresamb(int ge0018fNumresamb) {
           replaceValue( //  save the value as string
                   getBinaryString( ge0018fNumresamb,GE_0018F_NUMRESAMB_LEN)
                  ,beginGe0018fNumresamb
                  ,GE_0018F_NUMRESAMB_LEN
                 );
            localGe0018fNumresambCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkGe0018fNumresambMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshGe0018fNumresamb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGe0018fNumresamb() {	 
			return (getInt(beginGe0018fNumresamb));
   	}
        int localGe0018fNumpresambCounter = -1;
        public boolean isGe0018fNumpresambModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localGe0018fNumpresambCounter != sharedCounter;
           localGe0018fNumpresambCounter = sharedCounter; return hasModified; 
        }
	    public boolean ge0018fNumpresambIsNumeric() {
	      return decimalIsNumeric(beginGe0018fNumpresamb,GE_0018F_NUMPRESAMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int GE_0018F_NUMPRESAMB_LEN = 5;
  	/**
	 * 	serializeGe0018fNumpresamb
	 */
	protected void serializeGe0018fNumpresamb(int ge0018fNumpresamb) {
		   putDecimal(beginGe0018fNumpresamb,ge0018fNumpresamb,GE_0018F_NUMPRESAMB_LEN,true);
   }
   

   protected int checkGe0018fNumpresambMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshGe0018fNumpresamb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGe0018fNumpresamb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginGe0018fNumpresamb,GE_0018F_NUMPRESAMB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ge0018fNumpresamb", beginGe0018fNumpresamb,GE_0018F_NUMPRESAMB_LEN);
     }
   	}
     int localGe0018fCengescaptCounter = -1;
     public boolean isGe0018fCengescaptModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fCengescaptCounter != sharedCounter;
         localGe0018fCengescaptCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_CENGESCAPT_LEN = 8;
	/**
	 * 	serialize this Ge0018fCengescapt
	 */
   protected void serializeGe0018fCengescapt(char[] ge0018fCengescapt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fCengescapt,0,getStringValue(),beginGe0018fCengescapt,GE_0018F_CENGESCAPT_LEN);
       localGe0018fCengescaptCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fCengescaptConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshGe0018fCengescapt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fCengescapt() {	 
   		return (substring(getStringValue(),beginGe0018fCengescapt,beginGe0018fCengescapt + GE_0018F_CENGESCAPT_LEN));
   	}
         int localGe0018fNumgescapCounter = -1;
         public boolean isGe0018fNumgescapModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGe0018fNumgescapCounter != sharedCounter;
            localGe0018fNumgescapCounter = sharedCounter; return hasModified; 
         }
   protected static final int GE_0018F_NUMGESCAP_LEN = 4;
  	/**
	 * serializeGe0018fNumgescap
	 */
	protected void serializeGe0018fNumgescap(int ge0018fNumgescap) {
           replaceValue( //  save the value as string
                   getBinaryString( ge0018fNumgescap,GE_0018F_NUMGESCAP_LEN)
                  ,beginGe0018fNumgescap
                  ,GE_0018F_NUMGESCAP_LEN
                 );
            localGe0018fNumgescapCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkGe0018fNumgescapMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshGe0018fNumgescap is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGe0018fNumgescap() {	 
			return (getInt(beginGe0018fNumgescap));
   	}
        int localGe0018fNumpgescapCounter = -1;
        public boolean isGe0018fNumpgescapModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localGe0018fNumpgescapCounter != sharedCounter;
           localGe0018fNumpgescapCounter = sharedCounter; return hasModified; 
        }
	    public boolean ge0018fNumpgescapIsNumeric() {
	      return decimalIsNumeric(beginGe0018fNumpgescap,GE_0018F_NUMPGESCAP_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int GE_0018F_NUMPGESCAP_LEN = 5;
  	/**
	 * 	serializeGe0018fNumpgescap
	 */
	protected void serializeGe0018fNumpgescap(int ge0018fNumpgescap) {
		   putDecimal(beginGe0018fNumpgescap,ge0018fNumpgescap,GE_0018F_NUMPGESCAP_LEN,true);
   }
   

   protected int checkGe0018fNumpgescapMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshGe0018fNumpgescap is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGe0018fNumpgescap() throws CFException {	
   	try { 
		 return (getIntDecimal(beginGe0018fNumpgescap,GE_0018F_NUMPGESCAP_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ge0018fNumpgescap", beginGe0018fNumpgescap,GE_0018F_NUMPGESCAP_LEN);
     }
   	}
        int localGe0018fNumpesprieCounter = -1;
        public boolean isGe0018fNumpesprieModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localGe0018fNumpesprieCounter != sharedCounter;
           localGe0018fNumpesprieCounter = sharedCounter; return hasModified; 
        }
	    public boolean ge0018fNumpesprieIsNumeric() {
	      return decimalIsNumeric(beginGe0018fNumpesprie,GE_0018F_NUMPESPRIE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int GE_0018F_NUMPESPRIE_LEN = 5;
  	/**
	 * 	serializeGe0018fNumpesprie
	 */
	protected void serializeGe0018fNumpesprie(int ge0018fNumpesprie) {
		   putDecimal(beginGe0018fNumpesprie,ge0018fNumpesprie,GE_0018F_NUMPESPRIE_LEN,true);
   }
   

   protected int checkGe0018fNumpesprieMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshGe0018fNumpesprie is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGe0018fNumpesprie() throws CFException {	
   	try { 
		 return (getIntDecimal(beginGe0018fNumpesprie,GE_0018F_NUMPESPRIE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ge0018fNumpesprie", beginGe0018fNumpesprie,GE_0018F_NUMPESPRIE_LEN);
     }
   	}
     int localGe0018fCodcarrieCounter = -1;
     public boolean isGe0018fCodcarrieModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fCodcarrieCounter != sharedCounter;
         localGe0018fCodcarrieCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_CODCARRIE_LEN = 8;
	/**
	 * 	serialize this Ge0018fCodcarrie
	 */
   protected void serializeGe0018fCodcarrie(char[] ge0018fCodcarrie) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fCodcarrie,0,getStringValue(),beginGe0018fCodcarrie,GE_0018F_CODCARRIE_LEN);
       localGe0018fCodcarrieCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fCodcarrieConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshGe0018fCodcarrie is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fCodcarrie() {	 
   		return (substring(getStringValue(),beginGe0018fCodcarrie,beginGe0018fCodcarrie + GE_0018F_CODCARRIE_LEN));
   	}
     int localGe0018fFecciecursoCounter = -1;
     public boolean isGe0018fFecciecursoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe0018fFecciecursoCounter != sharedCounter;
         localGe0018fFecciecursoCounter = sharedCounter; return hasModified;
     }
	protected static final int GE_0018F_FECCIECURSO_LEN = 10;
	/**
	 * 	serialize this Ge0018fFecciecurso
	 */
   protected void serializeGe0018fFecciecurso(char[] ge0018fFecciecurso) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ge0018fFecciecurso,0,getStringValue(),beginGe0018fFecciecurso,GE_0018F_FECCIECURSO_LEN);
       localGe0018fFecciecursoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGe0018fFecciecursoConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshGe0018fFecciecurso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGe0018fFecciecurso() {	 
   		return (substring(getStringValue(),beginGe0018fFecciecurso,beginGe0018fFecciecurso + GE_0018F_FECCIECURSO_LEN));
   	}




}
  
