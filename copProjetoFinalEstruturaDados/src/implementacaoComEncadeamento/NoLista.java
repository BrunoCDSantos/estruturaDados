/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacaoComEncadeamento;

public class NoLista<T> {

    private T info;
    private NoLista last;

    public NoLista(T info, NoLista last) {
        this.info = info;
        this.last = last;
    }

    public T getInfo() {
        return this.info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void setLast(NoLista<?> last) {
        this.last = last;
    }

    public NoLista getLast() {
        return this.last;
    }
}
