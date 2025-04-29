package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlgusInEocRefBlData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FlgusInEocRefBlData extends FlgusInEocRefBlDataSerialized {
   
				@Getter @Setter private FlgusInEocRefBlDtl flgusInEocRefBlDtl = new FlgusInEocRefBlDtl();
				@Getter @Setter private FlgusInEocRefBlMsg flgusInEocRefBlMsg = new FlgusInEocRefBlMsg();
				@Getter @Setter private FlgusInEocTgp flgusInEocTgp = new FlgusInEocTgp();
				@Getter @Setter private FlgusInEocRefBlHdr flgusInEocRefBlHdr = new FlgusInEocRefBlHdr();
				@Getter @Setter private FlgusInEocRefBlTlr flgusInEocRefBlTlr = new FlgusInEocRefBlTlr();
	
	/**
	* Constructor for FlgusInEocRefBlData
	**/
    public FlgusInEocRefBlData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getFlgusInEocRefBlDtl().setParent(this,getStartOffset() + 0);
					getFlgusInEocRefBlMsg().setParent(this,getStartOffset() + 0);
					getFlgusInEocTgp().setParent(this,getStartOffset() + 0);
					getFlgusInEocRefBlHdr().setParent(this,getStartOffset() + 0);
					getFlgusInEocRefBlTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
