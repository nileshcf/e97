package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup85Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup85Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup85Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_85_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2605S;
            protected  int beginIp65504P2605L;
            protected  int beginIp65504P2606S;
            protected  int beginIp65504P2606L;
            protected  int beginIp65504P2607S;
            protected  int beginIp65504P2607L;
            protected  int beginIp65504P2608S;
            protected  int beginIp65504P2608L;
            protected  int beginIp65504P2609S;
            protected  int beginIp65504P2609L;
            protected  int beginIp65504P2610S;
            protected  int beginIp65504P2610L;
            protected  int beginIp65504P2611S;
            protected  int beginIp65504P2611L;
            protected  int beginIp65504P2612S;
            protected  int beginIp65504P2612L;
            protected  int beginIp65504P2613S;
            protected  int beginIp65504P2613L;
            protected  int beginIp65504P2614S;
            protected  int beginIp65504P2614L;
            protected  int beginIp65504P2615S;
            protected  int beginIp65504P2615L;
            protected  int beginIp65504P2616S;
            protected  int beginIp65504P2616L;
            protected  int beginIp65504P2617S;
            protected  int beginIp65504P2617L;
            protected  int beginIp65504P2618S;
            protected  int beginIp65504P2618L;
            protected  int beginIp65504P2619S;
            protected  int beginIp65504P2619L;
            protected  int beginIp65504P2620S;
            protected  int beginIp65504P2620L;
            protected  int beginIp65504P2621S;
            protected  int beginIp65504P2621L;
            protected  int beginIp65504P2622S;
            protected  int beginIp65504P2622L;
            protected  int beginIp65504P2623S;
            protected  int beginIp65504P2623L;
            protected  int beginIp65504P2624S;
            protected  int beginIp65504P2624L;
            protected  int beginIp65504P2625S;
            protected  int beginIp65504P2625L;
            protected  int beginIp65504P2626S;
            protected  int beginIp65504P2626L;
            protected  int beginIp65504P2627S;
            protected  int beginIp65504P2627L;
            protected  int beginIp65504P2628S;
            protected  int beginIp65504P2628L;
            protected  int beginIp65504P2629S;
            protected  int beginIp65504P2629L;
            protected  int beginIp65504P2630S;
            protected  int beginIp65504P2630L;
            protected  int beginIp65504P2631S;
            protected  int beginIp65504P2631L;
            protected  int beginIp65504P2632S;
            protected  int beginIp65504P2632L;
            protected  int beginIp65504P2633S;
            protected  int beginIp65504P2633L;
            protected  int beginIp65504P2634S;
            protected  int beginIp65504P2634L;
            protected  int beginIp65504P2635S;
            protected  int beginIp65504P2635L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup85Serialized
	**/
    public Ip65504PdsNamesLargeGroup85Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup85Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup85Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup85Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,20828); // serialize this field at offset 20828 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup85Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 20828 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup85Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_85_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2605S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2605L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2606S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2606L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2607S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2607L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2608S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2608L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2609S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2609L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2610S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2610L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2611S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2611L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2612S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2612L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2613S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2613L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2614S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2614L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2615S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2615L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2616S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2616L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2617S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2617L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2618S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2618L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2619S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2619L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2620S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2620L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2621S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2621L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2622S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2622L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2623S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2623L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2624S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2624L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2625S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2625L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2626S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2626L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2627S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2627L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2628S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2628L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2629S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2629L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2630S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2630L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2631S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2631L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2632S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2632L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2633S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2633L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2634S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2634L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2635S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2635L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2605SCounter = -1;
         public boolean isIp65504P2605SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2605SCounter != sharedCounter;
            localIp65504P2605SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2605_S_LEN = 2;
  	/**
	 * serializeIp65504P2605S
	 */
	protected void serializeIp65504P2605S(short ip65504P2605S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2605S,IP_65504_P_2605_S_LEN)
                  ,beginIp65504P2605S
                  ,IP_65504_P_2605_S_LEN
                 );
            localIp65504P2605SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2605SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2605S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2605S() {	 
			return (getShort(beginIp65504P2605S));
   	}
         int localIp65504P2605LCounter = -1;
         public boolean isIp65504P2605LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2605LCounter != sharedCounter;
            localIp65504P2605LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2605_L_LEN = 2;
  	/**
	 * serializeIp65504P2605L
	 */
	protected void serializeIp65504P2605L(short ip65504P2605L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2605L,IP_65504_P_2605_L_LEN)
                  ,beginIp65504P2605L
                  ,IP_65504_P_2605_L_LEN
                 );
            localIp65504P2605LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2605LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2605L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2605L() {	 
			return (getShort(beginIp65504P2605L));
   	}
         int localIp65504P2606SCounter = -1;
         public boolean isIp65504P2606SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2606SCounter != sharedCounter;
            localIp65504P2606SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2606_S_LEN = 2;
  	/**
	 * serializeIp65504P2606S
	 */
	protected void serializeIp65504P2606S(short ip65504P2606S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2606S,IP_65504_P_2606_S_LEN)
                  ,beginIp65504P2606S
                  ,IP_65504_P_2606_S_LEN
                 );
            localIp65504P2606SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2606SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2606S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2606S() {	 
			return (getShort(beginIp65504P2606S));
   	}
         int localIp65504P2606LCounter = -1;
         public boolean isIp65504P2606LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2606LCounter != sharedCounter;
            localIp65504P2606LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2606_L_LEN = 2;
  	/**
	 * serializeIp65504P2606L
	 */
	protected void serializeIp65504P2606L(short ip65504P2606L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2606L,IP_65504_P_2606_L_LEN)
                  ,beginIp65504P2606L
                  ,IP_65504_P_2606_L_LEN
                 );
            localIp65504P2606LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2606LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2606L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2606L() {	 
			return (getShort(beginIp65504P2606L));
   	}
         int localIp65504P2607SCounter = -1;
         public boolean isIp65504P2607SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2607SCounter != sharedCounter;
            localIp65504P2607SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2607_S_LEN = 2;
  	/**
	 * serializeIp65504P2607S
	 */
	protected void serializeIp65504P2607S(short ip65504P2607S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2607S,IP_65504_P_2607_S_LEN)
                  ,beginIp65504P2607S
                  ,IP_65504_P_2607_S_LEN
                 );
            localIp65504P2607SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2607SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2607S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2607S() {	 
			return (getShort(beginIp65504P2607S));
   	}
         int localIp65504P2607LCounter = -1;
         public boolean isIp65504P2607LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2607LCounter != sharedCounter;
            localIp65504P2607LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2607_L_LEN = 2;
  	/**
	 * serializeIp65504P2607L
	 */
	protected void serializeIp65504P2607L(short ip65504P2607L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2607L,IP_65504_P_2607_L_LEN)
                  ,beginIp65504P2607L
                  ,IP_65504_P_2607_L_LEN
                 );
            localIp65504P2607LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2607LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2607L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2607L() {	 
			return (getShort(beginIp65504P2607L));
   	}
         int localIp65504P2608SCounter = -1;
         public boolean isIp65504P2608SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2608SCounter != sharedCounter;
            localIp65504P2608SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2608_S_LEN = 2;
  	/**
	 * serializeIp65504P2608S
	 */
	protected void serializeIp65504P2608S(short ip65504P2608S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2608S,IP_65504_P_2608_S_LEN)
                  ,beginIp65504P2608S
                  ,IP_65504_P_2608_S_LEN
                 );
            localIp65504P2608SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2608SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2608S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2608S() {	 
			return (getShort(beginIp65504P2608S));
   	}
         int localIp65504P2608LCounter = -1;
         public boolean isIp65504P2608LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2608LCounter != sharedCounter;
            localIp65504P2608LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2608_L_LEN = 2;
  	/**
	 * serializeIp65504P2608L
	 */
	protected void serializeIp65504P2608L(short ip65504P2608L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2608L,IP_65504_P_2608_L_LEN)
                  ,beginIp65504P2608L
                  ,IP_65504_P_2608_L_LEN
                 );
            localIp65504P2608LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2608LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2608L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2608L() {	 
			return (getShort(beginIp65504P2608L));
   	}
         int localIp65504P2609SCounter = -1;
         public boolean isIp65504P2609SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2609SCounter != sharedCounter;
            localIp65504P2609SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2609_S_LEN = 2;
  	/**
	 * serializeIp65504P2609S
	 */
	protected void serializeIp65504P2609S(short ip65504P2609S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2609S,IP_65504_P_2609_S_LEN)
                  ,beginIp65504P2609S
                  ,IP_65504_P_2609_S_LEN
                 );
            localIp65504P2609SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2609SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2609S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2609S() {	 
			return (getShort(beginIp65504P2609S));
   	}
         int localIp65504P2609LCounter = -1;
         public boolean isIp65504P2609LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2609LCounter != sharedCounter;
            localIp65504P2609LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2609_L_LEN = 2;
  	/**
	 * serializeIp65504P2609L
	 */
	protected void serializeIp65504P2609L(short ip65504P2609L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2609L,IP_65504_P_2609_L_LEN)
                  ,beginIp65504P2609L
                  ,IP_65504_P_2609_L_LEN
                 );
            localIp65504P2609LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2609LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2609L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2609L() {	 
			return (getShort(beginIp65504P2609L));
   	}
         int localIp65504P2610SCounter = -1;
         public boolean isIp65504P2610SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2610SCounter != sharedCounter;
            localIp65504P2610SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2610_S_LEN = 2;
  	/**
	 * serializeIp65504P2610S
	 */
	protected void serializeIp65504P2610S(short ip65504P2610S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2610S,IP_65504_P_2610_S_LEN)
                  ,beginIp65504P2610S
                  ,IP_65504_P_2610_S_LEN
                 );
            localIp65504P2610SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2610SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2610S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2610S() {	 
			return (getShort(beginIp65504P2610S));
   	}
         int localIp65504P2610LCounter = -1;
         public boolean isIp65504P2610LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2610LCounter != sharedCounter;
            localIp65504P2610LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2610_L_LEN = 2;
  	/**
	 * serializeIp65504P2610L
	 */
	protected void serializeIp65504P2610L(short ip65504P2610L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2610L,IP_65504_P_2610_L_LEN)
                  ,beginIp65504P2610L
                  ,IP_65504_P_2610_L_LEN
                 );
            localIp65504P2610LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2610LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2610L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2610L() {	 
			return (getShort(beginIp65504P2610L));
   	}
         int localIp65504P2611SCounter = -1;
         public boolean isIp65504P2611SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2611SCounter != sharedCounter;
            localIp65504P2611SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2611_S_LEN = 2;
  	/**
	 * serializeIp65504P2611S
	 */
	protected void serializeIp65504P2611S(short ip65504P2611S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2611S,IP_65504_P_2611_S_LEN)
                  ,beginIp65504P2611S
                  ,IP_65504_P_2611_S_LEN
                 );
            localIp65504P2611SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2611SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2611S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2611S() {	 
			return (getShort(beginIp65504P2611S));
   	}
         int localIp65504P2611LCounter = -1;
         public boolean isIp65504P2611LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2611LCounter != sharedCounter;
            localIp65504P2611LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2611_L_LEN = 2;
  	/**
	 * serializeIp65504P2611L
	 */
	protected void serializeIp65504P2611L(short ip65504P2611L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2611L,IP_65504_P_2611_L_LEN)
                  ,beginIp65504P2611L
                  ,IP_65504_P_2611_L_LEN
                 );
            localIp65504P2611LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2611LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2611L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2611L() {	 
			return (getShort(beginIp65504P2611L));
   	}
         int localIp65504P2612SCounter = -1;
         public boolean isIp65504P2612SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2612SCounter != sharedCounter;
            localIp65504P2612SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2612_S_LEN = 2;
  	/**
	 * serializeIp65504P2612S
	 */
	protected void serializeIp65504P2612S(short ip65504P2612S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2612S,IP_65504_P_2612_S_LEN)
                  ,beginIp65504P2612S
                  ,IP_65504_P_2612_S_LEN
                 );
            localIp65504P2612SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2612SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2612S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2612S() {	 
			return (getShort(beginIp65504P2612S));
   	}
         int localIp65504P2612LCounter = -1;
         public boolean isIp65504P2612LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2612LCounter != sharedCounter;
            localIp65504P2612LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2612_L_LEN = 2;
  	/**
	 * serializeIp65504P2612L
	 */
	protected void serializeIp65504P2612L(short ip65504P2612L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2612L,IP_65504_P_2612_L_LEN)
                  ,beginIp65504P2612L
                  ,IP_65504_P_2612_L_LEN
                 );
            localIp65504P2612LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2612LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2612L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2612L() {	 
			return (getShort(beginIp65504P2612L));
   	}
         int localIp65504P2613SCounter = -1;
         public boolean isIp65504P2613SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2613SCounter != sharedCounter;
            localIp65504P2613SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2613_S_LEN = 2;
  	/**
	 * serializeIp65504P2613S
	 */
	protected void serializeIp65504P2613S(short ip65504P2613S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2613S,IP_65504_P_2613_S_LEN)
                  ,beginIp65504P2613S
                  ,IP_65504_P_2613_S_LEN
                 );
            localIp65504P2613SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2613SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2613S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2613S() {	 
			return (getShort(beginIp65504P2613S));
   	}
         int localIp65504P2613LCounter = -1;
         public boolean isIp65504P2613LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2613LCounter != sharedCounter;
            localIp65504P2613LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2613_L_LEN = 2;
  	/**
	 * serializeIp65504P2613L
	 */
	protected void serializeIp65504P2613L(short ip65504P2613L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2613L,IP_65504_P_2613_L_LEN)
                  ,beginIp65504P2613L
                  ,IP_65504_P_2613_L_LEN
                 );
            localIp65504P2613LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2613LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2613L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2613L() {	 
			return (getShort(beginIp65504P2613L));
   	}
         int localIp65504P2614SCounter = -1;
         public boolean isIp65504P2614SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2614SCounter != sharedCounter;
            localIp65504P2614SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2614_S_LEN = 2;
  	/**
	 * serializeIp65504P2614S
	 */
	protected void serializeIp65504P2614S(short ip65504P2614S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2614S,IP_65504_P_2614_S_LEN)
                  ,beginIp65504P2614S
                  ,IP_65504_P_2614_S_LEN
                 );
            localIp65504P2614SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2614SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2614S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2614S() {	 
			return (getShort(beginIp65504P2614S));
   	}
         int localIp65504P2614LCounter = -1;
         public boolean isIp65504P2614LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2614LCounter != sharedCounter;
            localIp65504P2614LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2614_L_LEN = 2;
  	/**
	 * serializeIp65504P2614L
	 */
	protected void serializeIp65504P2614L(short ip65504P2614L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2614L,IP_65504_P_2614_L_LEN)
                  ,beginIp65504P2614L
                  ,IP_65504_P_2614_L_LEN
                 );
            localIp65504P2614LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2614LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2614L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2614L() {	 
			return (getShort(beginIp65504P2614L));
   	}
         int localIp65504P2615SCounter = -1;
         public boolean isIp65504P2615SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2615SCounter != sharedCounter;
            localIp65504P2615SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2615_S_LEN = 2;
  	/**
	 * serializeIp65504P2615S
	 */
	protected void serializeIp65504P2615S(short ip65504P2615S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2615S,IP_65504_P_2615_S_LEN)
                  ,beginIp65504P2615S
                  ,IP_65504_P_2615_S_LEN
                 );
            localIp65504P2615SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2615SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2615S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2615S() {	 
			return (getShort(beginIp65504P2615S));
   	}
         int localIp65504P2615LCounter = -1;
         public boolean isIp65504P2615LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2615LCounter != sharedCounter;
            localIp65504P2615LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2615_L_LEN = 2;
  	/**
	 * serializeIp65504P2615L
	 */
	protected void serializeIp65504P2615L(short ip65504P2615L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2615L,IP_65504_P_2615_L_LEN)
                  ,beginIp65504P2615L
                  ,IP_65504_P_2615_L_LEN
                 );
            localIp65504P2615LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2615LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2615L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2615L() {	 
			return (getShort(beginIp65504P2615L));
   	}
         int localIp65504P2616SCounter = -1;
         public boolean isIp65504P2616SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2616SCounter != sharedCounter;
            localIp65504P2616SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2616_S_LEN = 2;
  	/**
	 * serializeIp65504P2616S
	 */
	protected void serializeIp65504P2616S(short ip65504P2616S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2616S,IP_65504_P_2616_S_LEN)
                  ,beginIp65504P2616S
                  ,IP_65504_P_2616_S_LEN
                 );
            localIp65504P2616SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2616SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2616S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2616S() {	 
			return (getShort(beginIp65504P2616S));
   	}
         int localIp65504P2616LCounter = -1;
         public boolean isIp65504P2616LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2616LCounter != sharedCounter;
            localIp65504P2616LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2616_L_LEN = 2;
  	/**
	 * serializeIp65504P2616L
	 */
	protected void serializeIp65504P2616L(short ip65504P2616L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2616L,IP_65504_P_2616_L_LEN)
                  ,beginIp65504P2616L
                  ,IP_65504_P_2616_L_LEN
                 );
            localIp65504P2616LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2616LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2616L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2616L() {	 
			return (getShort(beginIp65504P2616L));
   	}
         int localIp65504P2617SCounter = -1;
         public boolean isIp65504P2617SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2617SCounter != sharedCounter;
            localIp65504P2617SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2617_S_LEN = 2;
  	/**
	 * serializeIp65504P2617S
	 */
	protected void serializeIp65504P2617S(short ip65504P2617S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2617S,IP_65504_P_2617_S_LEN)
                  ,beginIp65504P2617S
                  ,IP_65504_P_2617_S_LEN
                 );
            localIp65504P2617SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2617SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2617S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2617S() {	 
			return (getShort(beginIp65504P2617S));
   	}
         int localIp65504P2617LCounter = -1;
         public boolean isIp65504P2617LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2617LCounter != sharedCounter;
            localIp65504P2617LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2617_L_LEN = 2;
  	/**
	 * serializeIp65504P2617L
	 */
	protected void serializeIp65504P2617L(short ip65504P2617L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2617L,IP_65504_P_2617_L_LEN)
                  ,beginIp65504P2617L
                  ,IP_65504_P_2617_L_LEN
                 );
            localIp65504P2617LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2617LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2617L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2617L() {	 
			return (getShort(beginIp65504P2617L));
   	}
         int localIp65504P2618SCounter = -1;
         public boolean isIp65504P2618SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2618SCounter != sharedCounter;
            localIp65504P2618SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2618_S_LEN = 2;
  	/**
	 * serializeIp65504P2618S
	 */
	protected void serializeIp65504P2618S(short ip65504P2618S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2618S,IP_65504_P_2618_S_LEN)
                  ,beginIp65504P2618S
                  ,IP_65504_P_2618_S_LEN
                 );
            localIp65504P2618SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2618SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2618S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2618S() {	 
			return (getShort(beginIp65504P2618S));
   	}
         int localIp65504P2618LCounter = -1;
         public boolean isIp65504P2618LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2618LCounter != sharedCounter;
            localIp65504P2618LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2618_L_LEN = 2;
  	/**
	 * serializeIp65504P2618L
	 */
	protected void serializeIp65504P2618L(short ip65504P2618L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2618L,IP_65504_P_2618_L_LEN)
                  ,beginIp65504P2618L
                  ,IP_65504_P_2618_L_LEN
                 );
            localIp65504P2618LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2618LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2618L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2618L() {	 
			return (getShort(beginIp65504P2618L));
   	}
         int localIp65504P2619SCounter = -1;
         public boolean isIp65504P2619SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2619SCounter != sharedCounter;
            localIp65504P2619SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2619_S_LEN = 2;
  	/**
	 * serializeIp65504P2619S
	 */
	protected void serializeIp65504P2619S(short ip65504P2619S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2619S,IP_65504_P_2619_S_LEN)
                  ,beginIp65504P2619S
                  ,IP_65504_P_2619_S_LEN
                 );
            localIp65504P2619SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2619SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2619S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2619S() {	 
			return (getShort(beginIp65504P2619S));
   	}
         int localIp65504P2619LCounter = -1;
         public boolean isIp65504P2619LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2619LCounter != sharedCounter;
            localIp65504P2619LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2619_L_LEN = 2;
  	/**
	 * serializeIp65504P2619L
	 */
	protected void serializeIp65504P2619L(short ip65504P2619L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2619L,IP_65504_P_2619_L_LEN)
                  ,beginIp65504P2619L
                  ,IP_65504_P_2619_L_LEN
                 );
            localIp65504P2619LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2619LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2619L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2619L() {	 
			return (getShort(beginIp65504P2619L));
   	}
         int localIp65504P2620SCounter = -1;
         public boolean isIp65504P2620SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2620SCounter != sharedCounter;
            localIp65504P2620SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2620_S_LEN = 2;
  	/**
	 * serializeIp65504P2620S
	 */
	protected void serializeIp65504P2620S(short ip65504P2620S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2620S,IP_65504_P_2620_S_LEN)
                  ,beginIp65504P2620S
                  ,IP_65504_P_2620_S_LEN
                 );
            localIp65504P2620SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2620SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2620S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2620S() {	 
			return (getShort(beginIp65504P2620S));
   	}
         int localIp65504P2620LCounter = -1;
         public boolean isIp65504P2620LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2620LCounter != sharedCounter;
            localIp65504P2620LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2620_L_LEN = 2;
  	/**
	 * serializeIp65504P2620L
	 */
	protected void serializeIp65504P2620L(short ip65504P2620L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2620L,IP_65504_P_2620_L_LEN)
                  ,beginIp65504P2620L
                  ,IP_65504_P_2620_L_LEN
                 );
            localIp65504P2620LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2620LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2620L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2620L() {	 
			return (getShort(beginIp65504P2620L));
   	}
         int localIp65504P2621SCounter = -1;
         public boolean isIp65504P2621SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2621SCounter != sharedCounter;
            localIp65504P2621SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2621_S_LEN = 2;
  	/**
	 * serializeIp65504P2621S
	 */
	protected void serializeIp65504P2621S(short ip65504P2621S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2621S,IP_65504_P_2621_S_LEN)
                  ,beginIp65504P2621S
                  ,IP_65504_P_2621_S_LEN
                 );
            localIp65504P2621SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2621SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2621S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2621S() {	 
			return (getShort(beginIp65504P2621S));
   	}
         int localIp65504P2621LCounter = -1;
         public boolean isIp65504P2621LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2621LCounter != sharedCounter;
            localIp65504P2621LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2621_L_LEN = 2;
  	/**
	 * serializeIp65504P2621L
	 */
	protected void serializeIp65504P2621L(short ip65504P2621L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2621L,IP_65504_P_2621_L_LEN)
                  ,beginIp65504P2621L
                  ,IP_65504_P_2621_L_LEN
                 );
            localIp65504P2621LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2621LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2621L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2621L() {	 
			return (getShort(beginIp65504P2621L));
   	}
         int localIp65504P2622SCounter = -1;
         public boolean isIp65504P2622SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2622SCounter != sharedCounter;
            localIp65504P2622SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2622_S_LEN = 2;
  	/**
	 * serializeIp65504P2622S
	 */
	protected void serializeIp65504P2622S(short ip65504P2622S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2622S,IP_65504_P_2622_S_LEN)
                  ,beginIp65504P2622S
                  ,IP_65504_P_2622_S_LEN
                 );
            localIp65504P2622SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2622SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2622S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2622S() {	 
			return (getShort(beginIp65504P2622S));
   	}
         int localIp65504P2622LCounter = -1;
         public boolean isIp65504P2622LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2622LCounter != sharedCounter;
            localIp65504P2622LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2622_L_LEN = 2;
  	/**
	 * serializeIp65504P2622L
	 */
	protected void serializeIp65504P2622L(short ip65504P2622L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2622L,IP_65504_P_2622_L_LEN)
                  ,beginIp65504P2622L
                  ,IP_65504_P_2622_L_LEN
                 );
            localIp65504P2622LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2622LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2622L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2622L() {	 
			return (getShort(beginIp65504P2622L));
   	}
         int localIp65504P2623SCounter = -1;
         public boolean isIp65504P2623SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2623SCounter != sharedCounter;
            localIp65504P2623SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2623_S_LEN = 2;
  	/**
	 * serializeIp65504P2623S
	 */
	protected void serializeIp65504P2623S(short ip65504P2623S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2623S,IP_65504_P_2623_S_LEN)
                  ,beginIp65504P2623S
                  ,IP_65504_P_2623_S_LEN
                 );
            localIp65504P2623SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2623SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2623S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2623S() {	 
			return (getShort(beginIp65504P2623S));
   	}
         int localIp65504P2623LCounter = -1;
         public boolean isIp65504P2623LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2623LCounter != sharedCounter;
            localIp65504P2623LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2623_L_LEN = 2;
  	/**
	 * serializeIp65504P2623L
	 */
	protected void serializeIp65504P2623L(short ip65504P2623L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2623L,IP_65504_P_2623_L_LEN)
                  ,beginIp65504P2623L
                  ,IP_65504_P_2623_L_LEN
                 );
            localIp65504P2623LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2623LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2623L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2623L() {	 
			return (getShort(beginIp65504P2623L));
   	}
         int localIp65504P2624SCounter = -1;
         public boolean isIp65504P2624SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2624SCounter != sharedCounter;
            localIp65504P2624SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2624_S_LEN = 2;
  	/**
	 * serializeIp65504P2624S
	 */
	protected void serializeIp65504P2624S(short ip65504P2624S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2624S,IP_65504_P_2624_S_LEN)
                  ,beginIp65504P2624S
                  ,IP_65504_P_2624_S_LEN
                 );
            localIp65504P2624SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2624SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2624S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2624S() {	 
			return (getShort(beginIp65504P2624S));
   	}
         int localIp65504P2624LCounter = -1;
         public boolean isIp65504P2624LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2624LCounter != sharedCounter;
            localIp65504P2624LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2624_L_LEN = 2;
  	/**
	 * serializeIp65504P2624L
	 */
	protected void serializeIp65504P2624L(short ip65504P2624L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2624L,IP_65504_P_2624_L_LEN)
                  ,beginIp65504P2624L
                  ,IP_65504_P_2624_L_LEN
                 );
            localIp65504P2624LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2624LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2624L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2624L() {	 
			return (getShort(beginIp65504P2624L));
   	}
         int localIp65504P2625SCounter = -1;
         public boolean isIp65504P2625SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2625SCounter != sharedCounter;
            localIp65504P2625SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2625_S_LEN = 2;
  	/**
	 * serializeIp65504P2625S
	 */
	protected void serializeIp65504P2625S(short ip65504P2625S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2625S,IP_65504_P_2625_S_LEN)
                  ,beginIp65504P2625S
                  ,IP_65504_P_2625_S_LEN
                 );
            localIp65504P2625SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2625SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2625S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2625S() {	 
			return (getShort(beginIp65504P2625S));
   	}
         int localIp65504P2625LCounter = -1;
         public boolean isIp65504P2625LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2625LCounter != sharedCounter;
            localIp65504P2625LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2625_L_LEN = 2;
  	/**
	 * serializeIp65504P2625L
	 */
	protected void serializeIp65504P2625L(short ip65504P2625L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2625L,IP_65504_P_2625_L_LEN)
                  ,beginIp65504P2625L
                  ,IP_65504_P_2625_L_LEN
                 );
            localIp65504P2625LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2625LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2625L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2625L() {	 
			return (getShort(beginIp65504P2625L));
   	}
         int localIp65504P2626SCounter = -1;
         public boolean isIp65504P2626SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2626SCounter != sharedCounter;
            localIp65504P2626SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2626_S_LEN = 2;
  	/**
	 * serializeIp65504P2626S
	 */
	protected void serializeIp65504P2626S(short ip65504P2626S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2626S,IP_65504_P_2626_S_LEN)
                  ,beginIp65504P2626S
                  ,IP_65504_P_2626_S_LEN
                 );
            localIp65504P2626SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2626SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2626S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2626S() {	 
			return (getShort(beginIp65504P2626S));
   	}
         int localIp65504P2626LCounter = -1;
         public boolean isIp65504P2626LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2626LCounter != sharedCounter;
            localIp65504P2626LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2626_L_LEN = 2;
  	/**
	 * serializeIp65504P2626L
	 */
	protected void serializeIp65504P2626L(short ip65504P2626L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2626L,IP_65504_P_2626_L_LEN)
                  ,beginIp65504P2626L
                  ,IP_65504_P_2626_L_LEN
                 );
            localIp65504P2626LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2626LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2626L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2626L() {	 
			return (getShort(beginIp65504P2626L));
   	}
         int localIp65504P2627SCounter = -1;
         public boolean isIp65504P2627SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2627SCounter != sharedCounter;
            localIp65504P2627SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2627_S_LEN = 2;
  	/**
	 * serializeIp65504P2627S
	 */
	protected void serializeIp65504P2627S(short ip65504P2627S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2627S,IP_65504_P_2627_S_LEN)
                  ,beginIp65504P2627S
                  ,IP_65504_P_2627_S_LEN
                 );
            localIp65504P2627SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2627SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2627S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2627S() {	 
			return (getShort(beginIp65504P2627S));
   	}
         int localIp65504P2627LCounter = -1;
         public boolean isIp65504P2627LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2627LCounter != sharedCounter;
            localIp65504P2627LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2627_L_LEN = 2;
  	/**
	 * serializeIp65504P2627L
	 */
	protected void serializeIp65504P2627L(short ip65504P2627L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2627L,IP_65504_P_2627_L_LEN)
                  ,beginIp65504P2627L
                  ,IP_65504_P_2627_L_LEN
                 );
            localIp65504P2627LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2627LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2627L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2627L() {	 
			return (getShort(beginIp65504P2627L));
   	}
         int localIp65504P2628SCounter = -1;
         public boolean isIp65504P2628SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2628SCounter != sharedCounter;
            localIp65504P2628SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2628_S_LEN = 2;
  	/**
	 * serializeIp65504P2628S
	 */
	protected void serializeIp65504P2628S(short ip65504P2628S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2628S,IP_65504_P_2628_S_LEN)
                  ,beginIp65504P2628S
                  ,IP_65504_P_2628_S_LEN
                 );
            localIp65504P2628SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2628SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2628S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2628S() {	 
			return (getShort(beginIp65504P2628S));
   	}
         int localIp65504P2628LCounter = -1;
         public boolean isIp65504P2628LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2628LCounter != sharedCounter;
            localIp65504P2628LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2628_L_LEN = 2;
  	/**
	 * serializeIp65504P2628L
	 */
	protected void serializeIp65504P2628L(short ip65504P2628L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2628L,IP_65504_P_2628_L_LEN)
                  ,beginIp65504P2628L
                  ,IP_65504_P_2628_L_LEN
                 );
            localIp65504P2628LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2628LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2628L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2628L() {	 
			return (getShort(beginIp65504P2628L));
   	}
         int localIp65504P2629SCounter = -1;
         public boolean isIp65504P2629SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2629SCounter != sharedCounter;
            localIp65504P2629SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2629_S_LEN = 2;
  	/**
	 * serializeIp65504P2629S
	 */
	protected void serializeIp65504P2629S(short ip65504P2629S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2629S,IP_65504_P_2629_S_LEN)
                  ,beginIp65504P2629S
                  ,IP_65504_P_2629_S_LEN
                 );
            localIp65504P2629SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2629SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2629S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2629S() {	 
			return (getShort(beginIp65504P2629S));
   	}
         int localIp65504P2629LCounter = -1;
         public boolean isIp65504P2629LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2629LCounter != sharedCounter;
            localIp65504P2629LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2629_L_LEN = 2;
  	/**
	 * serializeIp65504P2629L
	 */
	protected void serializeIp65504P2629L(short ip65504P2629L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2629L,IP_65504_P_2629_L_LEN)
                  ,beginIp65504P2629L
                  ,IP_65504_P_2629_L_LEN
                 );
            localIp65504P2629LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2629LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2629L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2629L() {	 
			return (getShort(beginIp65504P2629L));
   	}
         int localIp65504P2630SCounter = -1;
         public boolean isIp65504P2630SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2630SCounter != sharedCounter;
            localIp65504P2630SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2630_S_LEN = 2;
  	/**
	 * serializeIp65504P2630S
	 */
	protected void serializeIp65504P2630S(short ip65504P2630S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2630S,IP_65504_P_2630_S_LEN)
                  ,beginIp65504P2630S
                  ,IP_65504_P_2630_S_LEN
                 );
            localIp65504P2630SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2630SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2630S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2630S() {	 
			return (getShort(beginIp65504P2630S));
   	}
         int localIp65504P2630LCounter = -1;
         public boolean isIp65504P2630LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2630LCounter != sharedCounter;
            localIp65504P2630LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2630_L_LEN = 2;
  	/**
	 * serializeIp65504P2630L
	 */
	protected void serializeIp65504P2630L(short ip65504P2630L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2630L,IP_65504_P_2630_L_LEN)
                  ,beginIp65504P2630L
                  ,IP_65504_P_2630_L_LEN
                 );
            localIp65504P2630LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2630LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2630L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2630L() {	 
			return (getShort(beginIp65504P2630L));
   	}
         int localIp65504P2631SCounter = -1;
         public boolean isIp65504P2631SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2631SCounter != sharedCounter;
            localIp65504P2631SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2631_S_LEN = 2;
  	/**
	 * serializeIp65504P2631S
	 */
	protected void serializeIp65504P2631S(short ip65504P2631S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2631S,IP_65504_P_2631_S_LEN)
                  ,beginIp65504P2631S
                  ,IP_65504_P_2631_S_LEN
                 );
            localIp65504P2631SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2631SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2631S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2631S() {	 
			return (getShort(beginIp65504P2631S));
   	}
         int localIp65504P2631LCounter = -1;
         public boolean isIp65504P2631LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2631LCounter != sharedCounter;
            localIp65504P2631LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2631_L_LEN = 2;
  	/**
	 * serializeIp65504P2631L
	 */
	protected void serializeIp65504P2631L(short ip65504P2631L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2631L,IP_65504_P_2631_L_LEN)
                  ,beginIp65504P2631L
                  ,IP_65504_P_2631_L_LEN
                 );
            localIp65504P2631LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2631LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2631L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2631L() {	 
			return (getShort(beginIp65504P2631L));
   	}
         int localIp65504P2632SCounter = -1;
         public boolean isIp65504P2632SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2632SCounter != sharedCounter;
            localIp65504P2632SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2632_S_LEN = 2;
  	/**
	 * serializeIp65504P2632S
	 */
	protected void serializeIp65504P2632S(short ip65504P2632S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2632S,IP_65504_P_2632_S_LEN)
                  ,beginIp65504P2632S
                  ,IP_65504_P_2632_S_LEN
                 );
            localIp65504P2632SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2632SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2632S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2632S() {	 
			return (getShort(beginIp65504P2632S));
   	}
         int localIp65504P2632LCounter = -1;
         public boolean isIp65504P2632LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2632LCounter != sharedCounter;
            localIp65504P2632LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2632_L_LEN = 2;
  	/**
	 * serializeIp65504P2632L
	 */
	protected void serializeIp65504P2632L(short ip65504P2632L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2632L,IP_65504_P_2632_L_LEN)
                  ,beginIp65504P2632L
                  ,IP_65504_P_2632_L_LEN
                 );
            localIp65504P2632LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2632LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2632L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2632L() {	 
			return (getShort(beginIp65504P2632L));
   	}
         int localIp65504P2633SCounter = -1;
         public boolean isIp65504P2633SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2633SCounter != sharedCounter;
            localIp65504P2633SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2633_S_LEN = 2;
  	/**
	 * serializeIp65504P2633S
	 */
	protected void serializeIp65504P2633S(short ip65504P2633S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2633S,IP_65504_P_2633_S_LEN)
                  ,beginIp65504P2633S
                  ,IP_65504_P_2633_S_LEN
                 );
            localIp65504P2633SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2633SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2633S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2633S() {	 
			return (getShort(beginIp65504P2633S));
   	}
         int localIp65504P2633LCounter = -1;
         public boolean isIp65504P2633LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2633LCounter != sharedCounter;
            localIp65504P2633LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2633_L_LEN = 2;
  	/**
	 * serializeIp65504P2633L
	 */
	protected void serializeIp65504P2633L(short ip65504P2633L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2633L,IP_65504_P_2633_L_LEN)
                  ,beginIp65504P2633L
                  ,IP_65504_P_2633_L_LEN
                 );
            localIp65504P2633LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2633LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2633L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2633L() {	 
			return (getShort(beginIp65504P2633L));
   	}
         int localIp65504P2634SCounter = -1;
         public boolean isIp65504P2634SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2634SCounter != sharedCounter;
            localIp65504P2634SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2634_S_LEN = 2;
  	/**
	 * serializeIp65504P2634S
	 */
	protected void serializeIp65504P2634S(short ip65504P2634S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2634S,IP_65504_P_2634_S_LEN)
                  ,beginIp65504P2634S
                  ,IP_65504_P_2634_S_LEN
                 );
            localIp65504P2634SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2634SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2634S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2634S() {	 
			return (getShort(beginIp65504P2634S));
   	}
         int localIp65504P2634LCounter = -1;
         public boolean isIp65504P2634LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2634LCounter != sharedCounter;
            localIp65504P2634LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2634_L_LEN = 2;
  	/**
	 * serializeIp65504P2634L
	 */
	protected void serializeIp65504P2634L(short ip65504P2634L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2634L,IP_65504_P_2634_L_LEN)
                  ,beginIp65504P2634L
                  ,IP_65504_P_2634_L_LEN
                 );
            localIp65504P2634LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2634LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2634L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2634L() {	 
			return (getShort(beginIp65504P2634L));
   	}
         int localIp65504P2635SCounter = -1;
         public boolean isIp65504P2635SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2635SCounter != sharedCounter;
            localIp65504P2635SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2635_S_LEN = 2;
  	/**
	 * serializeIp65504P2635S
	 */
	protected void serializeIp65504P2635S(short ip65504P2635S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2635S,IP_65504_P_2635_S_LEN)
                  ,beginIp65504P2635S
                  ,IP_65504_P_2635_S_LEN
                 );
            localIp65504P2635SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2635SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2635S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2635S() {	 
			return (getShort(beginIp65504P2635S));
   	}
         int localIp65504P2635LCounter = -1;
         public boolean isIp65504P2635LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2635LCounter != sharedCounter;
            localIp65504P2635LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2635_L_LEN = 2;
  	/**
	 * serializeIp65504P2635L
	 */
	protected void serializeIp65504P2635L(short ip65504P2635L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2635L,IP_65504_P_2635_L_LEN)
                  ,beginIp65504P2635L
                  ,IP_65504_P_2635_L_LEN
                 );
            localIp65504P2635LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2635LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2635L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2635L() {	 
			return (getShort(beginIp65504P2635L));
   	}




}
  
