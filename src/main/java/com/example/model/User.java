package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "test")
public class User {
	@Id
	private int id;
	
	@Column(length = 20, nullable = false)
	private String valueString;
	
//	https://qiita.com/ughirose/items/5d691adc677aa08636b8
//	アノテーション	機能・意味合い
//	@Entity	Entityクラス
//	@Table(name = "hoge")	テーブル名
//	@Table(name="foo", schema="bar")	テーブル名とスキーマ名
//	@Id	主キーを指定
//	@EmbeddedId	複合主キー（with @Embeddableクラス）
//	@Embeddable	Serializableを継承した主キーをもつクラス
//	@IdClass(MimaKey.class)	複合主キーをもつクラス（EmbeddedIDと別）
//	@Column(name = "hoge")	カラム名
//	@Column(name = "hoge" ,length = 10)	カラム長
//	@Column(name = "hoge" ,nullable = true/false)	nullを許容/許容しない
//	@Basic(optional = true/false)	nullを許容/許容しない
//	@GeneratedValue(strategy = GenerationType.IDENTITY)	自動採番(最適設定）
//	@GeneratedValue(strategy = GenerationType.AUTO)	自動採番(DBのidentityを利用）
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ""seq_gen"")
//	@SequenceGenerator(name = ""seq_gen"", sequenceName = ""seq"", allocationSize = 1)"	自動採番(Oracle)
//	@Temporal(TemporalType.DATE)	日付
//	@Temporal(TemporalType.TIME)	時刻
//	@Temporal(TemporalType.TIMESTAMP)	日付と時刻
//	@Transient	永続化対象外
//	@Enumerated(EnumType.STRING)	Enumの文字列
//	@ElementCollection	基本型のコレクション型
//	@ElementCollection(fetch = FetchType.EAGER)	基本型のコレクション型を即時ロード
//	@CollectionTable	コレクションの要素を取得するテーブル（"エンティティ名_フィールド名"）
//	@CollectionTable(name = "hoge")	コレクションの要素を取得するテーブル
//	@Column(name = "value")	カラムを指定
//	@OrderBy("DESC")	ソート条件（降順）
//	@CollectionTable(name = "hoge", joinColumns = @JoinColumn(name = "value") )	結合
//	@MappedSuperclass	子クラスがEntitiyのときの親クラス
//	@ManyToOne	多対一関連定義
//	@OneToMany(mappedBy = "hoge")	一対多関連定義
//	@OneToOne(mappedBy = "hoge")	一対一関連定義
//	@JoinColumn(name = "hoge")	結合に用いるカラムを指定
}
