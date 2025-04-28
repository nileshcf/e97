package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcGbtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcGbtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcGbtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_GBT_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcGbtBbl;
            protected  int beginWcGbtKb;
            protected  int beginWcGbtLit;
            protected  int beginWcGbtM3;
            protected  int beginWcGbtUsg;
            protected  int beginWcGbtUkg;
            protected  int beginWcGbtMmb;
            protected  int beginWcGbtGbt;
            protected  int beginWcGbtThm;
            protected  int beginWcGbtMwh;
            protected  int beginWcGbtGj;
            protected  int beginWcGbtDay;
	
	/**
	* Constructor for WcGbtSerialized
	**/
    public WcGbtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcGbtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcGbtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcGbtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,756); // serialize this field at offset 756 by default 
    }
    
	/**
	* sets parent for this WcGbtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 756 by default
    }    
	/**
	* initializes the field in WcGbtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_GBT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcGbtBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcGbtKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcGbtLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcGbtM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcGbtUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcGbtUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcGbtMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcGbtGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcGbtThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcGbtMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcGbtGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcGbtDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcGbtBblCounter = -1;
        public boolean isWcGbtBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtBblCounter != sharedCounter;
           localWcGbtBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtBblIsNumeric() {
	      return decimalIsNumeric(beginWcGbtBbl,WC_GBT_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtBblString() {
            return getPackedString(beginWcGbtBbl,WC_GBT_BBL_LEN);
         }
   protected static final int WC_GBT_BBL_LEN = 9;
   protected static final int WC_GBT_BBL_SCALE = 4;
  	/**
	 * 	serializeWcGbtBbl
	 */
	protected void serializeWcGbtBbl(BigDecimal wcGbtBbl) {
		   putDecimal(beginWcGbtBbl,wcGbtBbl,WC_GBT_BBL_LEN,WC_GBT_BBL_SCALE,true);
		 localWcGbtBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtBbl,WC_GBT_BBL_LEN,WC_GBT_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtBbl", beginWcGbtBbl,WC_GBT_BBL_LEN);
     }
   	}
        int localWcGbtKbCounter = -1;
        public boolean isWcGbtKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtKbCounter != sharedCounter;
           localWcGbtKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtKbIsNumeric() {
	      return decimalIsNumeric(beginWcGbtKb,WC_GBT_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtKbString() {
            return getPackedString(beginWcGbtKb,WC_GBT_KB_LEN);
         }
   protected static final int WC_GBT_KB_LEN = 9;
   protected static final int WC_GBT_KB_SCALE = 4;
  	/**
	 * 	serializeWcGbtKb
	 */
	protected void serializeWcGbtKb(BigDecimal wcGbtKb) {
		   putDecimal(beginWcGbtKb,wcGbtKb,WC_GBT_KB_LEN,WC_GBT_KB_SCALE,true);
		 localWcGbtKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtKb,WC_GBT_KB_LEN,WC_GBT_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtKb", beginWcGbtKb,WC_GBT_KB_LEN);
     }
   	}
        int localWcGbtLitCounter = -1;
        public boolean isWcGbtLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtLitCounter != sharedCounter;
           localWcGbtLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtLitIsNumeric() {
	      return decimalIsNumeric(beginWcGbtLit,WC_GBT_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtLitString() {
            return getPackedString(beginWcGbtLit,WC_GBT_LIT_LEN);
         }
   protected static final int WC_GBT_LIT_LEN = 9;
   protected static final int WC_GBT_LIT_SCALE = 4;
  	/**
	 * 	serializeWcGbtLit
	 */
	protected void serializeWcGbtLit(BigDecimal wcGbtLit) {
		   putDecimal(beginWcGbtLit,wcGbtLit,WC_GBT_LIT_LEN,WC_GBT_LIT_SCALE,true);
		 localWcGbtLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtLit,WC_GBT_LIT_LEN,WC_GBT_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtLit", beginWcGbtLit,WC_GBT_LIT_LEN);
     }
   	}
        int localWcGbtM3Counter = -1;
        public boolean isWcGbtM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtM3Counter != sharedCounter;
           localWcGbtM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtM3IsNumeric() {
	      return decimalIsNumeric(beginWcGbtM3,WC_GBT_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtM3String() {
            return getPackedString(beginWcGbtM3,WC_GBT_M_3_LEN);
         }
   protected static final int WC_GBT_M_3_LEN = 9;
   protected static final int WC_GBT_M_3_SCALE = 4;
  	/**
	 * 	serializeWcGbtM3
	 */
	protected void serializeWcGbtM3(BigDecimal wcGbtM3) {
		   putDecimal(beginWcGbtM3,wcGbtM3,WC_GBT_M_3_LEN,WC_GBT_M_3_SCALE,true);
		 localWcGbtM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtM3,WC_GBT_M_3_LEN,WC_GBT_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtM3", beginWcGbtM3,WC_GBT_M_3_LEN);
     }
   	}
        int localWcGbtUsgCounter = -1;
        public boolean isWcGbtUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtUsgCounter != sharedCounter;
           localWcGbtUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtUsgIsNumeric() {
	      return decimalIsNumeric(beginWcGbtUsg,WC_GBT_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtUsgString() {
            return getPackedString(beginWcGbtUsg,WC_GBT_USG_LEN);
         }
   protected static final int WC_GBT_USG_LEN = 9;
   protected static final int WC_GBT_USG_SCALE = 4;
  	/**
	 * 	serializeWcGbtUsg
	 */
	protected void serializeWcGbtUsg(BigDecimal wcGbtUsg) {
		   putDecimal(beginWcGbtUsg,wcGbtUsg,WC_GBT_USG_LEN,WC_GBT_USG_SCALE,true);
		 localWcGbtUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtUsg,WC_GBT_USG_LEN,WC_GBT_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtUsg", beginWcGbtUsg,WC_GBT_USG_LEN);
     }
   	}
        int localWcGbtUkgCounter = -1;
        public boolean isWcGbtUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtUkgCounter != sharedCounter;
           localWcGbtUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtUkgIsNumeric() {
	      return decimalIsNumeric(beginWcGbtUkg,WC_GBT_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtUkgString() {
            return getPackedString(beginWcGbtUkg,WC_GBT_UKG_LEN);
         }
   protected static final int WC_GBT_UKG_LEN = 9;
   protected static final int WC_GBT_UKG_SCALE = 4;
  	/**
	 * 	serializeWcGbtUkg
	 */
	protected void serializeWcGbtUkg(BigDecimal wcGbtUkg) {
		   putDecimal(beginWcGbtUkg,wcGbtUkg,WC_GBT_UKG_LEN,WC_GBT_UKG_SCALE,true);
		 localWcGbtUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtUkg,WC_GBT_UKG_LEN,WC_GBT_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtUkg", beginWcGbtUkg,WC_GBT_UKG_LEN);
     }
   	}
        int localWcGbtMmbCounter = -1;
        public boolean isWcGbtMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtMmbCounter != sharedCounter;
           localWcGbtMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtMmbIsNumeric() {
	      return decimalIsNumeric(beginWcGbtMmb,WC_GBT_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtMmbString() {
            return getPackedString(beginWcGbtMmb,WC_GBT_MMB_LEN);
         }
   protected static final int WC_GBT_MMB_LEN = 9;
   protected static final int WC_GBT_MMB_SCALE = 4;
  	/**
	 * 	serializeWcGbtMmb
	 */
	protected void serializeWcGbtMmb(BigDecimal wcGbtMmb) {
		   putDecimal(beginWcGbtMmb,wcGbtMmb,WC_GBT_MMB_LEN,WC_GBT_MMB_SCALE,true);
		 localWcGbtMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtMmb,WC_GBT_MMB_LEN,WC_GBT_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtMmb", beginWcGbtMmb,WC_GBT_MMB_LEN);
     }
   	}
        int localWcGbtGbtCounter = -1;
        public boolean isWcGbtGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtGbtCounter != sharedCounter;
           localWcGbtGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtGbtIsNumeric() {
	      return decimalIsNumeric(beginWcGbtGbt,WC_GBT_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtGbtString() {
            return getPackedString(beginWcGbtGbt,WC_GBT_GBT_LEN);
         }
   protected static final int WC_GBT_GBT_LEN = 9;
   protected static final int WC_GBT_GBT_SCALE = 4;
  	/**
	 * 	serializeWcGbtGbt
	 */
	protected void serializeWcGbtGbt(BigDecimal wcGbtGbt) {
		   putDecimal(beginWcGbtGbt,wcGbtGbt,WC_GBT_GBT_LEN,WC_GBT_GBT_SCALE,true);
		 localWcGbtGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtGbt,WC_GBT_GBT_LEN,WC_GBT_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtGbt", beginWcGbtGbt,WC_GBT_GBT_LEN);
     }
   	}
        int localWcGbtThmCounter = -1;
        public boolean isWcGbtThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtThmCounter != sharedCounter;
           localWcGbtThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtThmIsNumeric() {
	      return decimalIsNumeric(beginWcGbtThm,WC_GBT_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtThmString() {
            return getPackedString(beginWcGbtThm,WC_GBT_THM_LEN);
         }
   protected static final int WC_GBT_THM_LEN = 9;
   protected static final int WC_GBT_THM_SCALE = 4;
  	/**
	 * 	serializeWcGbtThm
	 */
	protected void serializeWcGbtThm(BigDecimal wcGbtThm) {
		   putDecimal(beginWcGbtThm,wcGbtThm,WC_GBT_THM_LEN,WC_GBT_THM_SCALE,true);
		 localWcGbtThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtThm,WC_GBT_THM_LEN,WC_GBT_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtThm", beginWcGbtThm,WC_GBT_THM_LEN);
     }
   	}
        int localWcGbtMwhCounter = -1;
        public boolean isWcGbtMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtMwhCounter != sharedCounter;
           localWcGbtMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtMwhIsNumeric() {
	      return decimalIsNumeric(beginWcGbtMwh,WC_GBT_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtMwhString() {
            return getPackedString(beginWcGbtMwh,WC_GBT_MWH_LEN);
         }
   protected static final int WC_GBT_MWH_LEN = 9;
   protected static final int WC_GBT_MWH_SCALE = 4;
  	/**
	 * 	serializeWcGbtMwh
	 */
	protected void serializeWcGbtMwh(BigDecimal wcGbtMwh) {
		   putDecimal(beginWcGbtMwh,wcGbtMwh,WC_GBT_MWH_LEN,WC_GBT_MWH_SCALE,true);
		 localWcGbtMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtMwh,WC_GBT_MWH_LEN,WC_GBT_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtMwh", beginWcGbtMwh,WC_GBT_MWH_LEN);
     }
   	}
        int localWcGbtGjCounter = -1;
        public boolean isWcGbtGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtGjCounter != sharedCounter;
           localWcGbtGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtGjIsNumeric() {
	      return decimalIsNumeric(beginWcGbtGj,WC_GBT_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtGjString() {
            return getPackedString(beginWcGbtGj,WC_GBT_GJ_LEN);
         }
   protected static final int WC_GBT_GJ_LEN = 9;
   protected static final int WC_GBT_GJ_SCALE = 4;
  	/**
	 * 	serializeWcGbtGj
	 */
	protected void serializeWcGbtGj(BigDecimal wcGbtGj) {
		   putDecimal(beginWcGbtGj,wcGbtGj,WC_GBT_GJ_LEN,WC_GBT_GJ_SCALE,true);
		 localWcGbtGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtGj,WC_GBT_GJ_LEN,WC_GBT_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtGj", beginWcGbtGj,WC_GBT_GJ_LEN);
     }
   	}
        int localWcGbtDayCounter = -1;
        public boolean isWcGbtDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGbtDayCounter != sharedCounter;
           localWcGbtDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGbtDayIsNumeric() {
	      return decimalIsNumeric(beginWcGbtDay,WC_GBT_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGbtDayString() {
            return getPackedString(beginWcGbtDay,WC_GBT_DAY_LEN);
         }
   protected static final int WC_GBT_DAY_LEN = 9;
   protected static final int WC_GBT_DAY_SCALE = 4;
  	/**
	 * 	serializeWcGbtDay
	 */
	protected void serializeWcGbtDay(BigDecimal wcGbtDay) {
		   putDecimal(beginWcGbtDay,wcGbtDay,WC_GBT_DAY_LEN,WC_GBT_DAY_SCALE,true);
		 localWcGbtDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGbtDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGbtDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGbtDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGbtDay,WC_GBT_DAY_LEN,WC_GBT_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGbtDay", beginWcGbtDay,WC_GBT_DAY_LEN);
     }
   	}




}
  
