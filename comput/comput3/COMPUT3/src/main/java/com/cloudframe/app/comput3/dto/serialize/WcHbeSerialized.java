package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcHbeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcHbeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcHbeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_HBE_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcGjBbl;
            protected  int beginWcGjKb;
            protected  int beginWcGjLit;
            protected  int beginWcGjM3;
            protected  int beginWcGjUsg;
            protected  int beginWcGjUkg;
            protected  int beginWcGjMmb;
            protected  int beginWcGjGbt;
            protected  int beginWcGjThm;
            protected  int beginWcGjMwh;
            protected  int beginWcGjGj;
            protected  int beginWcGjDay;
	
	/**
	* Constructor for WcHbeSerialized
	**/
    public WcHbeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcHbeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcHbeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcHbeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1080); // serialize this field at offset 1080 by default 
    }
    
	/**
	* sets parent for this WcHbeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1080 by default
    }    
	/**
	* initializes the field in WcHbeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_HBE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcGjBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcGjKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcGjLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcGjM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcGjUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcGjUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcGjMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcGjGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcGjThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcGjMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcGjGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcGjDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcGjBblCounter = -1;
        public boolean isWcGjBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjBblCounter != sharedCounter;
           localWcGjBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjBblIsNumeric() {
	      return decimalIsNumeric(beginWcGjBbl,WC_GJ_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjBblString() {
            return getPackedString(beginWcGjBbl,WC_GJ_BBL_LEN);
         }
   protected static final int WC_GJ_BBL_LEN = 9;
   protected static final int WC_GJ_BBL_SCALE = 4;
  	/**
	 * 	serializeWcGjBbl
	 */
	protected void serializeWcGjBbl(BigDecimal wcGjBbl) {
		   putDecimal(beginWcGjBbl,wcGjBbl,WC_GJ_BBL_LEN,WC_GJ_BBL_SCALE,true);
		 localWcGjBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjBbl,WC_GJ_BBL_LEN,WC_GJ_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjBbl", beginWcGjBbl,WC_GJ_BBL_LEN);
     }
   	}
        int localWcGjKbCounter = -1;
        public boolean isWcGjKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjKbCounter != sharedCounter;
           localWcGjKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjKbIsNumeric() {
	      return decimalIsNumeric(beginWcGjKb,WC_GJ_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjKbString() {
            return getPackedString(beginWcGjKb,WC_GJ_KB_LEN);
         }
   protected static final int WC_GJ_KB_LEN = 9;
   protected static final int WC_GJ_KB_SCALE = 4;
  	/**
	 * 	serializeWcGjKb
	 */
	protected void serializeWcGjKb(BigDecimal wcGjKb) {
		   putDecimal(beginWcGjKb,wcGjKb,WC_GJ_KB_LEN,WC_GJ_KB_SCALE,true);
		 localWcGjKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjKb,WC_GJ_KB_LEN,WC_GJ_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjKb", beginWcGjKb,WC_GJ_KB_LEN);
     }
   	}
        int localWcGjLitCounter = -1;
        public boolean isWcGjLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjLitCounter != sharedCounter;
           localWcGjLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjLitIsNumeric() {
	      return decimalIsNumeric(beginWcGjLit,WC_GJ_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjLitString() {
            return getPackedString(beginWcGjLit,WC_GJ_LIT_LEN);
         }
   protected static final int WC_GJ_LIT_LEN = 9;
   protected static final int WC_GJ_LIT_SCALE = 4;
  	/**
	 * 	serializeWcGjLit
	 */
	protected void serializeWcGjLit(BigDecimal wcGjLit) {
		   putDecimal(beginWcGjLit,wcGjLit,WC_GJ_LIT_LEN,WC_GJ_LIT_SCALE,true);
		 localWcGjLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjLit,WC_GJ_LIT_LEN,WC_GJ_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjLit", beginWcGjLit,WC_GJ_LIT_LEN);
     }
   	}
        int localWcGjM3Counter = -1;
        public boolean isWcGjM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjM3Counter != sharedCounter;
           localWcGjM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjM3IsNumeric() {
	      return decimalIsNumeric(beginWcGjM3,WC_GJ_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjM3String() {
            return getPackedString(beginWcGjM3,WC_GJ_M_3_LEN);
         }
   protected static final int WC_GJ_M_3_LEN = 9;
   protected static final int WC_GJ_M_3_SCALE = 4;
  	/**
	 * 	serializeWcGjM3
	 */
	protected void serializeWcGjM3(BigDecimal wcGjM3) {
		   putDecimal(beginWcGjM3,wcGjM3,WC_GJ_M_3_LEN,WC_GJ_M_3_SCALE,true);
		 localWcGjM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjM3,WC_GJ_M_3_LEN,WC_GJ_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjM3", beginWcGjM3,WC_GJ_M_3_LEN);
     }
   	}
        int localWcGjUsgCounter = -1;
        public boolean isWcGjUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjUsgCounter != sharedCounter;
           localWcGjUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjUsgIsNumeric() {
	      return decimalIsNumeric(beginWcGjUsg,WC_GJ_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjUsgString() {
            return getPackedString(beginWcGjUsg,WC_GJ_USG_LEN);
         }
   protected static final int WC_GJ_USG_LEN = 9;
   protected static final int WC_GJ_USG_SCALE = 4;
  	/**
	 * 	serializeWcGjUsg
	 */
	protected void serializeWcGjUsg(BigDecimal wcGjUsg) {
		   putDecimal(beginWcGjUsg,wcGjUsg,WC_GJ_USG_LEN,WC_GJ_USG_SCALE,true);
		 localWcGjUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjUsg,WC_GJ_USG_LEN,WC_GJ_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjUsg", beginWcGjUsg,WC_GJ_USG_LEN);
     }
   	}
        int localWcGjUkgCounter = -1;
        public boolean isWcGjUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjUkgCounter != sharedCounter;
           localWcGjUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjUkgIsNumeric() {
	      return decimalIsNumeric(beginWcGjUkg,WC_GJ_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjUkgString() {
            return getPackedString(beginWcGjUkg,WC_GJ_UKG_LEN);
         }
   protected static final int WC_GJ_UKG_LEN = 9;
   protected static final int WC_GJ_UKG_SCALE = 4;
  	/**
	 * 	serializeWcGjUkg
	 */
	protected void serializeWcGjUkg(BigDecimal wcGjUkg) {
		   putDecimal(beginWcGjUkg,wcGjUkg,WC_GJ_UKG_LEN,WC_GJ_UKG_SCALE,true);
		 localWcGjUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjUkg,WC_GJ_UKG_LEN,WC_GJ_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjUkg", beginWcGjUkg,WC_GJ_UKG_LEN);
     }
   	}
        int localWcGjMmbCounter = -1;
        public boolean isWcGjMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjMmbCounter != sharedCounter;
           localWcGjMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjMmbIsNumeric() {
	      return decimalIsNumeric(beginWcGjMmb,WC_GJ_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjMmbString() {
            return getPackedString(beginWcGjMmb,WC_GJ_MMB_LEN);
         }
   protected static final int WC_GJ_MMB_LEN = 9;
   protected static final int WC_GJ_MMB_SCALE = 4;
  	/**
	 * 	serializeWcGjMmb
	 */
	protected void serializeWcGjMmb(BigDecimal wcGjMmb) {
		   putDecimal(beginWcGjMmb,wcGjMmb,WC_GJ_MMB_LEN,WC_GJ_MMB_SCALE,true);
		 localWcGjMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjMmb,WC_GJ_MMB_LEN,WC_GJ_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjMmb", beginWcGjMmb,WC_GJ_MMB_LEN);
     }
   	}
        int localWcGjGbtCounter = -1;
        public boolean isWcGjGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjGbtCounter != sharedCounter;
           localWcGjGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjGbtIsNumeric() {
	      return decimalIsNumeric(beginWcGjGbt,WC_GJ_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjGbtString() {
            return getPackedString(beginWcGjGbt,WC_GJ_GBT_LEN);
         }
   protected static final int WC_GJ_GBT_LEN = 9;
   protected static final int WC_GJ_GBT_SCALE = 4;
  	/**
	 * 	serializeWcGjGbt
	 */
	protected void serializeWcGjGbt(BigDecimal wcGjGbt) {
		   putDecimal(beginWcGjGbt,wcGjGbt,WC_GJ_GBT_LEN,WC_GJ_GBT_SCALE,true);
		 localWcGjGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjGbt,WC_GJ_GBT_LEN,WC_GJ_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjGbt", beginWcGjGbt,WC_GJ_GBT_LEN);
     }
   	}
        int localWcGjThmCounter = -1;
        public boolean isWcGjThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjThmCounter != sharedCounter;
           localWcGjThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjThmIsNumeric() {
	      return decimalIsNumeric(beginWcGjThm,WC_GJ_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjThmString() {
            return getPackedString(beginWcGjThm,WC_GJ_THM_LEN);
         }
   protected static final int WC_GJ_THM_LEN = 9;
   protected static final int WC_GJ_THM_SCALE = 4;
  	/**
	 * 	serializeWcGjThm
	 */
	protected void serializeWcGjThm(BigDecimal wcGjThm) {
		   putDecimal(beginWcGjThm,wcGjThm,WC_GJ_THM_LEN,WC_GJ_THM_SCALE,true);
		 localWcGjThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjThm,WC_GJ_THM_LEN,WC_GJ_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjThm", beginWcGjThm,WC_GJ_THM_LEN);
     }
   	}
        int localWcGjMwhCounter = -1;
        public boolean isWcGjMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjMwhCounter != sharedCounter;
           localWcGjMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjMwhIsNumeric() {
	      return decimalIsNumeric(beginWcGjMwh,WC_GJ_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjMwhString() {
            return getPackedString(beginWcGjMwh,WC_GJ_MWH_LEN);
         }
   protected static final int WC_GJ_MWH_LEN = 9;
   protected static final int WC_GJ_MWH_SCALE = 4;
  	/**
	 * 	serializeWcGjMwh
	 */
	protected void serializeWcGjMwh(BigDecimal wcGjMwh) {
		   putDecimal(beginWcGjMwh,wcGjMwh,WC_GJ_MWH_LEN,WC_GJ_MWH_SCALE,true);
		 localWcGjMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjMwh,WC_GJ_MWH_LEN,WC_GJ_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjMwh", beginWcGjMwh,WC_GJ_MWH_LEN);
     }
   	}
        int localWcGjGjCounter = -1;
        public boolean isWcGjGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjGjCounter != sharedCounter;
           localWcGjGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjGjIsNumeric() {
	      return decimalIsNumeric(beginWcGjGj,WC_GJ_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjGjString() {
            return getPackedString(beginWcGjGj,WC_GJ_GJ_LEN);
         }
   protected static final int WC_GJ_GJ_LEN = 9;
   protected static final int WC_GJ_GJ_SCALE = 4;
  	/**
	 * 	serializeWcGjGj
	 */
	protected void serializeWcGjGj(BigDecimal wcGjGj) {
		   putDecimal(beginWcGjGj,wcGjGj,WC_GJ_GJ_LEN,WC_GJ_GJ_SCALE,true);
		 localWcGjGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjGj,WC_GJ_GJ_LEN,WC_GJ_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjGj", beginWcGjGj,WC_GJ_GJ_LEN);
     }
   	}
        int localWcGjDayCounter = -1;
        public boolean isWcGjDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcGjDayCounter != sharedCounter;
           localWcGjDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcGjDayIsNumeric() {
	      return decimalIsNumeric(beginWcGjDay,WC_GJ_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcGjDayString() {
            return getPackedString(beginWcGjDay,WC_GJ_DAY_LEN);
         }
   protected static final int WC_GJ_DAY_LEN = 9;
   protected static final int WC_GJ_DAY_SCALE = 4;
  	/**
	 * 	serializeWcGjDay
	 */
	protected void serializeWcGjDay(BigDecimal wcGjDay) {
		   putDecimal(beginWcGjDay,wcGjDay,WC_GJ_DAY_LEN,WC_GJ_DAY_SCALE,true);
		 localWcGjDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcGjDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcGjDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcGjDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcGjDay,WC_GJ_DAY_LEN,WC_GJ_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcGjDay", beginWcGjDay,WC_GJ_DAY_LEN);
     }
   	}




}
  
