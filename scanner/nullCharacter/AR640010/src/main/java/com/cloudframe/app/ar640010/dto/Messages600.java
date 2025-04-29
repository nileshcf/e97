package com.cloudframe.app.ar640010.dto;

/**
*  The class Messages600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Messages600 extends Messages600Serialized {
   
				@Getter @Setter private MsgPrefix600 msgPrefix600 = new MsgPrefix600();
				@Getter @Setter private XtkDefaultMsg600 xtkDefaultMsg600 = new XtkDefaultMsg600();
				@Getter @Setter private XtkAssignMsg600 xtkAssignMsg600 = new XtkAssignMsg600();
				@Getter @Setter private XtkMsg1600 xtkMsg1600 = new XtkMsg1600();
				@Getter @Setter private XtkMsg2600 xtkMsg2600 = new XtkMsg2600();
				@Getter @Setter private ProgramMsg600 programMsg600 = new ProgramMsg600();
				@Getter @Setter private CompileMsg600 compileMsg600 = new CompileMsg600();
				@Getter @Setter private CurrentMsg600 currentMsg600 = new CurrentMsg600();
				@Getter @Setter private TsSuffix600 tsSuffix600 = new TsSuffix600();
	
	/**
	* Constructor for Messages600
	**/
    public Messages600() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMsgPrefix600().setParent(this,getStartOffset() + 0);
					getXtkDefaultMsg600().setParent(this,getStartOffset() + 9);
					getXtkAssignMsg600().setParent(this,getStartOffset() + 66);
					getXtkMsg1600().setParent(this,getStartOffset() + 123);
					getXtkMsg2600().setParent(this,getStartOffset() + 184);
					getProgramMsg600().setParent(this,getStartOffset() + 241);
					getCompileMsg600().setParent(this,getStartOffset() + 277);
					getCurrentMsg600().setParent(this,getStartOffset() + 322);
					getTsSuffix600().setParent(this,getStartOffset() + 367);
	   	/*  end of offset */
    }





}
  
