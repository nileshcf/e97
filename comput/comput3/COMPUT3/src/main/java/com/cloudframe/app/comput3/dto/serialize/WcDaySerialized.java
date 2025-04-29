package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcDaySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:11. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcDaySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcDaySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_DAY_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcDayBbl;
            protected  int beginWcDayKb;
            protected  int beginWcDayLit;
            protected  int beginWcDayM3;
            protected  int beginWcDayUsg;
            protected  int beginWcDayUkg;
            protected  int beginWcDayMmb;
            protected  int beginWcDayGbt;
            protected  int beginWcDayThm;
            protected  int beginWcDayMwh;
            protected  int beginWcDayGj;
            protected  int beginWcDayDay;
	
	/**
	* Constructor for WcDaySerialized
	**/
    public WcDaySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcDaySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcDaySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcDaySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1188); // serialize this field at offset 1188 by default 
    }
    
	/**
	* sets parent for this WcDaySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1188 by default
    }    
	/**
	* initializes the field in WcDaySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_DAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcDayBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcDayKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcDayLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcDayM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcDayUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcDayUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcDayMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcDayGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcDayThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcDayMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcDayGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcDayDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcDayBblCounter = -1;
        public boolean isWcDayBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayBblCounter != sharedCounter;
           localWcDayBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayBblIsNumeric() {
	      return decimalIsNumeric(beginWcDayBbl,WC_DAY_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayBblString() {
            return getPackedString(beginWcDayBbl,WC_DAY_BBL_LEN);
         }
   protected static final int WC_DAY_BBL_LEN = 9;
   protected static final int WC_DAY_BBL_SCALE = 4;
  	/**
	 * 	serializeWcDayBbl
	 */
	protected void serializeWcDayBbl(BigDecimal wcDayBbl) {
		   putDecimal(beginWcDayBbl,wcDayBbl,WC_DAY_BBL_LEN,WC_DAY_BBL_SCALE,true);
		 localWcDayBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayBbl,WC_DAY_BBL_LEN,WC_DAY_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayBbl", beginWcDayBbl,WC_DAY_BBL_LEN);
     }
   	}
        int localWcDayKbCounter = -1;
        public boolean isWcDayKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayKbCounter != sharedCounter;
           localWcDayKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayKbIsNumeric() {
	      return decimalIsNumeric(beginWcDayKb,WC_DAY_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayKbString() {
            return getPackedString(beginWcDayKb,WC_DAY_KB_LEN);
         }
   protected static final int WC_DAY_KB_LEN = 9;
   protected static final int WC_DAY_KB_SCALE = 4;
  	/**
	 * 	serializeWcDayKb
	 */
	protected void serializeWcDayKb(BigDecimal wcDayKb) {
		   putDecimal(beginWcDayKb,wcDayKb,WC_DAY_KB_LEN,WC_DAY_KB_SCALE,true);
		 localWcDayKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayKb,WC_DAY_KB_LEN,WC_DAY_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayKb", beginWcDayKb,WC_DAY_KB_LEN);
     }
   	}
        int localWcDayLitCounter = -1;
        public boolean isWcDayLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayLitCounter != sharedCounter;
           localWcDayLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayLitIsNumeric() {
	      return decimalIsNumeric(beginWcDayLit,WC_DAY_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayLitString() {
            return getPackedString(beginWcDayLit,WC_DAY_LIT_LEN);
         }
   protected static final int WC_DAY_LIT_LEN = 9;
   protected static final int WC_DAY_LIT_SCALE = 4;
  	/**
	 * 	serializeWcDayLit
	 */
	protected void serializeWcDayLit(BigDecimal wcDayLit) {
		   putDecimal(beginWcDayLit,wcDayLit,WC_DAY_LIT_LEN,WC_DAY_LIT_SCALE,true);
		 localWcDayLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayLit,WC_DAY_LIT_LEN,WC_DAY_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayLit", beginWcDayLit,WC_DAY_LIT_LEN);
     }
   	}
        int localWcDayM3Counter = -1;
        public boolean isWcDayM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayM3Counter != sharedCounter;
           localWcDayM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayM3IsNumeric() {
	      return decimalIsNumeric(beginWcDayM3,WC_DAY_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayM3String() {
            return getPackedString(beginWcDayM3,WC_DAY_M_3_LEN);
         }
   protected static final int WC_DAY_M_3_LEN = 9;
   protected static final int WC_DAY_M_3_SCALE = 4;
  	/**
	 * 	serializeWcDayM3
	 */
	protected void serializeWcDayM3(BigDecimal wcDayM3) {
		   putDecimal(beginWcDayM3,wcDayM3,WC_DAY_M_3_LEN,WC_DAY_M_3_SCALE,true);
		 localWcDayM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayM3,WC_DAY_M_3_LEN,WC_DAY_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayM3", beginWcDayM3,WC_DAY_M_3_LEN);
     }
   	}
        int localWcDayUsgCounter = -1;
        public boolean isWcDayUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayUsgCounter != sharedCounter;
           localWcDayUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayUsgIsNumeric() {
	      return decimalIsNumeric(beginWcDayUsg,WC_DAY_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayUsgString() {
            return getPackedString(beginWcDayUsg,WC_DAY_USG_LEN);
         }
   protected static final int WC_DAY_USG_LEN = 9;
   protected static final int WC_DAY_USG_SCALE = 4;
  	/**
	 * 	serializeWcDayUsg
	 */
	protected void serializeWcDayUsg(BigDecimal wcDayUsg) {
		   putDecimal(beginWcDayUsg,wcDayUsg,WC_DAY_USG_LEN,WC_DAY_USG_SCALE,true);
		 localWcDayUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayUsg,WC_DAY_USG_LEN,WC_DAY_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayUsg", beginWcDayUsg,WC_DAY_USG_LEN);
     }
   	}
        int localWcDayUkgCounter = -1;
        public boolean isWcDayUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayUkgCounter != sharedCounter;
           localWcDayUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayUkgIsNumeric() {
	      return decimalIsNumeric(beginWcDayUkg,WC_DAY_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayUkgString() {
            return getPackedString(beginWcDayUkg,WC_DAY_UKG_LEN);
         }
   protected static final int WC_DAY_UKG_LEN = 9;
   protected static final int WC_DAY_UKG_SCALE = 4;
  	/**
	 * 	serializeWcDayUkg
	 */
	protected void serializeWcDayUkg(BigDecimal wcDayUkg) {
		   putDecimal(beginWcDayUkg,wcDayUkg,WC_DAY_UKG_LEN,WC_DAY_UKG_SCALE,true);
		 localWcDayUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayUkg,WC_DAY_UKG_LEN,WC_DAY_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayUkg", beginWcDayUkg,WC_DAY_UKG_LEN);
     }
   	}
        int localWcDayMmbCounter = -1;
        public boolean isWcDayMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayMmbCounter != sharedCounter;
           localWcDayMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayMmbIsNumeric() {
	      return decimalIsNumeric(beginWcDayMmb,WC_DAY_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayMmbString() {
            return getPackedString(beginWcDayMmb,WC_DAY_MMB_LEN);
         }
   protected static final int WC_DAY_MMB_LEN = 9;
   protected static final int WC_DAY_MMB_SCALE = 4;
  	/**
	 * 	serializeWcDayMmb
	 */
	protected void serializeWcDayMmb(BigDecimal wcDayMmb) {
		   putDecimal(beginWcDayMmb,wcDayMmb,WC_DAY_MMB_LEN,WC_DAY_MMB_SCALE,true);
		 localWcDayMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayMmb,WC_DAY_MMB_LEN,WC_DAY_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayMmb", beginWcDayMmb,WC_DAY_MMB_LEN);
     }
   	}
        int localWcDayGbtCounter = -1;
        public boolean isWcDayGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayGbtCounter != sharedCounter;
           localWcDayGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayGbtIsNumeric() {
	      return decimalIsNumeric(beginWcDayGbt,WC_DAY_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayGbtString() {
            return getPackedString(beginWcDayGbt,WC_DAY_GBT_LEN);
         }
   protected static final int WC_DAY_GBT_LEN = 9;
   protected static final int WC_DAY_GBT_SCALE = 4;
  	/**
	 * 	serializeWcDayGbt
	 */
	protected void serializeWcDayGbt(BigDecimal wcDayGbt) {
		   putDecimal(beginWcDayGbt,wcDayGbt,WC_DAY_GBT_LEN,WC_DAY_GBT_SCALE,true);
		 localWcDayGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayGbt,WC_DAY_GBT_LEN,WC_DAY_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayGbt", beginWcDayGbt,WC_DAY_GBT_LEN);
     }
   	}
        int localWcDayThmCounter = -1;
        public boolean isWcDayThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayThmCounter != sharedCounter;
           localWcDayThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayThmIsNumeric() {
	      return decimalIsNumeric(beginWcDayThm,WC_DAY_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayThmString() {
            return getPackedString(beginWcDayThm,WC_DAY_THM_LEN);
         }
   protected static final int WC_DAY_THM_LEN = 9;
   protected static final int WC_DAY_THM_SCALE = 4;
  	/**
	 * 	serializeWcDayThm
	 */
	protected void serializeWcDayThm(BigDecimal wcDayThm) {
		   putDecimal(beginWcDayThm,wcDayThm,WC_DAY_THM_LEN,WC_DAY_THM_SCALE,true);
		 localWcDayThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayThm,WC_DAY_THM_LEN,WC_DAY_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayThm", beginWcDayThm,WC_DAY_THM_LEN);
     }
   	}
        int localWcDayMwhCounter = -1;
        public boolean isWcDayMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayMwhCounter != sharedCounter;
           localWcDayMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayMwhIsNumeric() {
	      return decimalIsNumeric(beginWcDayMwh,WC_DAY_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayMwhString() {
            return getPackedString(beginWcDayMwh,WC_DAY_MWH_LEN);
         }
   protected static final int WC_DAY_MWH_LEN = 9;
   protected static final int WC_DAY_MWH_SCALE = 4;
  	/**
	 * 	serializeWcDayMwh
	 */
	protected void serializeWcDayMwh(BigDecimal wcDayMwh) {
		   putDecimal(beginWcDayMwh,wcDayMwh,WC_DAY_MWH_LEN,WC_DAY_MWH_SCALE,true);
		 localWcDayMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayMwh,WC_DAY_MWH_LEN,WC_DAY_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayMwh", beginWcDayMwh,WC_DAY_MWH_LEN);
     }
   	}
        int localWcDayGjCounter = -1;
        public boolean isWcDayGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayGjCounter != sharedCounter;
           localWcDayGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayGjIsNumeric() {
	      return decimalIsNumeric(beginWcDayGj,WC_DAY_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayGjString() {
            return getPackedString(beginWcDayGj,WC_DAY_GJ_LEN);
         }
   protected static final int WC_DAY_GJ_LEN = 9;
   protected static final int WC_DAY_GJ_SCALE = 4;
  	/**
	 * 	serializeWcDayGj
	 */
	protected void serializeWcDayGj(BigDecimal wcDayGj) {
		   putDecimal(beginWcDayGj,wcDayGj,WC_DAY_GJ_LEN,WC_DAY_GJ_SCALE,true);
		 localWcDayGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayGj,WC_DAY_GJ_LEN,WC_DAY_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayGj", beginWcDayGj,WC_DAY_GJ_LEN);
     }
   	}
        int localWcDayDayCounter = -1;
        public boolean isWcDayDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcDayDayCounter != sharedCounter;
           localWcDayDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcDayDayIsNumeric() {
	      return decimalIsNumeric(beginWcDayDay,WC_DAY_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcDayDayString() {
            return getPackedString(beginWcDayDay,WC_DAY_DAY_LEN);
         }
   protected static final int WC_DAY_DAY_LEN = 9;
   protected static final int WC_DAY_DAY_SCALE = 4;
  	/**
	 * 	serializeWcDayDay
	 */
	protected void serializeWcDayDay(BigDecimal wcDayDay) {
		   putDecimal(beginWcDayDay,wcDayDay,WC_DAY_DAY_LEN,WC_DAY_DAY_SCALE,true);
		 localWcDayDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcDayDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcDayDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcDayDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcDayDay,WC_DAY_DAY_LEN,WC_DAY_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcDayDay", beginWcDayDay,WC_DAY_DAY_LEN);
     }
   	}




}
  
