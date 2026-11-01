class Solution {
    public boolean verif(char[][] board, int i, int j, int tenta){
        char tentative = Character.forDigit(tenta, 10);
        int ligneUnite = i/3*3;
        int colonneUnite = j/3*3;
        for(int iLigne = ligneUnite; iLigne<ligneUnite+3; iLigne++){
            for(int iColonne = colonneUnite; iColonne<colonneUnite+3; iColonne++){
                if(board[iLigne][iColonne] != '.'){
                    if(board[iLigne][iColonne] == tentative){
                        return false;
                    }
                }
            }
        }
        for(int li = 0; li < 9; li++){
           if(board[li][j] == tentative){
                return false;
            }
            if(board[i][li] == tentative){
                return false;
            }
        }
        return true;
    }
    public boolean testRemplissage(char[][] board){
        int compteur = 0;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] != '.'){
                    compteur++;
                }
            }
        }
        if(compteur == 81){
            return true;
        } else{
            return false;
        }
    }
    public void solveSudoku(char[][] board) {
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == '.'){
                    for(int tentative = 1; tentative<10; tentative++){
                        if(verif(board, i, j, tentative)){
                            board[i][j] = Character.forDigit(tentative, 10);
                            solveSudoku(board);
                        }
                    }
                    if(testRemplissage(board)){
                        return;
                    }
                    board[i][j] = '.';
                    return;
                }
            }
        }

    }
}