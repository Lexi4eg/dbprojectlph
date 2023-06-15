@FXML
private void handleBtnSaveAction(ActionEvent event) {
        Person p = cbPersons.getSelectionModel().getSelectedItem();

        if (p == null)
            return;

        p.setLastName(tfLastName.getText());
        p.setFirstName(tfFirstName.getText());
        p.setdpGebd(dpBDate.getDate());

        int inx = cbPersons.getSelectionModel().getSelectedIndex();
        persons.set(inx, p);

        }