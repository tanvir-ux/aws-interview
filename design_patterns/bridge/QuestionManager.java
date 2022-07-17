class QuestionManager {
    protected Question q;
    public String catalog;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }

    public void next() {
        q.nextQuestion();
    }

    public void prev() {
        q.previousQuestion();
    }

    public void newOne(String ques) {
        q.newQuestion(ques);
    }

    public void delete(String ques) {
        q.deleteQuestion(ques);
    }

    public void display() {
        q.displayQuestion();
    }

    public void displayAll() {
        System.out.println("Question Paper: " + catalog);
        q.displayAllQuestions();
    }
}

