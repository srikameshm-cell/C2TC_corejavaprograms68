package day5_.multilevelinheritance.texteditor;

public class Word extends Wordpad {
    private boolean spellCheckEnabled;

    public Word() {
        super();
        this.spellCheckEnabled = true;
    }

    public void spellCheck() {
        if (spellCheckEnabled) {
            System.out.println("Running spell check...");
            // Simulate spell check logic here
        } else {
            System.out.println("Spell check is disabled.");
        }
    }

    public void enableSpellCheck(boolean enable) {
        spellCheckEnabled = enable;
    }

	public void write(String text) {
		// TODO Auto-generated method stub
		
	}

	public void formatText(boolean bold) {
		// TODO Auto-generated method stub
		
	}

	public void displayContent1() {
		// TODO Auto-generated method stub
		
	}

	public void displayContent() {
		// TODO Auto-generated method stub
		
	}

	public boolean isBold() {
		// TODO Auto-generated method stub
		return (Boolean) null;
	}

	public String isBold11() {
		// TODO Auto-generated method stub
		return null;
	}

	public String isBold1() {
		// TODO Auto-generated method stub
		return null;
	}
}
