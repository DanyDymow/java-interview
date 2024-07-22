package Factory;

public abstract class Factory {

    public void renderButton() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
