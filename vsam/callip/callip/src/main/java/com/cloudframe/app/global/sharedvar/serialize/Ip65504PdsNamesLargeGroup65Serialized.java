package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup65Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup65Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup65Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_65_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1985S;
            protected  int beginIp65504P1985L;
            protected  int beginIp65504P1986S;
            protected  int beginIp65504P1986L;
            protected  int beginIp65504P1987S;
            protected  int beginIp65504P1987L;
            protected  int beginIp65504P1988S;
            protected  int beginIp65504P1988L;
            protected  int beginIp65504P1989S;
            protected  int beginIp65504P1989L;
            protected  int beginIp65504P1990S;
            protected  int beginIp65504P1990L;
            protected  int beginIp65504P1991S;
            protected  int beginIp65504P1991L;
            protected  int beginIp65504P1992S;
            protected  int beginIp65504P1992L;
            protected  int beginIp65504P1993S;
            protected  int beginIp65504P1993L;
            protected  int beginIp65504P1994S;
            protected  int beginIp65504P1994L;
            protected  int beginIp65504P1995S;
            protected  int beginIp65504P1995L;
            protected  int beginIp65504P1996S;
            protected  int beginIp65504P1996L;
            protected  int beginIp65504P1997S;
            protected  int beginIp65504P1997L;
            protected  int beginIp65504P1998S;
            protected  int beginIp65504P1998L;
            protected  int beginIp65504P1999S;
            protected  int beginIp65504P1999L;
            protected  int beginIp65504P2000S;
            protected  int beginIp65504P2000L;
            protected  int beginIp65504P2001S;
            protected  int beginIp65504P2001L;
            protected  int beginIp65504P2002S;
            protected  int beginIp65504P2002L;
            protected  int beginIp65504P2003S;
            protected  int beginIp65504P2003L;
            protected  int beginIp65504P2004S;
            protected  int beginIp65504P2004L;
            protected  int beginIp65504P2005S;
            protected  int beginIp65504P2005L;
            protected  int beginIp65504P2006S;
            protected  int beginIp65504P2006L;
            protected  int beginIp65504P2007S;
            protected  int beginIp65504P2007L;
            protected  int beginIp65504P2008S;
            protected  int beginIp65504P2008L;
            protected  int beginIp65504P2009S;
            protected  int beginIp65504P2009L;
            protected  int beginIp65504P2010S;
            protected  int beginIp65504P2010L;
            protected  int beginIp65504P2011S;
            protected  int beginIp65504P2011L;
            protected  int beginIp65504P2012S;
            protected  int beginIp65504P2012L;
            protected  int beginIp65504P2013S;
            protected  int beginIp65504P2013L;
            protected  int beginIp65504P2014S;
            protected  int beginIp65504P2014L;
            protected  int beginIp65504P2015S;
            protected  int beginIp65504P2015L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup65Serialized
	**/
    public Ip65504PdsNamesLargeGroup65Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup65Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup65Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup65Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15868); // serialize this field at offset 15868 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup65Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15868 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup65Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_65_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1985S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1985L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1986S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1986L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1987S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1987L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1988S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1988L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1989S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1989L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1990S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1990L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1991S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1991L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1992S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1992L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1993S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1993L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1994S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1994L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1995S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1995L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1996S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1996L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1997S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1997L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1998S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1998L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1999S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1999L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2000S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2000L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2001S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2001L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2002S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2002L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2003S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2003L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2004S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2004L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2005S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2005L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2006S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2006L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2007S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2007L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2008S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2008L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2009S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2009L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2010S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2010L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2011S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2011L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2012S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2012L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2013S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2013L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2014S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2014L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2015S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2015L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1985SCounter = -1;
         public boolean isIp65504P1985SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1985SCounter != sharedCounter;
            localIp65504P1985SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1985_S_LEN = 2;
  	/**
	 * serializeIp65504P1985S
	 */
	protected void serializeIp65504P1985S(short ip65504P1985S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1985S,IP_65504_P_1985_S_LEN)
                  ,beginIp65504P1985S
                  ,IP_65504_P_1985_S_LEN
                 );
            localIp65504P1985SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1985SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1985S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1985S() {	 
			return (getShort(beginIp65504P1985S));
   	}
         int localIp65504P1985LCounter = -1;
         public boolean isIp65504P1985LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1985LCounter != sharedCounter;
            localIp65504P1985LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1985_L_LEN = 2;
  	/**
	 * serializeIp65504P1985L
	 */
	protected void serializeIp65504P1985L(short ip65504P1985L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1985L,IP_65504_P_1985_L_LEN)
                  ,beginIp65504P1985L
                  ,IP_65504_P_1985_L_LEN
                 );
            localIp65504P1985LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1985LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1985L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1985L() {	 
			return (getShort(beginIp65504P1985L));
   	}
         int localIp65504P1986SCounter = -1;
         public boolean isIp65504P1986SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1986SCounter != sharedCounter;
            localIp65504P1986SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1986_S_LEN = 2;
  	/**
	 * serializeIp65504P1986S
	 */
	protected void serializeIp65504P1986S(short ip65504P1986S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1986S,IP_65504_P_1986_S_LEN)
                  ,beginIp65504P1986S
                  ,IP_65504_P_1986_S_LEN
                 );
            localIp65504P1986SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1986SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1986S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1986S() {	 
			return (getShort(beginIp65504P1986S));
   	}
         int localIp65504P1986LCounter = -1;
         public boolean isIp65504P1986LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1986LCounter != sharedCounter;
            localIp65504P1986LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1986_L_LEN = 2;
  	/**
	 * serializeIp65504P1986L
	 */
	protected void serializeIp65504P1986L(short ip65504P1986L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1986L,IP_65504_P_1986_L_LEN)
                  ,beginIp65504P1986L
                  ,IP_65504_P_1986_L_LEN
                 );
            localIp65504P1986LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1986LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1986L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1986L() {	 
			return (getShort(beginIp65504P1986L));
   	}
         int localIp65504P1987SCounter = -1;
         public boolean isIp65504P1987SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1987SCounter != sharedCounter;
            localIp65504P1987SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1987_S_LEN = 2;
  	/**
	 * serializeIp65504P1987S
	 */
	protected void serializeIp65504P1987S(short ip65504P1987S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1987S,IP_65504_P_1987_S_LEN)
                  ,beginIp65504P1987S
                  ,IP_65504_P_1987_S_LEN
                 );
            localIp65504P1987SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1987SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1987S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1987S() {	 
			return (getShort(beginIp65504P1987S));
   	}
         int localIp65504P1987LCounter = -1;
         public boolean isIp65504P1987LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1987LCounter != sharedCounter;
            localIp65504P1987LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1987_L_LEN = 2;
  	/**
	 * serializeIp65504P1987L
	 */
	protected void serializeIp65504P1987L(short ip65504P1987L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1987L,IP_65504_P_1987_L_LEN)
                  ,beginIp65504P1987L
                  ,IP_65504_P_1987_L_LEN
                 );
            localIp65504P1987LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1987LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1987L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1987L() {	 
			return (getShort(beginIp65504P1987L));
   	}
         int localIp65504P1988SCounter = -1;
         public boolean isIp65504P1988SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1988SCounter != sharedCounter;
            localIp65504P1988SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1988_S_LEN = 2;
  	/**
	 * serializeIp65504P1988S
	 */
	protected void serializeIp65504P1988S(short ip65504P1988S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1988S,IP_65504_P_1988_S_LEN)
                  ,beginIp65504P1988S
                  ,IP_65504_P_1988_S_LEN
                 );
            localIp65504P1988SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1988SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1988S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1988S() {	 
			return (getShort(beginIp65504P1988S));
   	}
         int localIp65504P1988LCounter = -1;
         public boolean isIp65504P1988LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1988LCounter != sharedCounter;
            localIp65504P1988LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1988_L_LEN = 2;
  	/**
	 * serializeIp65504P1988L
	 */
	protected void serializeIp65504P1988L(short ip65504P1988L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1988L,IP_65504_P_1988_L_LEN)
                  ,beginIp65504P1988L
                  ,IP_65504_P_1988_L_LEN
                 );
            localIp65504P1988LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1988LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1988L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1988L() {	 
			return (getShort(beginIp65504P1988L));
   	}
         int localIp65504P1989SCounter = -1;
         public boolean isIp65504P1989SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1989SCounter != sharedCounter;
            localIp65504P1989SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1989_S_LEN = 2;
  	/**
	 * serializeIp65504P1989S
	 */
	protected void serializeIp65504P1989S(short ip65504P1989S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1989S,IP_65504_P_1989_S_LEN)
                  ,beginIp65504P1989S
                  ,IP_65504_P_1989_S_LEN
                 );
            localIp65504P1989SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1989SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1989S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1989S() {	 
			return (getShort(beginIp65504P1989S));
   	}
         int localIp65504P1989LCounter = -1;
         public boolean isIp65504P1989LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1989LCounter != sharedCounter;
            localIp65504P1989LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1989_L_LEN = 2;
  	/**
	 * serializeIp65504P1989L
	 */
	protected void serializeIp65504P1989L(short ip65504P1989L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1989L,IP_65504_P_1989_L_LEN)
                  ,beginIp65504P1989L
                  ,IP_65504_P_1989_L_LEN
                 );
            localIp65504P1989LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1989LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1989L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1989L() {	 
			return (getShort(beginIp65504P1989L));
   	}
         int localIp65504P1990SCounter = -1;
         public boolean isIp65504P1990SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1990SCounter != sharedCounter;
            localIp65504P1990SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1990_S_LEN = 2;
  	/**
	 * serializeIp65504P1990S
	 */
	protected void serializeIp65504P1990S(short ip65504P1990S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1990S,IP_65504_P_1990_S_LEN)
                  ,beginIp65504P1990S
                  ,IP_65504_P_1990_S_LEN
                 );
            localIp65504P1990SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1990SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1990S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1990S() {	 
			return (getShort(beginIp65504P1990S));
   	}
         int localIp65504P1990LCounter = -1;
         public boolean isIp65504P1990LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1990LCounter != sharedCounter;
            localIp65504P1990LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1990_L_LEN = 2;
  	/**
	 * serializeIp65504P1990L
	 */
	protected void serializeIp65504P1990L(short ip65504P1990L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1990L,IP_65504_P_1990_L_LEN)
                  ,beginIp65504P1990L
                  ,IP_65504_P_1990_L_LEN
                 );
            localIp65504P1990LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1990LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1990L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1990L() {	 
			return (getShort(beginIp65504P1990L));
   	}
         int localIp65504P1991SCounter = -1;
         public boolean isIp65504P1991SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1991SCounter != sharedCounter;
            localIp65504P1991SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1991_S_LEN = 2;
  	/**
	 * serializeIp65504P1991S
	 */
	protected void serializeIp65504P1991S(short ip65504P1991S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1991S,IP_65504_P_1991_S_LEN)
                  ,beginIp65504P1991S
                  ,IP_65504_P_1991_S_LEN
                 );
            localIp65504P1991SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1991SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1991S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1991S() {	 
			return (getShort(beginIp65504P1991S));
   	}
         int localIp65504P1991LCounter = -1;
         public boolean isIp65504P1991LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1991LCounter != sharedCounter;
            localIp65504P1991LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1991_L_LEN = 2;
  	/**
	 * serializeIp65504P1991L
	 */
	protected void serializeIp65504P1991L(short ip65504P1991L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1991L,IP_65504_P_1991_L_LEN)
                  ,beginIp65504P1991L
                  ,IP_65504_P_1991_L_LEN
                 );
            localIp65504P1991LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1991LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1991L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1991L() {	 
			return (getShort(beginIp65504P1991L));
   	}
         int localIp65504P1992SCounter = -1;
         public boolean isIp65504P1992SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1992SCounter != sharedCounter;
            localIp65504P1992SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1992_S_LEN = 2;
  	/**
	 * serializeIp65504P1992S
	 */
	protected void serializeIp65504P1992S(short ip65504P1992S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1992S,IP_65504_P_1992_S_LEN)
                  ,beginIp65504P1992S
                  ,IP_65504_P_1992_S_LEN
                 );
            localIp65504P1992SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1992SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1992S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1992S() {	 
			return (getShort(beginIp65504P1992S));
   	}
         int localIp65504P1992LCounter = -1;
         public boolean isIp65504P1992LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1992LCounter != sharedCounter;
            localIp65504P1992LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1992_L_LEN = 2;
  	/**
	 * serializeIp65504P1992L
	 */
	protected void serializeIp65504P1992L(short ip65504P1992L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1992L,IP_65504_P_1992_L_LEN)
                  ,beginIp65504P1992L
                  ,IP_65504_P_1992_L_LEN
                 );
            localIp65504P1992LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1992LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1992L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1992L() {	 
			return (getShort(beginIp65504P1992L));
   	}
         int localIp65504P1993SCounter = -1;
         public boolean isIp65504P1993SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1993SCounter != sharedCounter;
            localIp65504P1993SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1993_S_LEN = 2;
  	/**
	 * serializeIp65504P1993S
	 */
	protected void serializeIp65504P1993S(short ip65504P1993S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1993S,IP_65504_P_1993_S_LEN)
                  ,beginIp65504P1993S
                  ,IP_65504_P_1993_S_LEN
                 );
            localIp65504P1993SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1993SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1993S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1993S() {	 
			return (getShort(beginIp65504P1993S));
   	}
         int localIp65504P1993LCounter = -1;
         public boolean isIp65504P1993LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1993LCounter != sharedCounter;
            localIp65504P1993LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1993_L_LEN = 2;
  	/**
	 * serializeIp65504P1993L
	 */
	protected void serializeIp65504P1993L(short ip65504P1993L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1993L,IP_65504_P_1993_L_LEN)
                  ,beginIp65504P1993L
                  ,IP_65504_P_1993_L_LEN
                 );
            localIp65504P1993LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1993LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1993L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1993L() {	 
			return (getShort(beginIp65504P1993L));
   	}
         int localIp65504P1994SCounter = -1;
         public boolean isIp65504P1994SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1994SCounter != sharedCounter;
            localIp65504P1994SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1994_S_LEN = 2;
  	/**
	 * serializeIp65504P1994S
	 */
	protected void serializeIp65504P1994S(short ip65504P1994S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1994S,IP_65504_P_1994_S_LEN)
                  ,beginIp65504P1994S
                  ,IP_65504_P_1994_S_LEN
                 );
            localIp65504P1994SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1994SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1994S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1994S() {	 
			return (getShort(beginIp65504P1994S));
   	}
         int localIp65504P1994LCounter = -1;
         public boolean isIp65504P1994LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1994LCounter != sharedCounter;
            localIp65504P1994LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1994_L_LEN = 2;
  	/**
	 * serializeIp65504P1994L
	 */
	protected void serializeIp65504P1994L(short ip65504P1994L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1994L,IP_65504_P_1994_L_LEN)
                  ,beginIp65504P1994L
                  ,IP_65504_P_1994_L_LEN
                 );
            localIp65504P1994LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1994LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1994L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1994L() {	 
			return (getShort(beginIp65504P1994L));
   	}
         int localIp65504P1995SCounter = -1;
         public boolean isIp65504P1995SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1995SCounter != sharedCounter;
            localIp65504P1995SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1995_S_LEN = 2;
  	/**
	 * serializeIp65504P1995S
	 */
	protected void serializeIp65504P1995S(short ip65504P1995S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1995S,IP_65504_P_1995_S_LEN)
                  ,beginIp65504P1995S
                  ,IP_65504_P_1995_S_LEN
                 );
            localIp65504P1995SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1995SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1995S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1995S() {	 
			return (getShort(beginIp65504P1995S));
   	}
         int localIp65504P1995LCounter = -1;
         public boolean isIp65504P1995LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1995LCounter != sharedCounter;
            localIp65504P1995LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1995_L_LEN = 2;
  	/**
	 * serializeIp65504P1995L
	 */
	protected void serializeIp65504P1995L(short ip65504P1995L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1995L,IP_65504_P_1995_L_LEN)
                  ,beginIp65504P1995L
                  ,IP_65504_P_1995_L_LEN
                 );
            localIp65504P1995LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1995LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1995L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1995L() {	 
			return (getShort(beginIp65504P1995L));
   	}
         int localIp65504P1996SCounter = -1;
         public boolean isIp65504P1996SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1996SCounter != sharedCounter;
            localIp65504P1996SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1996_S_LEN = 2;
  	/**
	 * serializeIp65504P1996S
	 */
	protected void serializeIp65504P1996S(short ip65504P1996S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1996S,IP_65504_P_1996_S_LEN)
                  ,beginIp65504P1996S
                  ,IP_65504_P_1996_S_LEN
                 );
            localIp65504P1996SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1996SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1996S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1996S() {	 
			return (getShort(beginIp65504P1996S));
   	}
         int localIp65504P1996LCounter = -1;
         public boolean isIp65504P1996LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1996LCounter != sharedCounter;
            localIp65504P1996LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1996_L_LEN = 2;
  	/**
	 * serializeIp65504P1996L
	 */
	protected void serializeIp65504P1996L(short ip65504P1996L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1996L,IP_65504_P_1996_L_LEN)
                  ,beginIp65504P1996L
                  ,IP_65504_P_1996_L_LEN
                 );
            localIp65504P1996LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1996LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1996L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1996L() {	 
			return (getShort(beginIp65504P1996L));
   	}
         int localIp65504P1997SCounter = -1;
         public boolean isIp65504P1997SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1997SCounter != sharedCounter;
            localIp65504P1997SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1997_S_LEN = 2;
  	/**
	 * serializeIp65504P1997S
	 */
	protected void serializeIp65504P1997S(short ip65504P1997S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1997S,IP_65504_P_1997_S_LEN)
                  ,beginIp65504P1997S
                  ,IP_65504_P_1997_S_LEN
                 );
            localIp65504P1997SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1997SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1997S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1997S() {	 
			return (getShort(beginIp65504P1997S));
   	}
         int localIp65504P1997LCounter = -1;
         public boolean isIp65504P1997LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1997LCounter != sharedCounter;
            localIp65504P1997LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1997_L_LEN = 2;
  	/**
	 * serializeIp65504P1997L
	 */
	protected void serializeIp65504P1997L(short ip65504P1997L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1997L,IP_65504_P_1997_L_LEN)
                  ,beginIp65504P1997L
                  ,IP_65504_P_1997_L_LEN
                 );
            localIp65504P1997LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1997LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1997L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1997L() {	 
			return (getShort(beginIp65504P1997L));
   	}
         int localIp65504P1998SCounter = -1;
         public boolean isIp65504P1998SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1998SCounter != sharedCounter;
            localIp65504P1998SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1998_S_LEN = 2;
  	/**
	 * serializeIp65504P1998S
	 */
	protected void serializeIp65504P1998S(short ip65504P1998S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1998S,IP_65504_P_1998_S_LEN)
                  ,beginIp65504P1998S
                  ,IP_65504_P_1998_S_LEN
                 );
            localIp65504P1998SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1998SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1998S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1998S() {	 
			return (getShort(beginIp65504P1998S));
   	}
         int localIp65504P1998LCounter = -1;
         public boolean isIp65504P1998LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1998LCounter != sharedCounter;
            localIp65504P1998LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1998_L_LEN = 2;
  	/**
	 * serializeIp65504P1998L
	 */
	protected void serializeIp65504P1998L(short ip65504P1998L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1998L,IP_65504_P_1998_L_LEN)
                  ,beginIp65504P1998L
                  ,IP_65504_P_1998_L_LEN
                 );
            localIp65504P1998LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1998LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1998L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1998L() {	 
			return (getShort(beginIp65504P1998L));
   	}
         int localIp65504P1999SCounter = -1;
         public boolean isIp65504P1999SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1999SCounter != sharedCounter;
            localIp65504P1999SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1999_S_LEN = 2;
  	/**
	 * serializeIp65504P1999S
	 */
	protected void serializeIp65504P1999S(short ip65504P1999S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1999S,IP_65504_P_1999_S_LEN)
                  ,beginIp65504P1999S
                  ,IP_65504_P_1999_S_LEN
                 );
            localIp65504P1999SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1999SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1999S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1999S() {	 
			return (getShort(beginIp65504P1999S));
   	}
         int localIp65504P1999LCounter = -1;
         public boolean isIp65504P1999LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1999LCounter != sharedCounter;
            localIp65504P1999LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1999_L_LEN = 2;
  	/**
	 * serializeIp65504P1999L
	 */
	protected void serializeIp65504P1999L(short ip65504P1999L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1999L,IP_65504_P_1999_L_LEN)
                  ,beginIp65504P1999L
                  ,IP_65504_P_1999_L_LEN
                 );
            localIp65504P1999LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1999LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1999L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1999L() {	 
			return (getShort(beginIp65504P1999L));
   	}
         int localIp65504P2000SCounter = -1;
         public boolean isIp65504P2000SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2000SCounter != sharedCounter;
            localIp65504P2000SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2000_S_LEN = 2;
  	/**
	 * serializeIp65504P2000S
	 */
	protected void serializeIp65504P2000S(short ip65504P2000S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2000S,IP_65504_P_2000_S_LEN)
                  ,beginIp65504P2000S
                  ,IP_65504_P_2000_S_LEN
                 );
            localIp65504P2000SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2000SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2000S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2000S() {	 
			return (getShort(beginIp65504P2000S));
   	}
         int localIp65504P2000LCounter = -1;
         public boolean isIp65504P2000LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2000LCounter != sharedCounter;
            localIp65504P2000LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2000_L_LEN = 2;
  	/**
	 * serializeIp65504P2000L
	 */
	protected void serializeIp65504P2000L(short ip65504P2000L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2000L,IP_65504_P_2000_L_LEN)
                  ,beginIp65504P2000L
                  ,IP_65504_P_2000_L_LEN
                 );
            localIp65504P2000LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2000LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2000L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2000L() {	 
			return (getShort(beginIp65504P2000L));
   	}
         int localIp65504P2001SCounter = -1;
         public boolean isIp65504P2001SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2001SCounter != sharedCounter;
            localIp65504P2001SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2001_S_LEN = 2;
  	/**
	 * serializeIp65504P2001S
	 */
	protected void serializeIp65504P2001S(short ip65504P2001S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2001S,IP_65504_P_2001_S_LEN)
                  ,beginIp65504P2001S
                  ,IP_65504_P_2001_S_LEN
                 );
            localIp65504P2001SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2001SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2001S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2001S() {	 
			return (getShort(beginIp65504P2001S));
   	}
         int localIp65504P2001LCounter = -1;
         public boolean isIp65504P2001LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2001LCounter != sharedCounter;
            localIp65504P2001LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2001_L_LEN = 2;
  	/**
	 * serializeIp65504P2001L
	 */
	protected void serializeIp65504P2001L(short ip65504P2001L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2001L,IP_65504_P_2001_L_LEN)
                  ,beginIp65504P2001L
                  ,IP_65504_P_2001_L_LEN
                 );
            localIp65504P2001LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2001LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2001L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2001L() {	 
			return (getShort(beginIp65504P2001L));
   	}
         int localIp65504P2002SCounter = -1;
         public boolean isIp65504P2002SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2002SCounter != sharedCounter;
            localIp65504P2002SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2002_S_LEN = 2;
  	/**
	 * serializeIp65504P2002S
	 */
	protected void serializeIp65504P2002S(short ip65504P2002S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2002S,IP_65504_P_2002_S_LEN)
                  ,beginIp65504P2002S
                  ,IP_65504_P_2002_S_LEN
                 );
            localIp65504P2002SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2002SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2002S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2002S() {	 
			return (getShort(beginIp65504P2002S));
   	}
         int localIp65504P2002LCounter = -1;
         public boolean isIp65504P2002LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2002LCounter != sharedCounter;
            localIp65504P2002LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2002_L_LEN = 2;
  	/**
	 * serializeIp65504P2002L
	 */
	protected void serializeIp65504P2002L(short ip65504P2002L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2002L,IP_65504_P_2002_L_LEN)
                  ,beginIp65504P2002L
                  ,IP_65504_P_2002_L_LEN
                 );
            localIp65504P2002LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2002LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2002L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2002L() {	 
			return (getShort(beginIp65504P2002L));
   	}
         int localIp65504P2003SCounter = -1;
         public boolean isIp65504P2003SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2003SCounter != sharedCounter;
            localIp65504P2003SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2003_S_LEN = 2;
  	/**
	 * serializeIp65504P2003S
	 */
	protected void serializeIp65504P2003S(short ip65504P2003S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2003S,IP_65504_P_2003_S_LEN)
                  ,beginIp65504P2003S
                  ,IP_65504_P_2003_S_LEN
                 );
            localIp65504P2003SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2003SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2003S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2003S() {	 
			return (getShort(beginIp65504P2003S));
   	}
         int localIp65504P2003LCounter = -1;
         public boolean isIp65504P2003LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2003LCounter != sharedCounter;
            localIp65504P2003LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2003_L_LEN = 2;
  	/**
	 * serializeIp65504P2003L
	 */
	protected void serializeIp65504P2003L(short ip65504P2003L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2003L,IP_65504_P_2003_L_LEN)
                  ,beginIp65504P2003L
                  ,IP_65504_P_2003_L_LEN
                 );
            localIp65504P2003LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2003LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2003L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2003L() {	 
			return (getShort(beginIp65504P2003L));
   	}
         int localIp65504P2004SCounter = -1;
         public boolean isIp65504P2004SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2004SCounter != sharedCounter;
            localIp65504P2004SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2004_S_LEN = 2;
  	/**
	 * serializeIp65504P2004S
	 */
	protected void serializeIp65504P2004S(short ip65504P2004S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2004S,IP_65504_P_2004_S_LEN)
                  ,beginIp65504P2004S
                  ,IP_65504_P_2004_S_LEN
                 );
            localIp65504P2004SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2004SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2004S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2004S() {	 
			return (getShort(beginIp65504P2004S));
   	}
         int localIp65504P2004LCounter = -1;
         public boolean isIp65504P2004LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2004LCounter != sharedCounter;
            localIp65504P2004LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2004_L_LEN = 2;
  	/**
	 * serializeIp65504P2004L
	 */
	protected void serializeIp65504P2004L(short ip65504P2004L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2004L,IP_65504_P_2004_L_LEN)
                  ,beginIp65504P2004L
                  ,IP_65504_P_2004_L_LEN
                 );
            localIp65504P2004LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2004LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2004L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2004L() {	 
			return (getShort(beginIp65504P2004L));
   	}
         int localIp65504P2005SCounter = -1;
         public boolean isIp65504P2005SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2005SCounter != sharedCounter;
            localIp65504P2005SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2005_S_LEN = 2;
  	/**
	 * serializeIp65504P2005S
	 */
	protected void serializeIp65504P2005S(short ip65504P2005S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2005S,IP_65504_P_2005_S_LEN)
                  ,beginIp65504P2005S
                  ,IP_65504_P_2005_S_LEN
                 );
            localIp65504P2005SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2005SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2005S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2005S() {	 
			return (getShort(beginIp65504P2005S));
   	}
         int localIp65504P2005LCounter = -1;
         public boolean isIp65504P2005LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2005LCounter != sharedCounter;
            localIp65504P2005LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2005_L_LEN = 2;
  	/**
	 * serializeIp65504P2005L
	 */
	protected void serializeIp65504P2005L(short ip65504P2005L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2005L,IP_65504_P_2005_L_LEN)
                  ,beginIp65504P2005L
                  ,IP_65504_P_2005_L_LEN
                 );
            localIp65504P2005LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2005LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2005L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2005L() {	 
			return (getShort(beginIp65504P2005L));
   	}
         int localIp65504P2006SCounter = -1;
         public boolean isIp65504P2006SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2006SCounter != sharedCounter;
            localIp65504P2006SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2006_S_LEN = 2;
  	/**
	 * serializeIp65504P2006S
	 */
	protected void serializeIp65504P2006S(short ip65504P2006S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2006S,IP_65504_P_2006_S_LEN)
                  ,beginIp65504P2006S
                  ,IP_65504_P_2006_S_LEN
                 );
            localIp65504P2006SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2006SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2006S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2006S() {	 
			return (getShort(beginIp65504P2006S));
   	}
         int localIp65504P2006LCounter = -1;
         public boolean isIp65504P2006LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2006LCounter != sharedCounter;
            localIp65504P2006LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2006_L_LEN = 2;
  	/**
	 * serializeIp65504P2006L
	 */
	protected void serializeIp65504P2006L(short ip65504P2006L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2006L,IP_65504_P_2006_L_LEN)
                  ,beginIp65504P2006L
                  ,IP_65504_P_2006_L_LEN
                 );
            localIp65504P2006LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2006LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2006L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2006L() {	 
			return (getShort(beginIp65504P2006L));
   	}
         int localIp65504P2007SCounter = -1;
         public boolean isIp65504P2007SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2007SCounter != sharedCounter;
            localIp65504P2007SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2007_S_LEN = 2;
  	/**
	 * serializeIp65504P2007S
	 */
	protected void serializeIp65504P2007S(short ip65504P2007S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2007S,IP_65504_P_2007_S_LEN)
                  ,beginIp65504P2007S
                  ,IP_65504_P_2007_S_LEN
                 );
            localIp65504P2007SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2007SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2007S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2007S() {	 
			return (getShort(beginIp65504P2007S));
   	}
         int localIp65504P2007LCounter = -1;
         public boolean isIp65504P2007LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2007LCounter != sharedCounter;
            localIp65504P2007LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2007_L_LEN = 2;
  	/**
	 * serializeIp65504P2007L
	 */
	protected void serializeIp65504P2007L(short ip65504P2007L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2007L,IP_65504_P_2007_L_LEN)
                  ,beginIp65504P2007L
                  ,IP_65504_P_2007_L_LEN
                 );
            localIp65504P2007LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2007LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2007L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2007L() {	 
			return (getShort(beginIp65504P2007L));
   	}
         int localIp65504P2008SCounter = -1;
         public boolean isIp65504P2008SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2008SCounter != sharedCounter;
            localIp65504P2008SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2008_S_LEN = 2;
  	/**
	 * serializeIp65504P2008S
	 */
	protected void serializeIp65504P2008S(short ip65504P2008S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2008S,IP_65504_P_2008_S_LEN)
                  ,beginIp65504P2008S
                  ,IP_65504_P_2008_S_LEN
                 );
            localIp65504P2008SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2008SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2008S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2008S() {	 
			return (getShort(beginIp65504P2008S));
   	}
         int localIp65504P2008LCounter = -1;
         public boolean isIp65504P2008LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2008LCounter != sharedCounter;
            localIp65504P2008LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2008_L_LEN = 2;
  	/**
	 * serializeIp65504P2008L
	 */
	protected void serializeIp65504P2008L(short ip65504P2008L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2008L,IP_65504_P_2008_L_LEN)
                  ,beginIp65504P2008L
                  ,IP_65504_P_2008_L_LEN
                 );
            localIp65504P2008LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2008LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2008L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2008L() {	 
			return (getShort(beginIp65504P2008L));
   	}
         int localIp65504P2009SCounter = -1;
         public boolean isIp65504P2009SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2009SCounter != sharedCounter;
            localIp65504P2009SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2009_S_LEN = 2;
  	/**
	 * serializeIp65504P2009S
	 */
	protected void serializeIp65504P2009S(short ip65504P2009S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2009S,IP_65504_P_2009_S_LEN)
                  ,beginIp65504P2009S
                  ,IP_65504_P_2009_S_LEN
                 );
            localIp65504P2009SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2009SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2009S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2009S() {	 
			return (getShort(beginIp65504P2009S));
   	}
         int localIp65504P2009LCounter = -1;
         public boolean isIp65504P2009LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2009LCounter != sharedCounter;
            localIp65504P2009LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2009_L_LEN = 2;
  	/**
	 * serializeIp65504P2009L
	 */
	protected void serializeIp65504P2009L(short ip65504P2009L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2009L,IP_65504_P_2009_L_LEN)
                  ,beginIp65504P2009L
                  ,IP_65504_P_2009_L_LEN
                 );
            localIp65504P2009LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2009LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2009L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2009L() {	 
			return (getShort(beginIp65504P2009L));
   	}
         int localIp65504P2010SCounter = -1;
         public boolean isIp65504P2010SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2010SCounter != sharedCounter;
            localIp65504P2010SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2010_S_LEN = 2;
  	/**
	 * serializeIp65504P2010S
	 */
	protected void serializeIp65504P2010S(short ip65504P2010S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2010S,IP_65504_P_2010_S_LEN)
                  ,beginIp65504P2010S
                  ,IP_65504_P_2010_S_LEN
                 );
            localIp65504P2010SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2010SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2010S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2010S() {	 
			return (getShort(beginIp65504P2010S));
   	}
         int localIp65504P2010LCounter = -1;
         public boolean isIp65504P2010LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2010LCounter != sharedCounter;
            localIp65504P2010LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2010_L_LEN = 2;
  	/**
	 * serializeIp65504P2010L
	 */
	protected void serializeIp65504P2010L(short ip65504P2010L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2010L,IP_65504_P_2010_L_LEN)
                  ,beginIp65504P2010L
                  ,IP_65504_P_2010_L_LEN
                 );
            localIp65504P2010LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2010LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2010L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2010L() {	 
			return (getShort(beginIp65504P2010L));
   	}
         int localIp65504P2011SCounter = -1;
         public boolean isIp65504P2011SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2011SCounter != sharedCounter;
            localIp65504P2011SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2011_S_LEN = 2;
  	/**
	 * serializeIp65504P2011S
	 */
	protected void serializeIp65504P2011S(short ip65504P2011S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2011S,IP_65504_P_2011_S_LEN)
                  ,beginIp65504P2011S
                  ,IP_65504_P_2011_S_LEN
                 );
            localIp65504P2011SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2011SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2011S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2011S() {	 
			return (getShort(beginIp65504P2011S));
   	}
         int localIp65504P2011LCounter = -1;
         public boolean isIp65504P2011LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2011LCounter != sharedCounter;
            localIp65504P2011LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2011_L_LEN = 2;
  	/**
	 * serializeIp65504P2011L
	 */
	protected void serializeIp65504P2011L(short ip65504P2011L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2011L,IP_65504_P_2011_L_LEN)
                  ,beginIp65504P2011L
                  ,IP_65504_P_2011_L_LEN
                 );
            localIp65504P2011LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2011LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2011L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2011L() {	 
			return (getShort(beginIp65504P2011L));
   	}
         int localIp65504P2012SCounter = -1;
         public boolean isIp65504P2012SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2012SCounter != sharedCounter;
            localIp65504P2012SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2012_S_LEN = 2;
  	/**
	 * serializeIp65504P2012S
	 */
	protected void serializeIp65504P2012S(short ip65504P2012S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2012S,IP_65504_P_2012_S_LEN)
                  ,beginIp65504P2012S
                  ,IP_65504_P_2012_S_LEN
                 );
            localIp65504P2012SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2012SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2012S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2012S() {	 
			return (getShort(beginIp65504P2012S));
   	}
         int localIp65504P2012LCounter = -1;
         public boolean isIp65504P2012LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2012LCounter != sharedCounter;
            localIp65504P2012LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2012_L_LEN = 2;
  	/**
	 * serializeIp65504P2012L
	 */
	protected void serializeIp65504P2012L(short ip65504P2012L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2012L,IP_65504_P_2012_L_LEN)
                  ,beginIp65504P2012L
                  ,IP_65504_P_2012_L_LEN
                 );
            localIp65504P2012LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2012LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2012L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2012L() {	 
			return (getShort(beginIp65504P2012L));
   	}
         int localIp65504P2013SCounter = -1;
         public boolean isIp65504P2013SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2013SCounter != sharedCounter;
            localIp65504P2013SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2013_S_LEN = 2;
  	/**
	 * serializeIp65504P2013S
	 */
	protected void serializeIp65504P2013S(short ip65504P2013S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2013S,IP_65504_P_2013_S_LEN)
                  ,beginIp65504P2013S
                  ,IP_65504_P_2013_S_LEN
                 );
            localIp65504P2013SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2013SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2013S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2013S() {	 
			return (getShort(beginIp65504P2013S));
   	}
         int localIp65504P2013LCounter = -1;
         public boolean isIp65504P2013LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2013LCounter != sharedCounter;
            localIp65504P2013LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2013_L_LEN = 2;
  	/**
	 * serializeIp65504P2013L
	 */
	protected void serializeIp65504P2013L(short ip65504P2013L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2013L,IP_65504_P_2013_L_LEN)
                  ,beginIp65504P2013L
                  ,IP_65504_P_2013_L_LEN
                 );
            localIp65504P2013LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2013LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2013L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2013L() {	 
			return (getShort(beginIp65504P2013L));
   	}
         int localIp65504P2014SCounter = -1;
         public boolean isIp65504P2014SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2014SCounter != sharedCounter;
            localIp65504P2014SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2014_S_LEN = 2;
  	/**
	 * serializeIp65504P2014S
	 */
	protected void serializeIp65504P2014S(short ip65504P2014S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2014S,IP_65504_P_2014_S_LEN)
                  ,beginIp65504P2014S
                  ,IP_65504_P_2014_S_LEN
                 );
            localIp65504P2014SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2014SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2014S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2014S() {	 
			return (getShort(beginIp65504P2014S));
   	}
         int localIp65504P2014LCounter = -1;
         public boolean isIp65504P2014LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2014LCounter != sharedCounter;
            localIp65504P2014LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2014_L_LEN = 2;
  	/**
	 * serializeIp65504P2014L
	 */
	protected void serializeIp65504P2014L(short ip65504P2014L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2014L,IP_65504_P_2014_L_LEN)
                  ,beginIp65504P2014L
                  ,IP_65504_P_2014_L_LEN
                 );
            localIp65504P2014LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2014LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2014L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2014L() {	 
			return (getShort(beginIp65504P2014L));
   	}
         int localIp65504P2015SCounter = -1;
         public boolean isIp65504P2015SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2015SCounter != sharedCounter;
            localIp65504P2015SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2015_S_LEN = 2;
  	/**
	 * serializeIp65504P2015S
	 */
	protected void serializeIp65504P2015S(short ip65504P2015S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2015S,IP_65504_P_2015_S_LEN)
                  ,beginIp65504P2015S
                  ,IP_65504_P_2015_S_LEN
                 );
            localIp65504P2015SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2015SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2015S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2015S() {	 
			return (getShort(beginIp65504P2015S));
   	}
         int localIp65504P2015LCounter = -1;
         public boolean isIp65504P2015LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2015LCounter != sharedCounter;
            localIp65504P2015LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2015_L_LEN = 2;
  	/**
	 * serializeIp65504P2015L
	 */
	protected void serializeIp65504P2015L(short ip65504P2015L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2015L,IP_65504_P_2015_L_LEN)
                  ,beginIp65504P2015L
                  ,IP_65504_P_2015_L_LEN
                 );
            localIp65504P2015LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2015LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2015L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2015L() {	 
			return (getShort(beginIp65504P2015L));
   	}




}
  
